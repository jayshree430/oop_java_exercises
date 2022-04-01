package com.techreturners.cats;

public class DomesticCat extends CatBehavior implements Cat {

   public DomesticCat(){
        setting = "domestic";
        averageHeight = 23;
   }

    @Override
    public String eat() {
        return null;
    }
}
