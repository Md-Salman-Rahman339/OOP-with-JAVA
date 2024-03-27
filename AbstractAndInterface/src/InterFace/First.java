package InterFace;

  interface Bicycle{
      void applyBrake(int decreament);
      void speedUp(int increment);
  }
 class AvonCycle implements Bicycle{
      int speed=20;
  public void applyBrake(int decreament){
      speed=speed-decreament;
      System.out.println("your speed now "+ speed);

     }
    public void speedUp(int increment){
      speed=speed+increment;
        System.out.println("Your speed now "+speed);

     }
}

class test{
    public static void main(String[] args) {
        AvonCycle a=new AvonCycle();
        a.speedUp(4);
        a.applyBrake(4);
        a.speedUp(6);
    }
}
