public class Taxi extends Transport{

    String destination; // 목적지
    int distance; //기본 거리
    int distance_destination; // 목적지까지의 거리
    int distanceFare; // 거리당 요금

    public Taxi(int num) {
        super(num);
        this.distance = 1;
        this.destination = "서울";
        this.distance_destination=10;
        this.distanceFare = 1000;
        this.fare = 7000;
        this.condition = "운행";

    }


    public void passengerIn(){
        if(condition == "운행"){
            condition ="탑승중";

        }
        else {
            System.out.println("탑승 불가");
        }
    }


    public void  calculation(){
        System.out.println("최종 요금 : " + (fare+(distanceFare * (distance_destination - distance))));
        condition = "운행";
    }

}

