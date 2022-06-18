package com.techreturners.cats;

public class CheetahCat extends Cat {

    public CheetahCat(){
        super(Setting.WILD, 1100);
    }
    @Override
    public String eat() {
        return "Zzzzzzz";
    }
}

