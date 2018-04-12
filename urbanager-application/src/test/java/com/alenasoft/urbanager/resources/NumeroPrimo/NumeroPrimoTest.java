package com.alenasoft.urbanager.resources.NumeroPrimo;


import com.alenasoft.urbanager.api.NumeroPrimo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class NumeroPrimoTest {
    private NumeroPrimo numeroPrimo;
    @Before
    public void setUp() {
        numeroPrimo = new NumeroPrimo();
    }

    @Test
    public void testValidateIfNumberIsCompose(){
        this.numeroPrimo.setNumber(1000);
        assertFalse(this.numeroPrimo.getPrime());
    }
    @Test
    public void testValidateIfNumberIsPrime(){
        this.numeroPrimo.setNumber(151);
        assertTrue(this.numeroPrimo.getPrime());

    }

    @Test
    public void testValidateIfNumberIsOne(){
        this.numeroPrimo.setNumber(1);
        assertTrue(this.numeroPrimo.getPrime());

    }
    @Test
    public void testValidateIfNumberIsZero(){
        this.numeroPrimo.setNumber(0);
        assertFalse(this.numeroPrimo.getPrime());
    }
    @Test
    public void testValidateIfNumberIsNegative(){

        this.numeroPrimo.setNumber(-1);
        assertFalse(this.numeroPrimo.getPrime());
    }

    @Test
    public void testFindNextPrime(){
        this.numeroPrimo.setNumber(13);
        assertEquals(17,this.numeroPrimo.nextPrimeNumber());
    }


}
