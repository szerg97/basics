package com.solid.openclosed;

public class SuperCoolGuitarWithFlames extends Guitar{

    private final String color;

    public SuperCoolGuitarWithFlames(String color, int numberOfStrings, int volume) {
        super(numberOfStrings, volume);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "SuperCoolGuitarWithFlames{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
