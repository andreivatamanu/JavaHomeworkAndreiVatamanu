/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temaNotepad;

import java.io.IOException;

/**
 *
 * @author Samsung
 */
public class OpenNotepad {

    
    public static void main(String[] args) {
        
        Runtime rs = Runtime.getRuntime();
        
        for (int i = 0; i < 3; i++){
 
    try {
      rs.exec("notepad");
    }
    catch (IOException e) {
      System.out.println(e);
    }
        }
    }
}
  

      
