
package pradeep.abstractfactory.mixeddrinksabstract;

public class DonaldsMixedDrinkIngredientFactory implements MixedDrinkIngredientFactory {
    public Cubes createCubes(){
        return new Ice();
    }
    public Alcohol createVodka(){
        return new Vodka();
    }
    public Syrup createSyrup(){
        return new SugarSyrup();
    }
    public Juice createJuice(){
        return new LemonJuice();
    }
    public Salts createSalts(){
        return new SelerySalt();
    }
    public Sauce createSauce(){
        return new Worcestershire();
    }
    public Veggie createVeggie(){
        return new HotPepper();
    }
    public Alcohol createBrandy(){
        return new Brandy();
    }
    public Solvent createWater(){
        return new Water();
    }
    public Sweatner createSugar(){
        return new Sugar();
    }  
    public Alcohol createGin(){
        return new Gin();
    }

}
