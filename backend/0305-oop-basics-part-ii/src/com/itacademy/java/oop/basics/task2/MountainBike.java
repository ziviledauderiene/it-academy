package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    private int gear;
    private int speed;

    @Override
    public void changeGear(int newGear) {
        if (newGear == 1) {
            increasingGear(newGear);
        } else if (newGear == -1) {
            decreasingGear(newGear);
        } else {
            System.out.println("This gear value is not allowed. Please use 1 or -1.");
        }
    }

    private void increasingGear(int newGear) {
        if (this.gear + newGear > 20) {
            System.out.println("Gear is too high. Please use opposite value (-1).");
        } else {
            this.gear += newGear;
            System.out.println("Gear is increasing, current value: " + this.gear);
        }
    }

    private void decreasingGear(int newGear) {
        if (this.gear + newGear < 0) {
            System.out.println("Gear is too low. Please use opposite value (1).");
        } else {
            this.gear += newGear;
            System.out.println("Gear is decreasing, current value: " + this.gear);
        }
    }

    @Override
    public void speedUp(int increment) {

        if (increment <= 0) {
            System.out.println("Speeding value cannot be negative. Please use a positive number.");
        } else {
            int highestPossibleSpeedingValue = 100 - this.speed;
            if (this.speed + increment > 100) {
                System.out.println("Mountain Bike cannot go so fast. Highest possible speeding value is: " + highestPossibleSpeedingValue);
            } else {
                this.speed += increment;
                System.out.println("Mountain Bike is going faster, current speed: " + this.speed);
            }
        }
    }

    @Override
    public void applyBrakes(int increment) {

        if (increment < 0) {
            System.out.println("Breaking value cannot be negative. Please use a positive number.");
        } else {
            int highestPossibleBreakingValue = this.speed + 10;
            if (this.speed - increment < -10) {
                System.out.println("Breaking value is too high. Highest possible breaking value is: " + highestPossibleBreakingValue);
            } else {
                this.speed -= increment;
                System.out.println("Mountain Bike is going slower, current speed: " + this.speed);
            }
        }
    }

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
