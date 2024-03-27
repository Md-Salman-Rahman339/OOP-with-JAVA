
class Vehicle{
    double mph;
    String model;
    int year;

    Vehicle(){
        System.out.println("we are dealing" +"with a vehicle class");

    }
    Vehicle(String model,double mph,int year){
        this.model=model;
        this.mph=mph;
        this.year=year;
    }
    void display(){
        System.out.println("Parent class method");
    }

}
class Bus extends Vehicle{
    String license_no;
    Bus(String license_no){
        super();
        this.license_no=license_no;
    }
    Bus(String model,double mph,int year,String license_no){
        super(model,mph,year);
        this.license_no=license_no;
    }


    void display(){
        super.display();
        System.out.println("Inside bus class");

    }
}


public class Main {
    public static void main(String[] args) {
        Bus b1=new Bus("Hanif342",60.0,2024,"sfd45");
        b1.display();



    }
}