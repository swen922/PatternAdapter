package adapter;

import peg.RectanglePeg;
import peg.RoundPeg;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundPegAdapter extends RoundPeg {

    private double diameter;
    private RectanglePeg rectanglePeg;

    public RoundPegAdapter(RectanglePeg rectanglePeg) {
        super();
        this.rectanglePeg = rectanglePeg;
        this.diameter = countDiameter(rectanglePeg.getWidth(), rectanglePeg.getHeight());
    }

    @Override
    public double getDiameter() {
        return diameter;
    }

    private double countDiameter(double width, double height) {
        double count = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        BigDecimal bigDecimal = new BigDecimal(Double.toString(count));
        bigDecimal = bigDecimal.setScale(3, RoundingMode.HALF_UP);
        System.out.println("bigDecimal.doubleValue() = " + bigDecimal.doubleValue());
        return bigDecimal.doubleValue();
    }

    public void setRectanglePeg(RectanglePeg rectanglePeg) {
        this.rectanglePeg = rectanglePeg;
        this.diameter = countDiameter(rectanglePeg.getWidth(), rectanglePeg.getHeight());
    }

}
