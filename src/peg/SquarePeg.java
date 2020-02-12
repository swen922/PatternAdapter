package peg;

public class SquarePeg extends RectanglePeg {

    private double side;

    public SquarePeg(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getWidth() {
        return side;
    }

    @Override
    public double getHeight() {
        return side;
    }
}
