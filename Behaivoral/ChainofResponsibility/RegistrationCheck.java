public class RegistrationCheck extends Middleware{

    public boolean check(){
        Boolean isRegistered = true;            
        if(isRegistered){
          System.out.println("OK Register... checking next");
          return proceedNext();
        }
        else {
          System.out.println("Not OK Register...Exit");            
         return false;
        }
    }

}