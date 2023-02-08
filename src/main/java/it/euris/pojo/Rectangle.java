package it.euris.pojo;

public class Rectangle implements Shape {

  protected double width;
  protected double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public void setWidth(double length) {
    this.width = length;
  }

  public double getWidth() {
    return this.width;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getHeight() {
    return this.height;
  }

  @Override
  public double calculateArea() {
    return this.width * this.height;
  }
}
