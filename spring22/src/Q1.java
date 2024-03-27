 class Marks {
    String id;
    double quizMark;
    double midMark;
    double finalMark;
    Marks(String id,double quizMark,double midMark,double finalMark){
        this.id=id;
        this.quizMark=quizMark;
        this.midMark=midMark;
        this.finalMark=finalMark;

    }
    public void passedOrNot(){
        double total=quizMark+midMark+finalMark;
        if(total>=55){
            System.out.println("passed");
        }
        else {
            System.out.println("failed");
        }
    }
}
class Run{
    public static void main(String[] args) {
        Marks m=new Marks("0112310484",20,30,40);
        m.passedOrNot();

    }
}