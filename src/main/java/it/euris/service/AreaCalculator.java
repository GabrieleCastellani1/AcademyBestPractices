package it.euris.service;

import it.euris.pojo.Shape;

import java.util.Collection;

public class AreaCalculator {

  protected Collection<Shape> shapes;

  public AreaCalculator(Collection<Shape> shapes) {
    this.shapes = shapes;
  }

  public double sum() {
    return shapes.stream()
        .map(Shape::calculateArea)
        .reduce(Double::sum)
        .orElse(0d);
  }

}
