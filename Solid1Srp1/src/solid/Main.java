package solid;

import solid.srp.FigureManager;
import solid.srp.Point;
import solid.srp.Square;

public class Main {
    public static void main(String[] args) {
        FigureManager figureManager = new FigureManager(2);
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        figureManager.draw(square);
    }
}
