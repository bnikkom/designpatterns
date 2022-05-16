public class Level2 implements EletricFanInterface{
    
   private EletricFanInterface state; 
    
    public Level2(){
        System.out.println("Level2 constructor");
    }
   
    public void pull(ElectricFan fan){
        System.out.println("From Level 1 to Level 2"); 
        if(state==null)
            state = new  TurnOff();                
        fan.setState(state);        
    }
    
}