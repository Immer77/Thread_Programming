package traadAflevering_Opg2;

public class TestOrder {
    public static void main(String[] args) {
        Order order = new Order();
        Chef peter = new Chef(order);
        Waiter kristoffer = new Waiter(order);
        Waiter anujan = new Waiter(order);

        kristoffer.start();
        anujan.start();
        peter.start();
    }
}
