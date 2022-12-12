package traadAflevering_Opg2;

public class Chef extends Thread {
    private Order order;
    private int counter;

    public Chef(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        while (true) {
            order.pop();
            System.out.println("Der er blevet lavet ordre nr.: " + order.getFinishedOrders());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

}
