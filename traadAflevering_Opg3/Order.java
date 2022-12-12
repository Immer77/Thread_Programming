package traadAflevering_Opg3;

import traadAflevering_Opg1.Waiter;

public class Order {
    private int amountOfOrders;
    private int finishedOrders;

    public Order(){
        amountOfOrders = 0;
        finishedOrders = 0;
    }

    public synchronized void push() {
        amountOfOrders++;
        System.out.println("Ordrer tilføjet til Ordrelinjen: " + amountOfOrders);
        notify();
    }

    public synchronized void pop() {
        try {
            wait();
            if(amountOfOrders > finishedOrders){
                finishedOrders++;
                System.out.println("Der er blevet lavet ordre nr.: " + finishedOrders);
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
