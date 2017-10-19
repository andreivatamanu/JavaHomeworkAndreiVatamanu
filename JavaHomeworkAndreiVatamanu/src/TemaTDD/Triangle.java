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
public class Triangle extends TwoDimensional implements Definable {
    
    private String definition;

    
    @Override
    public String getDefinition() {
        definition = super.getDefinition() + "defined by three liens and three angles.";
        return definition;
    }
    
}
