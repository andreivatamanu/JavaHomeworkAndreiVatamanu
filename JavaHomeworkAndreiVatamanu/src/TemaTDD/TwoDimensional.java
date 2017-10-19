/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemaTDD;

/**
 *
 * @author Samsung
 */
public class TwoDimensional extends GeometricShape implements Definable {
    
    private String definition;


    /**
     *
     * @return definition of 2D shape
     */
    @Override
    public String getDefinition() {
        definition = "Two dimensional " + super.getDefinition();
        return definition;
    }
    
    
    
    
    
}
