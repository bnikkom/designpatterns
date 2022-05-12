public class StatusCheck extends Middleware{

     public boolean check(){
        Boolean statusOK = true;            
        if(statusOK){
          System.out.println("OK Status... checking next");
          return proceedNext();
        }
        else {
          System.out.println("Not OK Status...Exit");            
         return false;
        }
    }

}