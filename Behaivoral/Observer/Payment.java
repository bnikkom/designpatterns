public class Payment implements Session {
    
    public Payment(Customer customer){
        customer.addObserver(this);
    }
    
    public void clear(){
        System.out.println("Payment Removed");
    }
    
    public void create(){
        System.out.println("Payment Initialized");
    }

}