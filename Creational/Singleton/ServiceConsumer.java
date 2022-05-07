public class ServiceConsumer extends ServiceProvider {
   
    private static ServiceProvider svc;
     
    public static ServiceProvider getInstance(){
      if(svc != null)          
          return svc;
      else {
        svc =  new ServiceProvider();  
        return svc;
        }
    }

}