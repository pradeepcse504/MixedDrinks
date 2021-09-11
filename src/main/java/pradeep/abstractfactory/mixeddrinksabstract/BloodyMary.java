
package pradeep.abstractfactory.mixeddrinksabstract;

public class BloodyMary extends MixedDrink{
    
    MixedDrinkIngredientFactory ingredientFactory;
    
    public BloodyMary(MixedDrinkIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    void prepare(){
        System.out.println("Preparing " + name);
        
        brandy = this.ingredientFactory.createBrandy();
        water = this.ingredientFactory.createWater();
        sugar = this.ingredientFactory.createSugar();
        
    }
}
