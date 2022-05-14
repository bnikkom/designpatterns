public class Client{
    public static void main(String args[]){
        
        Mediator mediator           = new Mediator();
        BrickCharger brickCharger   = new BrickCharger(mediator);
        Phone phone                 = new Phone(mediator);
        
        brickCharger.plugIn();
        //brickCharger.plugOut();          
        if(phone.chargingStatus())
            System.out.println("Phone Charging");
        else System.out.println("Phone NOT Charging");
        
                
    }
}