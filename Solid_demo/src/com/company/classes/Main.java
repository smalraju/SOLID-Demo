package com.company;

public class Main {

    public static void main(String[] args) {
	ChooseBoth select = new ChooseBoth();
    select.trainerName();
    WorkoutPlace location = new AtGym();
    select.timeSlot();
    PaymentAmount fee = new AmountPayable();
    fee.totalAmount();
    PrintBill bill = new PrintBill();
    bill.printBill();
    }
}
