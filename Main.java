import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Students vikash=new Students(5,"vikash",26);
        System.out.println(vikash.marks);
        // System.out.println(vikash) ;
        System.out.println(vikash.roll);
    }
}
 
class Students{
    int roll;
    String name;
    float marks;

    public Students(int x,String y,float z){
        roll=x;
        name=y;
        marks=z;
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