public class client{
     
    public static void main(){
        ServiceProvider svcp = ServiceConsumer.getInstance();
        svcp.ping();
    }
    
    
}