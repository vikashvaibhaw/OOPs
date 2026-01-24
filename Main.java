import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Students vikash=new Students(5,"vikash",26);
        Students anupam=new Students(6,"anupam",85.4f);
        Students copy_vikash=new Students(vikash);
        System.out.println(vikash.marks);
        // System.out.println(vikash) ;
        System.out.println(vikash.roll);
        vikash.greeting();
        System.out.println(copy_vikash.roll);
    }
}
 
class Students{
    int roll;
    String name;
    float marks;
    String schoolName;

    void greeting(){
        System.out.println("hello gentleman! ,go ahead  "+ name);
    }

    public Students(int x,String y,float z){
        this.roll=x;
        this.name=y;
        this.marks=z;
        this.schoolName="MKD";
    }

    Students(Students other){
        this.roll=other.roll;
        this.name=other.name;
        this.schoolName=other.schoolName;
    }
}

class Section{
    // int [] roll;
    // String [] names;
    // float []marks;

    // public Section(int n){
    //     roll =new int[n];
    //     names=new String[n];
    //     marks=new float[n];
    // }

    Students[] students;
    public Section(int n){
        students=new Students[n];
    }
        
}  