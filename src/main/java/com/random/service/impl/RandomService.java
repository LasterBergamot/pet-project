package com.random.service.impl;

import com.random.service.IRandomService;

import java.util.concurrent.ThreadLocalRandom;

public class RandomService implements IRandomService {

    private int min = 1;
    private int max = 2;

    public RandomService() {}

    public RandomService(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Integer getRandomInteger() {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public Integer getRandomInteger(int min, int max) {

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
