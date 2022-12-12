package opgave1;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Faelles {
    private int count = 0;
    private Random r;
    private static Semaphore semaphore = new Semaphore(1);

    public Faelles() {
        this.r = new Random();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void tagerRandomTid(int max){
        Random r = new Random();
        int nyMax = Math.abs(r.nextInt()) % max + 1;
        for (int i = 0; i < nyMax; i++) {
            for (int j = 0; j < nyMax; j++) {
                int tal = 5;
                int tal2 = 5;
                int sum = tal + tal2;
            }

        }
    }
    public void kritiskSektion(){
        try {
            semaphore.acquire();
            int temp;
            temp = count;
            tagerRandomTid(10);
            count = temp + 1;
            semaphore.release();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }



    }
}
