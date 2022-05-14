public class ClientDispense {

    public static void main(String args[]){
        
        //Dispenser dispenser = new SuzoHapp();
        Dispenser dispenser = new CompactHapper();
        
        dispenser.setPort(80);
        dispenser.connect();
    }

}