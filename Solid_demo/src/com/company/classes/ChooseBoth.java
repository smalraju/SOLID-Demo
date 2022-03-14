package com.company;

public class ChooseBoth implements SelectTime,SelectTrainer{
    @Override
    public void trainerName(){
        System.out.println("Your trainer is selected");
    }
    @Override
    public void timeSlot() {
        System.out.println("Time slot selected");
    }

}
