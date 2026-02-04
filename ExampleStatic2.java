public class ExampleStatic2 {
    //this is a demo to show intitalisation of static variables
   static int a=4;
   static int b;
   
   //will only run once...when class is loaded...first object is created ...
   
   static {
      System.out.println("i'm in static block");
      b=a*5;
   }

   public static void main(String[] args) {
      ExampleStatic2 obj=new ExampleStatic2();
      System.out.println(ExampleStatic2.a+" "+ExampleStatic2.b);
   
      ExampleStatic2.b+=3;
       System.out.println(ExampleStatic2.a+" "+ExampleStatic2.b);

      ExampleStatic2 obj2=new ExampleStatic2();
      System.out.println(ExampleStatic2.a+" "+ExampleStatic2.b);

    }
}
 