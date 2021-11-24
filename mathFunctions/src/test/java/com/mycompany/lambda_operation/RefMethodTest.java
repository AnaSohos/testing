package com.mycompany.lambda_operation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RefMethodTest {

    public RefMethodTest() {
    }

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = RefMethod.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenSquareResults() {
        List<Double> result = RefMethod.diapason(5, 8, x -> 2 * x * x);
        List<Double> expected = Arrays.asList(50D, 72D, 98D);
        assertThat(result, is(expected));
    }
    
     @Test
    public void whenLinearFunctionThenIndicativeResults() {
        List<Double> result = RefMethod.diapason(5, 8, x ->  x * x * x * x );
        List<Double> expected = Arrays.asList(625D, 1296D, 2401D);
        assertThat(result, is(expected));
    }
}
