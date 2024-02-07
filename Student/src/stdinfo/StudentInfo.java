package stdinfo;

import java.util.Random;

public class StudentInfo {
    public String name;
    public  String id;
    public double cgpa;
    public int creditComplete;

    public StudentInfo(){
        id=new Random().nextInt(99999)+"";
    }
    public StudentInfo(String name,String id,double cgpa,int creditComplete){
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
        this.creditComplete=creditComplete;

    }


}
