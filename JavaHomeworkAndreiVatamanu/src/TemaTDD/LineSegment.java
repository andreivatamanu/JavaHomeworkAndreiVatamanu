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
public class LineSegment extends TwoDimensional implements Definable {
    
    private String definition;

  
    @Override
    public String getDefinition() {
        definition = super.getDefinition() + "defined by a part of a line that is bounded by two distinct end points, and contains every point on the line between its endpoints.";
        return definition;
    }
}
