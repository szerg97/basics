package com.solid.openclosed;

public class OcpApp {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(5, 0);
        SuperCoolGuitarWithFlames coolGuitar = new SuperCoolGuitarWithFlames("red", 5, 0);
        GuitarPlayer.play(guitar);
        GuitarPlayer.stop(guitar);
        GuitarPlayer.play(coolGuitar);
        GuitarPlayer.stop(coolGuitar);
    }
}
