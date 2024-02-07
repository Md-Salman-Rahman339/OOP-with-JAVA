package stdinfo;

public class Studentmain {

    public static void main(String[] args) {
        StudentInfo[] students = new StudentInfo[3];
        students[0] = new StudentInfo("rahim", "6445", 3.93, 40);

        System.out.println(students[0].name+" "+students[0].cgpa);


    }


}
