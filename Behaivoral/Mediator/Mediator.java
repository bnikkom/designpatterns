public class Mediator {
    
    private boolean adapterPlugged;
    private boolean phonePlugged;
    
    public boolean getAdapterPlugged(){
        return adapterPlugged;
    }
    
    public void setAdapterPlugged(boolean adapterPlugged){
       this.adapterPlugged = adapterPlugged; 
    }
        
    public boolean getPhoneCharge(){
        return phonePlugged;
    }
    
    public void setPhoneCharge(boolean phonePlugged){
       this.phonePlugged = phonePlugged; 
    }        
    
}