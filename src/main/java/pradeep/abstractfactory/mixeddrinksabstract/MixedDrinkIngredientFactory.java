
package pradeep.abstractfactory.mixeddrinksabstract;

public interface MixedDrinkIngredientFactory {
    public Cubes createCubes();
    public Alcohol createVodka();
    public Syrup createSyrup();
    public Juice createJuice();
    public Salts createSalts();
    public Sauce createSauce();
    public Veggie createVeggie();
    public Alcohol createBrandy();
    public Solvent createWater();
    public Sweatner createSugar();
    public Alcohol createGin();
}
