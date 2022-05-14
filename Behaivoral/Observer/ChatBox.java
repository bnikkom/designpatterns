public class ChatBox implements Session {
    
    public ChatBox(Customer customer){
        customer.addObserver(this);
    }
    
    public void clear(){
        System.out.println("Chatbox Offline");
    }
    
    public void create(){
        System.out.println("Chatbox Online");
    }

}