/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phyisics.models.expansion;

import com.phyisics.models.expansion.Superficial;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author derickfelix
 */
public class SuperficialTest {
    
    public SuperficialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of beta method, of class SuperficialDilatation.
     */
    @Test
    public void testBeta() {
        System.out.println("beta");
        double initialS = 400;
        double finalS = 401;
        double deltaT = 50;
        Superficial instance = new Superficial();
        double expResult = 2.5E-5;

        double result = instance.beta(initialS, finalS, deltaT);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of deltaS method, of class SuperficialDilatation.
     */
    @Test
    public void testDeltaS() {
        System.out.println("finalS");
        double initialS = 400;
        double deltaT = 50;
        double beta = 2.5E-5;
        Superficial instance = new Superficial();
        double expResult = 1;
        double result = instance.deltaS(initialS, deltaT, beta);
        assertEquals(expResult, result, 0.0);

        result = instance.initialS(200.8, 0.8);
        assertEquals(200, result, 0.0);
        result = instance.finalS(200, 0.8);
        assertEquals(200.8, result, 0.0);
    }

    /**
     * Test of deltaT method, of class SuperficialDilatation.
     */
    @Test
    public void testDeltaT() {
        System.out.println("deltaS");
        double initialS = 200;
        double finalS = 200.8;
        double beta = 2E-5;
        Superficial instance = new Superficial();
        double expResult = 100;
        double result = instance.deltaTS(initialS, finalS, beta);
        assertEquals(expResult, result, 0.0);

    }
    
}
