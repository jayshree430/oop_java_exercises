package com.techreturners.cats;

public class LionCat extends CatBehavior implements Cat {

        public LionCat(){
                averageHeight = 1100;
        }
        @Override
        public String eat(){
                return "Roar!!!!";
        }
}
