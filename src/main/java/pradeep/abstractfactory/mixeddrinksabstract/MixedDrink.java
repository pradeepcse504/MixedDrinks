
package pradeep.abstractfactory.mixeddrinksabstract;

public abstract class MixedDrink {
    
    String name;
    
    Cubes cubes;
    Alcohol alcohol;
    Syrup syrup;
    Juice juice;
    Salts salts;
    Sauce sauce;
    Veggie veggie;
    Alcohol brandy;
    Solvent water;
    Sweatner sugar;
    Alcohol gin;
    Alcohol vodka;
    
    abstract void prepare();
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void stir(){
        System.out.println("Stir the mixture");
    }
    public void shake(){
        System.out.println("Shake the concortion");
    }
    public void serve(){
        System.out.println("Serve the Drink");
    }
    public String toString(){
        StringBuffer printer = new StringBuffer();
        printer.append("--- " + name + "----- \n");
        if(cubes != null){
            printer.append(cubes);
            printer.append("\n");
        }
        if(alcohol != null){
            printer.append(alcohol);
            printer.append("\n");
        }
        if(syrup != null){
            printer.append(syrup);
            printer.append("\n");
        }
        if(juice != null){
            printer.append(juice);
            printer.append("\n");
        }
        if(salts != null){
            printer.append(salts);
            printer.append("\n");
        }     
        if(sauce  != null){
            printer.append(sauce);
            printer.append("\n");
        }
        if(veggie  != null){
            printer.append(veggie);
            printer.append("\n");
        }        
        if(brandy  != null){
            printer.append(brandy);
            printer.append("\n");
        }
        if(water != null ){
            printer.append(water);
            printer.append("\n");
        }
        if(sugar != null ){
            printer.append(sugar);
            printer.append("\n");
        }
        if(gin != null ){
            printer.append(gin);
            printer.append("\n");
        }   
        if(vodka != null ){
            printer.append(vodka);
            printer.append("\n");
        }         
        return printer.toString();
    }
    
}
