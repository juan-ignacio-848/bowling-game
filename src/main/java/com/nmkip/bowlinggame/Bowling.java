package com.nmkip.bowlinggame;

public interface Bowling {
    void roll(int... rolls);

    void roll(int pinsDown);

    int score();
}
