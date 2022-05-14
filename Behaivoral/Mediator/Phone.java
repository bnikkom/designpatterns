public class Phone {

    Mediator mediator;
    
    public Phone(Mediator mediator){
       this.mediator =  mediator; 
    }
        
    public void chargePhone(){
        if(mediator.getAdapterPlugged())
              mediator.setPhoneCharge(true);
        else  mediator.setPhoneCharge(false); 
    }

    public boolean chargingStatus(){
       return mediator.getAdapterPlugged(); 
    }

}