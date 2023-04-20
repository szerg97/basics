package com.solid.openclosed;

public class GuitarPlayer {
    public static void play(Guitar guitar) {
        guitar.setVolume(100);
        guitar.play();
    }

    public static void stop(Guitar guitar) {
        guitar.setVolume(0);
    }
}
