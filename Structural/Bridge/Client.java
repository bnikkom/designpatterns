public class Client {

    public static void main(String args[]){
        TV tv = new TV();
        Radio radio = new Radio();
                       
        BasicRemote basicremote     =  new BasicRemote(tv);
        AdvanceRemote advanceremote =  new AdvanceRemote(tv);        
        basicremote.sendPowerOn();
        advanceremote.sendPowerOn();
    }
    
    

}