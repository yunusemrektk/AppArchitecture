package com.example.mvc;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.mvc.model.Counter;
import com.example.mvc.view.INotify;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        Counter counter = null;
        Counter finalCounter = counter;

        INotify notify = () -> {
            if (finalCounter != null) {
                assertEquals(finalCounter.getValue(), 1);

            }
        };
        counter = new Counter(notify);
        counter.setValue(1);

        // model has dependency on view
    }
}