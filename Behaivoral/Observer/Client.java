public class Client {
    public static void main(String args[]){
        Customer customer = new Customer();    
        Cart cart         = new Cart(customer);
        Payment payment   = new Payment(customer);
        ChatBox chatBox   = new ChatBox(customer);        
        customer.login();
        System.out.println("-----------------------------");
        customer.logout();
    }
}