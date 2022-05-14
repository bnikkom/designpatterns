public class Cart implements Session {
    
    public Cart(Customer customer){
        customer.addObserver(this);
    }
    
    public void clear(){
        System.out.println("Cart Items Cleared");
    }
    
    public void create(){
        System.out.println("Cart Items Loaded");
    }

}