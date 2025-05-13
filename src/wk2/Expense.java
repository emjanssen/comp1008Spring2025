package wk2;

public class Expense {

    // actions, aka behaviours, aka processes, aka how to interact with class
    // attributes in java are called instance variables
    // an instance is one copy or manifestation of the concept of a class

    // accessibility level: public, private, protected default/package-private
    // data type
    // name
    // value
    // out of these items, only name and data type are necessary; if you don't declare the others, program will make assumptions

    String name;
    private double amount = 1;

    public void setAmount(double amount) {
        // set restrictions; ex. you want the amount to be more than 0

        if (amount >= 0) {
            this.amount = amount;
        }
    }

    public double getAmount() {
        return amount;
    }

}

