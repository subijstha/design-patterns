import Controller.FrontController;
import Dispatcher.Dispatching;
import View.DefaultView;
import View.NoPageFoundView;
import View.StudentView;
import View.TeacherView;

public class FrontControllerPattern {
    public static void main(String[] args) {

        System.out.println("Creating dispatcher");
        Dispatching dispatcher = new Dispatching();

        System.out.println("Initialize Pages");
        dispatcher.addRequestMapping("STUDENT", new StudentView());
        dispatcher.addRequestMapping("TEACHER", new TeacherView());

        System.out.println("Initialize Error Pages");
        dispatcher.addErrorMapping("DEFAULT", new DefaultView());
        dispatcher.addErrorMapping("NOPAGE", new NoPageFoundView());

        FrontController frontController = new FrontController(dispatcher);
        System.out.println("Sending request for page: STUDENT");
        frontController.dispatchRequest("STUDENT");
        System.out.println("Sending request for page: TEACHER");
        frontController.dispatchRequest("TEACHER");
        System.out.println("Sending request for page: DOCTOR");
        frontController.dispatchRequest("DOCTOR");
    }
}
