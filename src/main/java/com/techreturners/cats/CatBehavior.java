package com.techreturners.cats;

abstract class CatBehavior implements Cat {

    boolean isAsleep = false;
    protected float averageHeight;
    protected String setting;
    protected String eatingStyle;

    public boolean isAsleep(){
        return isAsleep;
    }

    public void goToSleep(){
        isAsleep = true;
    }

    public void wakeUp(){
        isAsleep = false;
    }

    public String getSetting(){
        return  setting;
    }

    public float getAverageHeight(){
        return averageHeight;
    }

    public String eat(){
        return eatingStyle;

    }

}
