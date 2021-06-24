package com.company;

public class SetUp {
    public boolean isSetUp;
    public String commendation;

    public void evaluate(){
        if (isSetUp){
            System.out.println("This is commendable. " + commendation);
        }else{
            System.out.println("you will get it right if you don't give up. keep trying then");
        }
    }
}
