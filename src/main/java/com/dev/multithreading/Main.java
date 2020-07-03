package com.dev.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(0 + (long)(Math.random() * 1000));
        }
        SumExecutor sumExecutor = new SumExecutor(2, list);
        System.out.println(sumExecutor.execute());
        SumForkJoin sumForkJoin = new SumForkJoin(list);
        System.out.println(sumForkJoin.compute());
    }
}
