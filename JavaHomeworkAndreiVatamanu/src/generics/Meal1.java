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
//10.Will the following code compile without error? Why or why not?
public class Meal1 {
    }
//@Meal("breakfast", mainDish="cereal")
//@Meal("lunch", mainDish="pizza")
//@Meal("dinner", mainDish="salad")
//public void evaluateDiet() { 

//}

//Answer: The code fails to compile. Before JDK 8, repeatable annotations are not supported. As of JDK 8, the code fails to compile because the Meal annotation type was not defined to be repeatable. It can be fixed by adding the @Repeatable meta-annotation and defining a container annotation type:

//@java.lang.annotation.Repeatable(MealContainer.class)
//public @interface Meal { ... }

//public @interface MealContainer {
    //Meal[] value();

