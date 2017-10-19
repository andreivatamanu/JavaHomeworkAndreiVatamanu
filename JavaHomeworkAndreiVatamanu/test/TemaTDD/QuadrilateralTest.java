/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemaTDD;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Samsung
 */
public class QuadrilateralTest {

    public QuadrilateralTest() {
    }

    /**
     * Test of getDefinition method, of class Quadrilateral.
     */
    @Test
    public void testGetDefinition() {
        Definable patrulater = new Quadrilateral();
        String actualDefinition = patrulater.getDefinition();
        String expectedDefinition = "Two dimensional geometric shape defined by 4 sides ";
        assertEquals(expectedDefinition, actualDefinition);
    }

    /**
     * Test of getDefinition method, of class Quadrilateral.
     */
    @Test
    public void testGetDefinition2() {
        Definable patrulater = new Quadrilateral();
        String actualDefinition = patrulater.getDefinition();
        String expectedDefinition = "anything else";
        assertFalse(expectedDefinition.equals(actualDefinition));
    }

}