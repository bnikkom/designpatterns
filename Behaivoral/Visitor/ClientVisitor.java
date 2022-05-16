public class ClientVisitor{
    
    public static void main(String args[]){
    Operation operation = new Operation();   
    operation.accept(new VisitorJob());
    operation.display();
    }
    
}