
package pradeep.abstractfactory.mixeddrinksabstract;

public class DonaldToothPasteStore extends MixedDrinkStore{
    
    protected MixedDrink createMixedDrink(String item){
        MixedDrink mixedDrink = null;
        MixedDrinkIngredientFactory ingredientFactory = new DonaldsMixedDrinkIngredientFactory();
        
        if(item.equalsIgnoreCase("bloodymary")){
            mixedDrink = new   BloodyMary(ingredientFactory);
            mixedDrink.setName("Donald Style mixed Drink");

        }
        else if(item.equalsIgnoreCase("french75")){
            mixedDrink = new   French75(ingredientFactory);
            mixedDrink.setName("Donald Style mixed Drink");
        }
        else if(item.equalsIgnoreCase("redsangaria")){
            mixedDrink = new   RedSangaria(ingredientFactory);
            mixedDrink.setName("Donald Style mixed Drink");
        }
        else if(item.equalsIgnoreCase("moscowmule")){
            mixedDrink = new   MoscowMule(ingredientFactory);
            mixedDrink.setName("Donald Style mixed Drink");
        }
   
        return mixedDrink;
    }
    
}