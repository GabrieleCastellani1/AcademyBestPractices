package it.euris.service;

import it.euris.pojo.Shape;
import java.util.Collection;

public class AreaCalculatorPrinter {

  public String printHtml(Collection<Shape> shapes) {
    AreaCalculator areaCalculator = new AreaCalculator(shapes);
    return "<sum total=" + areaCalculator.sum() + "/>";
  }

  public String printJson(Collection<Shape> shapes) {
    AreaCalculator areaCalculator = new AreaCalculator(shapes);
    return "{ \"sum\": { \"total\":" + areaCalculator.sum() + "} }";
  }

}
