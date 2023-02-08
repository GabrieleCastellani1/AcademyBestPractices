package it.euris;

import it.euris.pojo.Circle;
import it.euris.pojo.Quadrilateral;
import it.euris.pojo.Rectangle;
import it.euris.pojo.Shape;
import it.euris.pojo.Square;
import it.euris.service.AreaCalculator;
import it.euris.service.AreaCalculatorPrinter;
import java.util.Collection;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Collection<Shape> shapes = Set.of(
        new Circle(2),
        new Square(5),
        new Square(6)
    );
    AreaCalculatorPrinter printer = new AreaCalculatorPrinter();

    System.out.println(printer.printHtml(shapes));
    System.out.println(printer.printJson(shapes));

    /////////////// Liskov compliant

    Quadrilateral square = new Square(10);
    square.setWidth(5);
    System.out.printf("square:\n\t- area = %s\n", square.calculateArea());

    Quadrilateral rectangle = new Rectangle(10, 10);
    rectangle.setWidth(5);
    System.out.printf("rectangle:\n\t- area = %s\n", rectangle.calculateArea());
  }
}