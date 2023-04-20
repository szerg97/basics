package com.szalai.dp.structural.adapter;

public class AdapterApp {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        Round rPeg = new RoundPeg(5);
        System.out.println(
                hole.fits(rPeg)
        );

        Square smallSqPeg = new SquarePeg(5);
        Square largeSqPeg = new SquarePeg(10);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        System.out.println(
                hole.fits(smallSqPegAdapter)
        );
        System.out.println(
                hole.fits(largeSqPegAdapter)
        );
    }
}
