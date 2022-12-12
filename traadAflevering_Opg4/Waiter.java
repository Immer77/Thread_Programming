package traadAflevering_Opg4;

public class Waiter extends Thread{
    private Order order;


    public Waiter(Order order){
        this.order = order;
    }

    @Override
    public void run() {
        while (true){
            order.push();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
