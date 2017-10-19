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
public class GeometricShape implements Definable {

    private String definition;


    @Override
    public String getDefinition() {
        definition = "geometric shape ";
        return definition;
    }

}
