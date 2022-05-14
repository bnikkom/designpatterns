class BrickCharger {

    Mediator mediator;
    
    public BrickCharger(Mediator mediator){
       this.mediator =  mediator; 
    }
        
    public void plugIn(){
         mediator.setAdapterPlugged(true);
    }
    
    public void plugOut(){
         mediator.setAdapterPlugged(false);
    }    

}