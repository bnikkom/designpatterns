public class CarPatternMold implements PlasticToy{

    private MoldingPlasticToys car;
        
    public CarPatternMold(){
        this.car = new MoldingPlasticToys("Car");
    }
    
    public void test(){
        
    }
        
    public MoldingPlasticToys getMoldedToy(){
        return this.car;
    }

}