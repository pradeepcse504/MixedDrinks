
package com.pradeep.mixeddrinks;

/**
 *
 * @author Pradeep
 */
public class MixedDrinksFactory {
    public MixedDrink CreateDrink(String drinkType){
        MixedDrink mixedDrink = null;

        if(drinkType.equalsIgnoreCase("bloodymary")){
            mixedDrink = new BloodyMary();
        }
        else if(drinkType.equalsIgnoreCase("french75")){
            mixedDrink = new French75();
        }
        else if(drinkType.equalsIgnoreCase("MoscowMule")){
            mixedDrink = new MoscowMule();
        }
        else if(drinkType.equalsIgnoreCase("redsangaria")){
            mixedDrink = new RedSangaria();
        }
        
        return mixedDrink;
    }
    
}
