package it.euris.pojo;

public class Rectangle extends Quadrilateral {

  public Rectangle(double width, double height) {
    super(width, height);
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
