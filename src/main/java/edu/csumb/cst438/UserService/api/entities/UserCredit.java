package edu.csumb.cst438.UserService.api.entities;



public class UserCredit {
    private double amount;


    public UserCredit () {
        super();
    }

    public UserCredit (double amount) {
        super();
        this.amount = amount;
    }


    public Double getAmount () {
        return this.amount;
    }

    public void setAmount (double amount) {
        this.amount=amount;
    }

}
