package traadAflevering_Opg3;

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
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

}
