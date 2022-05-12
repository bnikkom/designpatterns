public class Client{

    public static void main(String args[]){
        ExpensiveServiceInterface svc = new ExpensiveServiceProxy();
        svc.test(3);
    }
    
    

}