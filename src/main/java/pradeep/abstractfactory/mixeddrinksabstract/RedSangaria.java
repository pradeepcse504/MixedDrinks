
package pradeep.abstractfactory.mixeddrinksabstract;

public class RedSangaria extends MixedDrink{
    
    MixedDrinkIngredientFactory ingredientFactory;
    
    public RedSangaria(MixedDrinkIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    void prepare(){
        System.out.println("Preparing " + name);
        sugar = ingredientFactory.createSugar();
        juice = ingredientFactory.createJuice();
        water = ingredientFactory.createWater();
        cubes = ingredientFactory.createCubes();
        
    }
}