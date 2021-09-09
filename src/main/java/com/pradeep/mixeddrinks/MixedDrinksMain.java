
package com.pradeep.mixeddrinks;

/**
 *
 * @author Pradeep
 */
public class MixedDrinksMain {
    
    public static void main(String[] args) {
        MixedDrinksFactory factory = new MixedDrinksFactory();
        MixedDrinksStore store = new MixedDrinksStore(factory);
        
        MixedDrink drink  = store.OrderDrink("bloodymary");
        System.out.println("We orderded a " + drink.getName() + "\n");
        System.out.println(drink);
        
        drink  = store.OrderDrink("french75");
        System.out.println("We orderded a " + drink.getName() + "\n");
        System.out.println(drink);
        
        drink  = store.OrderDrink("moscowMule");
        System.out.println("We orderded a " + drink.getName() + "\n");
        System.out.println(drink);   
         
        drink  = store.OrderDrink("redsangaria");
        System.out.println("We orderded a " + drink.getName() + "\n");
        System.out.println(drink);        
        
    }
    
}
