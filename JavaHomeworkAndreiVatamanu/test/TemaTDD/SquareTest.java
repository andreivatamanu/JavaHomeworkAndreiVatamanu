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
public class SquareTest {

    public SquareTest() {
    }

    /**
     * Test of getDefinition method, of class Square.
     */
    @Test
    public void testGetDefinition() {
        Definable patrat = new Square();
        String actualDefinition = patrat.getDefinition();
        String expectedDefinition = "Two dimensional geometric shape defined by 4 equal sides and 4 right angles.";
        assertEquals(expectedDefinition, actualDefinition);
    }

    /**
     * Test of getDefinition method, of class Square.
     */
    @Test
    public void testGetDefinition2() {
        Definable patrat = new Square();
        String actualDefinition = patrat.getDefinition();
        String expectedDefinition = "anything else";
        assertFalse(expectedDefinition.equals(actualDefinition));
    }

}
