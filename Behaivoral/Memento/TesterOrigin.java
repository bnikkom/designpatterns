public class TesterOrigin {

    private TesterMemento testerMemento;
    private String testValue;
        
    public void setTestValue(String testValue){
        this.testValue = testValue;
    }
    
    public void save(){ 
        testerMemento = new TesterMemento();
        testerMemento.setTestValue(this.testValue);    
    }
    
    public void restore(TesterMemento testerMemento){
        this.testerMemento = testerMemento;
    }
    
    public TesterMemento getState(){
        return this.testerMemento;
    }


}