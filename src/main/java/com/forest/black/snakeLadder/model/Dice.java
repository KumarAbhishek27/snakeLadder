package com.forest.black.snakeLadder.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Random;


@Getter
@AllArgsConstructor
public class Dice {
    private int minValue;
    private int maxValue;
    private int currentValue;

    public int roll() {
        Random random = new Random();
        return random.nextInt(maxValue - minValue) + minValue;
    }
}
