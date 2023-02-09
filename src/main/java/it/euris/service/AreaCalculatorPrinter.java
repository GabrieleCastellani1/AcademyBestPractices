package it.euris.service;

import it.euris.pojo.Shape;
import java.util.Collection;

public class AreaCalculatorPrinter {

  private final AreaCalculator areaCalculator;

  public AreaCalculatorPrinter(AreaCalculator areaCalculator) {
    this.areaCalculator = areaCalculator;
  }

  public String printHtml() {
    return "<sum total=" + areaCalculator.sum() + "/>";
  }

  public String printJson() {
    return "{ \"sum\": { \"total\":" + areaCalculator.sum() + "} }";
  }

}
