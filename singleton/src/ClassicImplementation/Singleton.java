package ClassicImplementation;
//not thread-safe
public class Singleton {
    //object of singleton class
    private static Singleton instance;


    //constructor private so that this class cannot be instantiated
    private Singleton(){
    }

    //get only the object available
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
//optional method
    public void showMessage(){
        System.out.println("Hello Singleton");

    }
}
