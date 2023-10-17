import ClassicImplementation.Singleton;
import DoubleCheckedLocking.Singleton3;
import EagerInstantiation.Singleton2;
import MakeGetInstanceSynchronized.Singleton1;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //for classic implementation
        Singleton singleton = Singleton.getInstance();

        //show the message
        singleton.showMessage();


        //for synchronized
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton11 = Singleton1.getInstance();

        System.out.println(singleton1 == singleton11);


        //eager Instantiation
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton21 = Singleton2.getInstance();

        System.out.println(singleton2 == singleton21);


        //Double checked locking
        Singleton3 singleton3_1 = Singleton3.getInstance();
        Singleton3 singleton3_2 = Singleton3.getInstance();

        System.out.println(singleton3_1 == singleton3_2); // true
    }
}
