
package pradeep.abstractfactory.mixeddrinksabstract;

public class French75 extends MixedDrink{
    
    MixedDrinkIngredientFactory ingredientFactory;
    
    public French75(MixedDrinkIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    void prepare(){
        System.out.println("Preparing " + name);
        cubes = ingredientFactory.createCubes();
        gin = ingredientFactory.createGin();
        syrup = ingredientFactory.createSyrup();
        
        
    }
}