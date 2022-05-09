public class SuzoHappAdapter implements HopperInterface{
    
    private SuzoHapp adaptee;  
    private Integer address;
    
    public SuzoHappAdapter(){
       this.adaptee =  new SuzoHapp(); 
    }
        
    public void setAddress(Integer address){
        this.address = address;
    }
    
    public Integer dispense(Integer amount){
        return this.adaptee.dispense(this.address, amount);
    }
}