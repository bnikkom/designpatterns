public class CompactAdapter implements HopperInterface{
    
    private CompactHopper adaptee;
    
    public CompactAdapter(){
        this.adaptee = new CompactHopper();
    }
    
    public Integer dispense(Integer amount){
        return this.adaptee.dispense(amount);
    }

}