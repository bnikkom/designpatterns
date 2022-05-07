public class ToyPlasticFactory {

    public static void main(String args[]){
        String ToyPlastic = "car";
        PlasticToy toy;
        
        if(ToyPlastic.equalsIgnoreCase("duck")){
            toy = new DuckPatternMold();
        }
        else if(ToyPlastic.equalsIgnoreCase("car")) {
            toy = new CarPatternMold();
        }
        else toy = new CarPatternMold();
        
        MoldingPlasticToys moldingtoy = toy.getMoldedToy(); // Here is the created MoldingPlastic from the subclasses of MoldingPlasticToys

        
        System.out.println(moldingtoy.getMoldingPattern());
    }

}