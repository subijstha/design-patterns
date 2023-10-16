package Dispatcher;

import View.StudentView;
import View.TeacherView;
import View.iView;

import java.util.HashMap;

public class Dispatching {
    /*
    private StudentView studentView;
    private TeacherView teacherView;

    public Dispatching(){
        studentView = new StudentView();
        teacherView = new TeacherView();
    }


    public void dispatch(String request){
        if(request.equalsIgnoreCase("Student")){
            studentView.display();
        }else{
            teacherView.display();
        }
    }
    */
    private HashMap<String, iView> requestMap = new HashMap<>();
    private HashMap<String, iView> errorMap = new HashMap<>();

    public void addRequestMapping(String viewName, iView view){
        requestMap.put(viewName, view);
    }

    public void addErrorMapping(String viewName, iView view){
        errorMap.put(viewName, view);
    }

    public void dispatchRequest(String request) {
        iView requestView;
        if ((requestView = requestMap.get(request)) != null) {
            requestView.display();
        } else if ((requestView = errorMap.get("NOPAGE")) != null) {
            requestView.display();
        } else if ((requestView = errorMap.get("DEFAULT")) != null) {
            requestView.display();
        }
    }

}
