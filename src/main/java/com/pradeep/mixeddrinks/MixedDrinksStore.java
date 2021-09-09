
package com.pradeep.mixeddrinks;

/**
 *
 * @author Pradeep
 */
public class MixedDrinksStore {
    
    MixedDrinksFactory factory;
    
    public MixedDrinksStore(MixedDrinksFactory factory){
        this.factory = factory;
    }
    public MixedDrink OrderDrink(String drinkType){
        MixedDrink mixedDrink;
        
        mixedDrink = this.factory.CreateDrink(drinkType);
        
        mixedDrink.prepare();
        mixedDrink.shake();
        mixedDrink.stir();
        mixedDrink.serve();
        
        return mixedDrink;
    }
}
