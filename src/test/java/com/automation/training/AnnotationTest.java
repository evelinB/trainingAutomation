package com.automation.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AnnotationTest {

    @Test
    @Parameters({"stringA","stringB"})
    public void testConcat(String a, String b){
        String resultado = a + b;
        assertEquals(resultado,"I love test automation");
    }



}