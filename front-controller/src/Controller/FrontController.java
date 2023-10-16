package Controller;

import Dispatcher.Dispatching;

import java.util.Date;

public class FrontController {
    private Dispatching dispatching;

    public FrontController(Dispatching dispatching){
        dispatching = new Dispatching();
    }

    private boolean isAuthenticUser(){
        System.out.println("Authentication Successful.");
        return true;
    }

    private void trackRequest(String request){
        System.out.println(new Date() + " # Request View: " + request);
    }

    public void dispatchRequest(String request){
        trackRequest(request);

        if(isAuthenticUser()){
            dispatching.dispatchRequest(request);
        }
    }
}
