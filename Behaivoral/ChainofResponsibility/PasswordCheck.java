public class PasswordCheck extends Middleware{

     public boolean check(){
        Boolean okPassword = true;            
        if(okPassword){
          System.out.println("OK Password... checking next");
          return proceedNext();
        }
        else {
          System.out.println("Not OK Password...Exit");            
         return false;
        }
    }

}