package traadAflevering_Opg1;

import java.util.Random;

public class Order {
    private int amountOfOrders;
    private int finishedOrders;

    public Order(){
        amountOfOrders = 0;
        finishedOrders = 0;
    }

    public void push() {
        amountOfOrders++;
    }

    public void pop() {
        if(amountOfOrders > finishedOrders){
            finishedOrders++;
        }

    }


    public int getFinishedOrders() {
        return finishedOrders;
    }

    public int getAmountOfOrders() {
        return amountOfOrders;
    }

    public void setAmountOfOrders(int amountOfOrders) {
        this.amountOfOrders = amountOfOrders;
    }

}
