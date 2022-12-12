package traadAflevering_Opg2;

import java.util.concurrent.Semaphore;

public class Order {
    private int amountOfOrders;
    private int finishedOrders;
    private static Semaphore semaphore = new Semaphore(1);
    private static Semaphore semaphoreChef = new Semaphore(0);

    public Order() {
        amountOfOrders = 0;
        finishedOrders = 0;
    }

    public void push() {
        try {
            semaphore.acquire();
            amountOfOrders++;
            semaphoreChef.release();
            semaphore.release();

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void pop() {
        try {
            if (amountOfOrders > finishedOrders) {
                semaphoreChef.acquire();
                finishedOrders++;

            }
        }catch (InterruptedException ie){
            ie.printStackTrace();
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
