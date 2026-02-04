// no need of static keyword for outer classes

class Test{
        static String name;
        public Test(String name){
            Test.name=name;
        }
    }



public class ExampleInnerClasses {
    
    //outer classes are never be a static
    //inner classes are able to be a static 
    //test2 class depends upon exampleclasses
    static class Test2{
        static String name;
        public Test2(String name){
            Test2.name=name;
        }
    }

    public static void main(String[] args) {
        Test a =new Test("vikash");
        Test b =new Test("vaibhaw");
        System.out.println(a.name);
        System.out.println(b.name);

        Test2 c=new Test2("Anupam");
        Test2 d=new Test2("vishal");
        System.out.println(c.name);
        System.out.println(d.name);
    }

}
