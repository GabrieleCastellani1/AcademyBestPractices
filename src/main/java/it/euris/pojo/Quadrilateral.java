package it.euris.pojo;

public class Quadrilateral implements Shape {

  protected double width;
  protected double height;
  public Quadrilateral(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return height * width;
  }

  @Override
  public double calculateVolume() {
    return 0;
  }
}
