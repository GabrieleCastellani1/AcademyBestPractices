package it.euris.pojo;

public class Square extends Rectangle {

    public Square(double length) {
        super(length, length);
    }

    @Override
    public void setWidth(double length) {
        super.width = length;
        super.height = length;
    }

    @Override
    public void setHeight(double length) {
        super.width = length;
        super.height = length;
    }

}
