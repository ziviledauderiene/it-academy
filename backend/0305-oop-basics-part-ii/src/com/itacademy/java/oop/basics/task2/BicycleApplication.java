package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {
        Bicycle mountainBike = new MountainBike(19, 10);
        Bicycle roadBike = new RoadBike(1, 20);

        mountainBike.speedUp(15);
        mountainBike.applyBrakes(5);
        mountainBike.changeGear(1);
        roadBike.speedUp(25);
        roadBike.applyBrakes(-12);

        System.out.println("Aaaaand the winner is..... " + Speedometer.chooseWinner((MountainBike) mountainBike, (RoadBike) roadBike) + " bicycle!!!");
        System.out.println("Aaaaand the winner is..... " + Speedometer.chooseWinner(((MountainBike) mountainBike).getSpeed(), ((RoadBike) roadBike).getSpeed()) + " bicycle!!!");
    }
}
