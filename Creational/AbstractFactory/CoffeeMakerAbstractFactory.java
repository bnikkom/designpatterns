public abstract class CoffeeMakerAbstractFactory {
   
    static CoffeeMakerAbstractFactory getFactory(String coffeemaker){
         if(coffeemaker.equalsIgnoreCase("starbucks"))   
              return new StarbucksCoffeeMaker();
         else return new NespressoCoffeeMaker();
    }

}