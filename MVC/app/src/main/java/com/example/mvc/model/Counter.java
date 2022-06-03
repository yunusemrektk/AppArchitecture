package com.example.mvc.model;

import com.example.mvc.view.INotify;

public class Counter {
    private int result = 0;
    INotify notify;

    public Counter(INotify iNotify) {
        this.notify = iNotify;
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

        notify.onNotify();
    }
}
