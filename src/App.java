import adapter.RectanglePegAdapter;
import adapter.RoundPegAdapter;
import hole.RectangleHole;
import hole.RoundHole;
import peg.RectanglePeg;
import peg.RoundPeg;
import peg.SquarePeg;

public class App {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(9);
        RoundPeg roundPeg = new RoundPeg(9);
        System.out.println("roundHole can fit roundHole = " + roundHole.canFit(roundPeg) + "\n");

        RectanglePeg rectanglePeg1 = new RectanglePeg(11, 4);
        RectanglePeg rectanglePeg2 = new RectanglePeg(6, 5);
        SquarePeg squarePeg1 = new SquarePeg(11);
        SquarePeg squarePeg2 = new SquarePeg(6);

        RoundPegAdapter adapter = new RoundPegAdapter(rectanglePeg1);
        System.out.println("roundHole can fit rectanglePeg1 = " + roundHole.canFit(adapter) + "\n");
        adapter.setRectanglePeg(rectanglePeg2);
        System.out.println("roundHole can fit rectanglePeg2 = " + roundHole.canFit(adapter) + "\n");
        adapter.setRectanglePeg(squarePeg1);
        System.out.println("roundHole can fit squarePeg1 = " + roundHole.canFit(adapter) + "\n");
        adapter.setRectanglePeg(squarePeg2);
        System.out.println("roundHole can fit squarePeg2 = " + roundHole.canFit(adapter) + "\n");

        RectangleHole rectangleHole = new RectangleHole(10, 5);
        System.out.println("rectangleHole can fit rectanglePeg1 = " + rectangleHole.canFit(rectanglePeg1) + "\n");
        System.out.println("rectangleHole can fit rectanglePeg2 = " + rectangleHole.canFit(rectanglePeg2) + "\n");

        RectanglePegAdapter rectanglePegAdapter1 = new RectanglePegAdapter(roundPeg);
        System.out.println("rectangleHole can fit roundPeg = " + rectangleHole.canFit(rectanglePegAdapter1) + "\n");





    }
}