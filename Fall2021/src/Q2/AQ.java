package Q2;

public class AQ {
    double v1;
    int a1;
    
    public AQ(double v1,int a1){
        this.v1=v1;
        this.a1=a1;
        
    }
    public  AQ(){
        this.f1(100,0);
    }



    void f1(int a,int b){
        System.out.println(a+b+v1+a1);
    }
    void f2(int x,int y){
        System.out.println(v1+a1+x+y);

    }

}
