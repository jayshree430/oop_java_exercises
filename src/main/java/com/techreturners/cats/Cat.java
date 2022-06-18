package com.techreturners.cats;

abstract class Cat implements CatBehaviour {

    public enum Setting {DOMESTIC, WILD}

    boolean isAsleep;
    protected float averageHeight;
    protected Setting setting;
    protected String eatingStyle;
    public Cat(Setting setting, int averageHeight) {
        this.isAsleep = false;
        this.setting = setting;
        this.averageHeight = averageHeight;
    }

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
        return setting.name().toLowerCase();
    }

    public float getAverageHeight(){
        return averageHeight;
    }

    public String eat(){
        return eatingStyle;

    }

}
