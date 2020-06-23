package com.random.service.impl;

import com.random.service.IRandomService;

import java.util.concurrent.ThreadLocalRandom;

public class RandomService implements IRandomService {

    public Integer getRandomInteger(int min, int max) {

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
