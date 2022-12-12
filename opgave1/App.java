package opgave1;

public class App {
    public static void main(String[] args) {
        Faelles faelles = new Faelles();
        MyThread thread1 = new MyThread("Tråd 1", faelles);
        MyThread thread2 = new MyThread("Tråd 2", faelles);

        thread1.start();
        thread2.start();
    }
}
