package it.euris.pojo;

public class Cube extends Square implements ThreeDimensionShape {

  public Cube(double length) {
    super(length);
  }

  @Override
  public double calculateVolume() {
    return Math.pow(super.height, 3);
  }
}
