package traadAflevering_Opg3;

public class Waiter extends Thread{
    private Order order;


    public Waiter(Order order){
        this.order = order;
    }

    @Override
    public void run() {
        while (true){
            order.push();
            System.out.println("Ordrer tilføjet til Ordrelinjen: " + order.getAmountOfOrders());
            try {
                Thread.sleep(1000);

            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
