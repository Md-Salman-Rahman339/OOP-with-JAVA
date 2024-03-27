package Inheritance;

public class ByCycle {
    public int gear;
    public int speed;

    public ByCycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increase) {
        speed += increase;
    }

    public String toString() {
        return ("No of gears are" + gear + "\n" +"Speed of bicycle is "+speed);
    }

}

