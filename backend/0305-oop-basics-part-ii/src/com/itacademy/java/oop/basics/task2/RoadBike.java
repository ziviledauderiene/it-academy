package com.itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle {
    private int gear;
    private int speed;

    @Override
    public void changeGear(int newGear) {
        if (newGear == 1 || newGear == 2) {
            if (this.gear + newGear > 10) {
                System.out.println("Gear is too high. Please use opposite value (-1 or -2).");
            } else {
                this.gear += newGear;
                System.out.println("Gear is increasing, current value: " + this.gear);
            }
        } else if (newGear == -1 || newGear == -2) {
            if (this.gear + newGear < 0) {
                System.out.println("Gear is too low. Please use opposite value (1 or 2).");
            } else {
                this.gear += newGear;
                System.out.println("Gear is decreasing, current value: " + this.gear);
            }
        } else {
            if (newGear > 2) {
                System.out.println("This gear value is not allowed. Please use 2.");
            } else if (newGear < -2) {
                System.out.println("This gear value is not allowed. Please use -2.");
            } else if (newGear == 0) {
                System.out.println("This gear value is not allowed. Please use -1 or 1.");
            }
        }
    }

    @Override
    public void speedUp(int increment) {
        if (increment <= 0) {
            System.out.println("Speeding value cannot be negative. Please use a positive number.");
        } else {
            int highestPossibleSpeedingValue = 50 - this.speed;
            if (this.speed + increment > 50) {
                System.out.println("Road Bike cannot go so fast. Highest possible speeding value is: " + highestPossibleSpeedingValue);
            } else {
                this.speed += increment;
                System.out.println("Road Bike is going faster, current speed: " + speed);
            }
        }
    }

    @Override
    public void applyBrakes(int increment) {
        if (increment >= 0) {
            System.out.println("Please use a negative value to apply breaks for Road Bike.");
        } else {
            if (this.speed + increment < 0) {
                System.out.println("Road Bike speed cannot be negative.");
            } else {
                this.speed += increment;
                System.out.println("Road Bike is going slower, current speed: " + speed);
            }
        }
    }

    public RoadBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
