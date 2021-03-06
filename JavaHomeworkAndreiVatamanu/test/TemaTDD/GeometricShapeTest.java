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
public class GeometricShapeTest {

    public GeometricShapeTest() {
    }

    /**
     * Test of getDefinition method, of class GeometricShape.
     */
    @Test
    public void testGetDefinition() {
        Definable figuraGeometirca = new GeometricShape();
        String actualDefinition = figuraGeometirca.getDefinition();
        String expectedDefinition = "geometric shape ";
        assertEquals(expectedDefinition, actualDefinition);
    }

    /**
     * Test of getDefinition method, of class GeometricShape.
     */
    @Test
    public void testGetDefinition2() {
        Definable figura = new GeometricShape();
        String actualDefinition = figura.getDefinition();
        String expectedDefinition = "anything else";
        assertFalse(expectedDefinition.equals(actualDefinition));
    }

}
