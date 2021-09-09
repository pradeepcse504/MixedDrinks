
package com.pradeep.mixeddrinks;

/**
 *
 * @author pradeep
 */
import java.util.*;

abstract public class MixedDrink {
    
    String name;
    String base;
    List<String> garnish = new ArrayList<>();
    String sweatner;
    
    
    public String getName(){
        return name;
    }
    public void prepare(){
        System.out.println("Preparing " + name );
    }   
    public void stir(){
        System.out.println("Stiring " + name );
    }
    
    public void shake(){
        System.out.println("Shaking " + name);
    }
    
    public void serve(){
        System.out.println("Serving " + name);
    }
    
    public String toString() {
        //Display name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("--- " + name + "------\n\n");
        display.append("--- " + base + "\n");
        display.append("--- " + sweatner + "\n");
        for (String garnishes : garnish ){
            display.append( "--- " + garnishes + "\n");
           
        }
        
        return display.toString();
    }
    
}
