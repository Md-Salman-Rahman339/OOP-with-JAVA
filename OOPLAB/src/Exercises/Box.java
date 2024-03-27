package Exercises;

import java.util.Scanner;

class Box {
    double length;
    double width;
    double height;

    public double getVolume(double length,double width,double height){

        return length*width*height;

    }
}

class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Box b= new Box();

        b.length=scan.nextDouble();
        b.width=scan.nextDouble();
        b.height=scan.nextDouble();

        System.out.println("Your volume is: "+b.getVolume(b.length,b.width,b.height));
        Box c= new Box();
        System.out.println("Your volume is: "+c.getVolume(5,5,5));

    }
}
