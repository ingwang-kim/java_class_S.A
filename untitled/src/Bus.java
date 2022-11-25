public class Bus extends Transport{
    int maxPassenger; //전체 승객
    int passenger; // 현재 승객




    public Bus(int n){
        super(n); //생성자
        this.num = n;
        this.passenger=0;
        this.maxPassenger=30;
        this.fare = 1000;
    }


    //속도 변경

    //상태 변경
    public void changeCondition(){
        if(condition =="차고지행"){
            if(oil<10){
                System.out.println("주유가 필요합니다");
            }
            condition ="운행";
        }
        if(oil<10){
            if (condition =="운행") {
                condition="차고지행";
                passenger = 0;
                fare = 1000;
                maxPassenger=30;
            }
        }

    }
    //승객 탑승
    public void passengerIn(int num){
        if(condition=="운행") {
            if ((passenger + num) > maxPassenger) {
                System.out.println("최대 승객 수 초과");
            } else {
                passenger += num;
                maxPassenger -= num;
                fare = passenger * fare;
            }
        }else {
            System.out.println("운행중이 아닙니다.");
        }
    }

}
