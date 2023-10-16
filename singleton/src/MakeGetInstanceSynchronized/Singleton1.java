package MakeGetInstanceSynchronized;

public class Singleton1 {
    private static Singleton1 instance1;

    private Singleton1(){

    }

    public static synchronized Singleton1 getInstance(){
        if(instance1 == null){
            instance1 = new Singleton1();
        }
        return instance1;
    }


}
