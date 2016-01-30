package Multithreading.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by cbokeloh on 30.01.16.
 */
public class InvokeAny {
    public static void main(String arg[]) {
        Callable<String> c1 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Test";
            }
        };

        Callable<String> c2 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Ga";
            }
        };

        ExecutorService exec = Executors.newCachedThreadPool();
        List<Callable<String>> l = new ArrayList<>();
        l.add(c1);
        l.add(c2);
        try {
            String result = exec.invokeAny(l);
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
