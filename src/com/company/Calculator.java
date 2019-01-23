package com.company;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class Calculator {
    private int area;


    public int setArea(int widthNum, int heightNum) {
        area = widthNum * heightNum;
        return area;
    }

    public int getArea() {
        return area;
    }



}
