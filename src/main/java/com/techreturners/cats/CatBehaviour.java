package com.techreturners.cats;

interface CatBehaviour {
    boolean isAsleep();

    void goToSleep();

    void wakeUp();

    String getSetting();

    float getAverageHeight();

    String eat();
}
