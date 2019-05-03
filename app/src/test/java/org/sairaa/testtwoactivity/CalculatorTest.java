package org.sairaa.testtwoactivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    MainActivity mainActivity;

    @Before
    public void setUp(){
        mainActivity = new MainActivity();
    }

    @Test
    public void addTwoNo(){
        int result = mainActivity.calculatePlus(5,6);
        assertThat(result,is(equalTo(11)));
    }
}
