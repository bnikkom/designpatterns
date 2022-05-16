public class TurnOff implements EletricFanInterface{

    private EletricFanInterface state; 
    
    public TurnOff(){
        System.out.println("Turnoff constructor");
    }
    
    public void pull(ElectricFan fan){
        System.out.println("From Level 2 to Off"); 
        if(state==null)
            state = new  Level1();                
        fan.setState(state);        
    }
    
}