package Controller;

import Dispatcher.Dispatching;

public class FrontController {
    private Dispatching dispatching;

    public FrontController(){
        dispatching = new Dispatching();
    }

    private boolean isAuthenticUser(){
        System.out.println("Authentication Successful.");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Request View: " + request);
    }

    public void dispatchRequest(String request){
        trackRequest(request);

        if(isAuthenticUser()){
            dispatching.dispatch(request);
        }
    }
}
