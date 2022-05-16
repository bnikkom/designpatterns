public class Level1 implements EletricFanInterface{

    private EletricFanInterface state; 
    
    public Level1(){
        System.out.println("Level1 constructor");
    }
    
    public void pull(ElectricFan fan){
        System.out.println("From Turn Off to Level 1"); 
        if(state==null)
            state = new  Level2();                
        fan.setState(state);        
    }
        
}