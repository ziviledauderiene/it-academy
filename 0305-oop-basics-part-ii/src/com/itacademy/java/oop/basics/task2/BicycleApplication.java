package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {
        Bicycle mountainBike = new MountainBike(19, 10);
        Bicycle roadBike = new RoadBike(1, 20);

//        mountainBike.speedUp(15);
//        mountainBike.applyBrakes(5);
//        mountainBike.applyBrakes(-5);
//        mountainBike.applyBrakes(40);
//        mountainBike.changeGear(1);
//        mountainBike.changeGear(1);
//        mountainBike.changeGear(1);
//        mountainBike.changeGear(-1);

//        roadBike.speedUp(25);
//        roadBike.applyBrakes(12);
//        roadBike.applyBrakes(-12);
//        roadBike.speedUp(20);
//        roadBike.speedUp(17);

        Speedometer speedometer = new Speedometer();
        System.out.println("Aaaaand the winner is..... " + speedometer.chooseWinner((MountainBike) mountainBike, (RoadBike) roadBike) + " bicycle!!!");
        System.out.println("Aaaaand the winner is..... " + speedometer.chooseWinner(((MountainBike) mountainBike).getSpeed(), ((RoadBike) roadBike).getSpeed()) + " bicycle!!!");


    }

}
