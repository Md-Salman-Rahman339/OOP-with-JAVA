package Inheritance;

public class MountainBike extends ByCycle{
    public int seatheight;
    public MountainBike(int gear, int speed,int startHeight) {
        super(gear, speed);
        seatheight=startHeight;
    }
    public void setHeight(int newvalue){
        seatheight=newvalue;
    }
    @Override public String toString(){
        return(super.toString()+"\n seat height is "+seatheight);

    }


}
