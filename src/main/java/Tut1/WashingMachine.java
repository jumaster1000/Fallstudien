package Tut1;

public class WashingMachine {
    private State currentState = State.OFF;

    public void powerOn(){
        currentState = State.READY;
    }

    //if(currentState == State.READY){


}

