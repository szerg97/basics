package com.solid.openclosed;

public class Guitar {
    private final int numberOfStrings;
    private int volume;

    public Guitar(int numberOfStrings, int volume) {
        this.numberOfStrings = numberOfStrings;
        this.volume = volume;
    }

    public void play(){
        System.out.println("Playing " + this);
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + numberOfStrings +
                ", volume=" + volume +
                '}';
    }
}
