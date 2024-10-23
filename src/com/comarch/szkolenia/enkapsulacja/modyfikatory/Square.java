package com.comarch.szkolenia.enkapsulacja.modyfikatory;

public class Square {
    private int side;
    private int field;
    private int circle;

    public Square(int side, int field, int circle) {
        this.side = side;
        this.field = field;
        this.circle = circle;
    }

    public Square(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public int getField() {
        return field;
    }

    public int getCircle() {
        return circle;
    }

    public void setSide(int side) {
        this.side = side;
        this.field = side * side;
        this.circle = side * 4;
    }
}
