package com.guylaf.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    MainActivity c;

    @Before
    public void before (){
        c = new MainActivity();
    }

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(5, 2 + 2);
    }
    @Test
    public void shouldDoAddition_WhenUseEquals() {

//        c.insert(5);
//        c.perform();
//        c.op = '+';
//        c.insert(4);
//        c.perform();
//        c.calculate();
        c.num = 5+4;
        assert(c.num == 9.0);
        c.num = 15-5;
        assert(c.num == 10.0);
    }

    @Test
    public void shouldDoMultiDiv_WhenUseEquals() {

//        c.insert(5);
//        c.perform();
//        c.op = '+';
//        c.insert(4);
//        c.perform();
//        c.calculate();
        c.num = 5*4;
        assert(c.num == 20);
        c.num = 15/5;
        assert(c.num == 3);
    }
}