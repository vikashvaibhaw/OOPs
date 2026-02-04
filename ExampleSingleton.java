class Singleton{
    private Singleton(){

    }

    private static Singleton instance;
    
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}



public class ExampleSingleton {
    public static void main(String[] args) {
       Singleton obj=Singleton.getInstance();

       Singleton obj2=Singleton.getInstance(); 
             
    }
}


