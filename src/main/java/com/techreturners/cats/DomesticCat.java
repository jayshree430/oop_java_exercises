package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends Cat {

    public DomesticCat(){
        super(Setting.DOMESTIC, 23);
    }

    @Override
    public String eat() {
        Random randomNumber = new Random();
        if (randomNumber.nextInt(10)%2==0)
            return "Purrrrrrr";

        return "It will do I suppose";
    }
}
