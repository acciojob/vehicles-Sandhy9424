package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,4,4,7,isManual,"xuv",6);
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            changeGear(1);

        }
        //for all other cases, change the gear accordingly
        else if (newSpeed<=50) {
            changeGear(1);
        }
        else if (newSpeed<=100) {
            changeGear(2);
        }
        else if (newSpeed<=150) {
            changeGear(3);
        }
        else if (newSpeed<=200) {
            changeGear(4);
        }
        else if (newSpeed<=250) {
           changeGear(5);
        }
        else {
            changeGear(6);
        }

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
