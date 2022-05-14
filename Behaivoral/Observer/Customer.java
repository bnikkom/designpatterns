import java.util.ArrayList;

public class Customer {  
    
    ArrayList<Session> session = new ArrayList<>();
    
    public void logout(){
        for(Session session : this.session){
            session.clear();        
        } 
    }   
        
    public void login(){
        for(Session session : this.session){
            session.create();        
        } 
    }   
    
    public void addObserver(Session session){
        this.session.add(session);   
    }
    
    
}