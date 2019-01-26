package com.example.sunfit.sunfit;
import android.app.Application;

public class globals extends Application {
    private static globals instance;
    private static long fsteps;
    private static long redeemed_steps;

    private globals(){}

    public void setSteps( long t){
        globals.fsteps=t;
    }

    public long getSteps(){
        return  globals.fsteps;

    }

    public void setRedeemedSteps( long t){
        globals.redeemed_steps=t;
    }

    public long getRedeemedSteps(){
        return  globals.redeemed_steps;

    }

    public static synchronized globals getInstance()
    {
        if(instance==null)
        {
            instance=new globals();
        }
        return instance;
    }

}
