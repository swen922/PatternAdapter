package hole;

import peg.RoundPeg;

public class RoundHole {

    private double diameter;

    public RoundHole(int diameter) {
        this.diameter = diameter;
    }

    public boolean canFit(RoundPeg roundPeg) {
        return this.diameter >= roundPeg.getDiameter();
    }
}
