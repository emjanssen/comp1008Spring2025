package wk2;

import java.util.ArrayList;

public class Budget {

    private ArrayList<Expense> expenses = new ArrayList<>();
    private double minLimit = 200, maxLimit = 1000, limit = minLimit, maxOneTimePurchase = Math.round(limit * 0.15);
    // these are our default values

    // right-click => Generate... getters and setters

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(ArrayList<Expense> expenses) {
        this.expenses = expenses;
    }

    public double getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(double minLimit) {
        this.minLimit = minLimit;
    }

    public double getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(double maxLimit) {
        this.maxLimit = maxLimit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    /* public double getMaxOnetimePurchase() {
        return MaxOnetimePurchase;
    }

    public void setMaxOnetimePurchase(double maxOnetimePurchase) {
        MaxOnetimePurchase = maxOnetimePurchase;
    }*/
}
