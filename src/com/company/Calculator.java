package com.company;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class Calculator {
    private int area;
    private String  shape;
    private  int area2;

    public int setArea(int widthNum, int heightNum) {
        area = widthNum * heightNum;
        return area;
    }

    public int getArea() {
        return area;
    }

    public void setArea2(int base, int height) {
        area2 = base * height / 2;
    }

    public int getArea2() {
        return area2;
    }

    public void setShape(String myShape) {
        shape =myShape;
    }

    public String getShape() {
        return shape;
    }







}
