package com.company;

public class AmountPayable implements PaymentAmount{
    @Override
    public void totalAmount(){
        System.out.println("Amount to be paid is 1000 rupees");
    }
}
