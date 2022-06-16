package com.techreturners.cats;

public class LionCat extends CatBehavior{

        public LionCat(){
                averageHeight = 1100;
        }
        @Override
        public String eat(){
                return "Roar!!!!";
        }
}
