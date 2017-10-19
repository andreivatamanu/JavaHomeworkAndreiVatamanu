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
public class DiamondTest {

    public DiamondTest() {
    }

    /**
     * Test of getDefinition method, of class Diamond.
     */
    @Test
    public void testGetDefinition() {
        Definable romb = new Diamond();
        String actualDefinition = romb.getDefinition();
        String expectedDefinition = "Two dimensional geometric shape defined by 4 sides of "
                + "equal length forming two opposite acute angles and two opposite obtuse angles.";
        assertEquals(expectedDefinition, actualDefinition);
    }

    /**
     * Test of getDefinition method, of class Diamond.
     */
    @Test
    public void testGetDefinition2() {
        Definable romb = new Diamond();
        String actualDefinition = romb.getDefinition();
        String expectedDefinition = "anything else";
        assertFalse(expectedDefinition.equals(actualDefinition));
    }

}
