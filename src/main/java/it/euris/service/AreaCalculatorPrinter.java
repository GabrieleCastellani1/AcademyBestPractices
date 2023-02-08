package it.euris.service;

import java.util.Collection;

public class AreaCalculatorPrinter {

  public String printHtml(Collection<Object> shapes) {
    AreaCalculator areaCalculator = new AreaCalculator(shapes);
    return "<sum total=" + areaCalculator.sum() + "/>";
  }

  public String printJson(Collection<Object> shapes) {
    AreaCalculator areaCalculator = new AreaCalculator(shapes);
    return "{ \"sum\": { \"total\":" + areaCalculator.sum() + "} }";
  }

}
