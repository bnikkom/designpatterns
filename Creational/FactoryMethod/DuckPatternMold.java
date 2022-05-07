public class DuckPatternMold implements PlasticToy {
    
    private MoldingPlasticToys plasticToy;

    public DuckPatternMold(){
        this.plasticToy = new MoldingPlasticToys("Duck");        
    }
    
    public MoldingPlasticToys getMoldedToy(){
        return this.plasticToy;
    }
    
    

}