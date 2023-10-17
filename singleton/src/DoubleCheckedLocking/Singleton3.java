package DoubleCheckedLocking;

public class Singleton3 {
    private static volatile Singleton3 instance3 = null;

    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(instance3 ==null){
            synchronized (Singleton3.class){
                if(instance3 == null){
                    instance3 = new Singleton3();
                }
            }
        }
        return instance3;
    }
}
