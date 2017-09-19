/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Samsung
 */
    //4.Will the following class compile? If not, why?
public class Singleton<T> {
//    public static T getInstance() {
//        if (instance == null)
//        instance = new Singleton<T>();
//        return instance;
//    }
//    private static T instance = null;
    
}
    
// Answer: No. You cannot create a static field of the type parameter T. Non-static type parameter T is called in a static method 
