public class WrapperEx {
    public static void main(String[] args) {
        int a=10; //primitive data type
        int c=73;
        a+=c;
        System.out.println(a);
        Integer num=new Integer(45);
        Integer b=10;
        Integer d=79; // object
        swap(b,d);
        System.out.println(a+" " + c);

        final A vikku=new A("vikash vaibhaw");
        //value would be chnage of final refernce variable
        vikku.name="vikash kumar";
        
        //when a non-primitve is a final..you cannot reassign it ...you can change it's value..but cannot be reassign it with others
        //wrong---  vikku=new A("new Object");

        A obj;
        for(int i=0;i<10000000;i++){
            obj=new A("random name");
        }
    }
    
    //still values won't swap ...because Integer class is final class
    //you cannot modify it--final keyword prevent modification only in primitive data type
    //always intialize while declaring final variable....immutability ---only instance variables are primitive data types...
    //reference variable would be modify irrespective of final keyword presence or absence 

    static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }

}

class A{
    final int num=10;
    String name;

    public A(String name){
        System.out.println("Object created");
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }
}


