package com.app.countandcompar;

import java.util.Random;

public class NumberRandom {

    public static int numberRandom(int i) {
        Random random = new Random();
        return random.nextInt(i);
    }
}
