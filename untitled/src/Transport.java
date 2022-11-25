public class Transport {

    int num; // 번호
    int oil; // 주유량
    int speed; // 속도
    int fare; // 기본 요금
    String condition ; //상태

    public Transport(int num){
        this.num= num;
        this.oil = 100;
        this.speed = 0;
    }

    public void drive(){
        if(oil>=10){
            condition = "운행";
        }else {
            condition = "운행 불가";
        }
    }

    public void changeSpeed(int n){
        if(speed <0){
            speed=0;
        }
        if(oil<10) {
            System.out.println("주유량을 확인해 주세요");
        }else {
            speed += n;
        }
    }
    public void changeOil(int n){
        oil+=n;
        if(oil <10){
            condition = "차고지행";
        }
    }


}
