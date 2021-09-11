
package pradeep.abstractfactory.mixeddrinksabstract;

public class MixedDrinksMain {


    public static void main(String args[]) {
        MixedDrinkStore macDrinkStore = new MacMixedDrinkStore();
        MixedDrinkStore donaldDrinkStore = new DonaldToothPasteStore();

        MixedDrink mixedDrink = macDrinkStore.orderMixedDrink("redsangaria");
        System.out.println("Bensorn ordered " + mixedDrink + "\n");

        mixedDrink = donaldDrinkStore.orderMixedDrink("moscowmule");
        System.out.println("Kim ordered a " + mixedDrink + "\n");
        
        mixedDrink = macDrinkStore.orderMixedDrink("bloodymary");
        System.out.println("Jason ordered a " + mixedDrink + "\n");
        
        mixedDrink = donaldDrinkStore.orderMixedDrink("french75");
        System.out.println("Davidson ordered a " + mixedDrink + "\n");        
    }
}
