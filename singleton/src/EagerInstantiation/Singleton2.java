package EagerInstantiation;

public class Singleton2 {
    private static Singleton2 instance2;
    private Singleton2(){
    }

    public static Singleton2 getInstance(){
        return instance2;
    }


}
