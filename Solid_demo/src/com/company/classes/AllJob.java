package com.company;

public class AllJob implements DoAll{
    //violating dependency inversion principle
    @Override
     public void trainerName(){
        System.out.println("Hii..trainer name method");
    }
    @Override
    public void timeSlot(){
        System.out.println("time slot ");
        chooseTime(5);
    }
    @Override
    public void totalAmount(){
        System.out.println("Total amount ");
    }

    public void chooseTime(int hr){
        System.out.println("Time chosen is evening" + hr);
    }
}
