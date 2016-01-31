package Multithreading.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by cbokeloh on 31.01.16.
 */
public class ScheduledExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Ausgabe");
            }
        }, 1 /*Startverzögerung*/
        ,2 /* Dauer */
        , TimeUnit.SECONDS);
    }
}
