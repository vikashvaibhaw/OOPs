public class ExampleStatic {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;



    static void message(){
        System.out.println("hello world!");
    }

    public ExampleStatic(int age,int salary,String name,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        ExampleStatic.population+=1;

        ExampleStatic.message();

    }
}
