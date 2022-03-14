package com.company;

public class PrintBill implements com.company.SelectTime,SelectTrainer,PaymentAmount{
    //violating Single Responsibility Principle
    @Override
    public void timeSlot(){

        System.out.println("Your Time Slot is 10am !!");
    }

    @Override
    public void totalAmount(){
        System.out.println("Amount to be paid is 1000 rupees");
    }

    @Override
    public void trainerName(){
        System.out.println("Your Trainer is ABC now!!");
    }

    public void printBill(){
        System.out.println("Bill Printed");
    }
}
