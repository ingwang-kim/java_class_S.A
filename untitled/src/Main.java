
public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus(1001);
        Bus bus2 = new Bus(1002);


        System.out.println("==============================버스===========================");
        System.out.println();
        System.out.println("1번 버스 번호 : " + bus1.num);
        System.out.println("2번 버스 번호 : " + bus2.num);
        System.out.println();


        bus1.drive();
        System.out.println("현재 상태 : " + bus1.condition);
        bus1.passengerIn(2);
        bus1.changeSpeed(50);
        System.out.println("탑승 승객 수 :" + bus1.passenger);
        System.out.println("잔여 승객 수 :" + bus1.maxPassenger);
        System.out.println("요금 :" + bus1.fare);
        System.out.println("현재 속도 : " +bus1.speed);
        System.out.println();

        bus1.changeOil(-50);
        System.out.println("주유량 : "+bus1.oil);
        System.out.println();

        bus1.changeCondition();
        System.out.println("상태 :" + bus1.condition);
        System.out.println("주유량 :" + bus1.oil);
        System.out.println();

        bus1.changeCondition();
        bus1.changeOil(-45);
        bus1.passengerIn(45);
        bus1.changeCondition();
        System.out.println("현재 상태 : " + bus1.condition);
        System.out.println();

        bus1.changeOil(100);
        bus1.changeCondition();
        System.out.println("현재 상태 : " + bus1.condition);
        System.out.println("주유량 :" + bus1.oil);
        System.out.println();

        bus1.passengerIn(5);
        System.out.println("탑승 승객 수 :" + bus1.passenger);
        System.out.println("잔여 승객 수 :" + bus1.maxPassenger);
        System.out.println("요금 :" + bus1.fare);
        System.out.println();

        bus1.changeSpeed(50);
        System.out.println(bus1.speed);

        System.out.println("==============================택시===========================");
        System.out.println();

        Taxi taxi1 = new Taxi(1);
        Taxi taxi2 = new Taxi(2);

        System.out.println();
        System.out.println("1번 택시 번호 : " + taxi1.num);
        System.out.println("2번 택시 번호 : " + taxi2.num);
        System.out.println();


        taxi1.drive();
        System.out.println("현재 상태 : " + taxi1.condition);
        taxi1.changeSpeed(50);
        taxi1.passengerIn();
        System.out.println("현재속도 :"+taxi1.speed);
        System.out.println();

        taxi1.passengerIn();
        System.out.println("목적지 : " +taxi1.destination);
        System.out.println("현재 상태 : " + taxi1.condition);
        System.out.println("추가요금 : "+(taxi1.distanceFare * (taxi1.distance_destination - taxi1.distance)) );
        taxi1.passengerIn();
        System.out.println();


        taxi1.changeSpeed(50);
        System.out.println("현재속도 :"+taxi1.speed);
        System.out.println();

        taxi1.changeSpeed(-30);
        System.out.println("현재속도 :"+taxi1.speed);
        System.out.println();

        taxi1.calculation();
        System.out.println();


        System.out.println(bus1.speed);


    }
}