package executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by cbokeloh on 30.01.16.
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("A1 "+ Thread.currentThread());
                System.out.println("A2 "+ Thread.currentThread());
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("B1 "+ Thread.currentThread());
                System.out.println("B2 "+ Thread.currentThread());
            }
        };
        ExecutorService executor = Executors.newCachedThreadPool();

        executor.execute(r1);
        executor.execute(r2);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.execute(r1);
        executor.execute(r2);

        executor.shutdown();
    }
}
