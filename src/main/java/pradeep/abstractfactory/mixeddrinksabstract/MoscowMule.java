
package pradeep.abstractfactory.mixeddrinksabstract;
public class MoscowMule extends MixedDrink{
    
    MixedDrinkIngredientFactory ingredientFactory;
    
    public MoscowMule(MixedDrinkIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    void prepare(){
        System.out.println("Preparing " + name);
        juice = ingredientFactory.createJuice();
        vodka = ingredientFactory.createVodka();
        cubes = ingredientFactory.createCubes();
        
        
    }
}