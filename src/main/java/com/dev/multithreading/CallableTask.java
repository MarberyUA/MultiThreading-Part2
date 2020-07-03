package com.dev.multithreading;

import java.util.List;
import java.util.concurrent.Callable;

public class CallableTask implements Callable<Long> {
    private final int startIndex;
    private final int endIndex;
    private final List<Long> numbers;

    public CallableTask(int startIndex, int endIndex, List<Long> numbers) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.numbers = numbers;
    }

    @Override
    public Long call() throws Exception {
        int currentIndex = startIndex;
        long sum = 0;
        while (currentIndex < endIndex) {
            sum += numbers.get(currentIndex);
            currentIndex++;
        }
        return sum;
    }
}
