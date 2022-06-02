package com.example.mvc.model;

public class Counter {
    private int result;

    public Counter() {

    }

    public int getValue() {
        return result;
    }

    public void setValue(int mode) {
        switch (mode) {
            case 1:
                result += 1;
                break;
            case 2:
                result -= 1;
                break;
            case 3:
                result = 0;
                break;
        }
    }
}
