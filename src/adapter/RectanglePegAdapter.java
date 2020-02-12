package adapter;

import peg.RectanglePeg;
import peg.RoundPeg;
import peg.SquarePeg;

public class RectanglePegAdapter extends RectanglePeg {

    private RoundPeg roundPeg;
    private double side;

    public RectanglePegAdapter(RoundPeg roundPeg) {
        super();
        this.roundPeg = roundPeg;
        this.side = roundPeg.getDiameter();
    }

    @Override
    public double getWidth() {
        return side;
    }

    @Override
    public double getHeight() {
        return side;
    }

    public void setRoundPeg(RoundPeg roundPeg) {
        this.roundPeg = roundPeg;
        this.side = roundPeg.getDiameter();
    }

}
