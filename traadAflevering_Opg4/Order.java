package traadAflevering_Opg4;

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
        notifyAll();
    }

    public synchronized void pop() {
        try {
            wait();
            if(amountOfOrders > finishedOrders){
                finishedOrders++;
                System.out.println("Der er blevet lavet ordre " + finishedOrders);
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
