package hole;

import peg.RectanglePeg;

public class RectangleHole {

    private double width;
    private double height;

    public RectangleHole(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public boolean canFit(RectanglePeg rectanglePeg) {
        double biggest = width > height ? width : height;
        if (biggest < rectanglePeg.getWidth() || biggest < rectanglePeg.getHeight()) {
            return false;
        }
        double smallest = width < height ? width : height;
        if (smallest < rectanglePeg.getWidth() && smallest < rectanglePeg.getHeight()) {
            return false;
        }
        return true;
    }
}
