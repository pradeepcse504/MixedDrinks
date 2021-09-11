
package pradeep.abstractfactory.mixeddrinksabstract;

public abstract class MixedDrinkStore {
    
    protected abstract MixedDrink createMixedDrink(String item);
    
    public MixedDrink orderMixedDrink( String item ){
        MixedDrink mixedDrink = createMixedDrink(item);
        System.out.println("---- Making a " + mixedDrink.getName() + "----");
        
        mixedDrink.prepare();
        mixedDrink.shake();
        mixedDrink.stir();        
        mixedDrink.serve();
        
        return mixedDrink;
        
        
    }
}
