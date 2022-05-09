public class Dispensers {
    public static void main(String args[]){
        
        String hoppersetup = "suzohapp";
   
        HopperInterface hopper;
        SuzoHappAdapter suzohopper;
        CompactAdapter compacthopper;
        
        if(hoppersetup == "suzohapp"){
            suzohopper = new SuzoHappAdapter();
            suzohopper.setAddress(3);
            hopper     = suzohopper;
        }
        else{
           compacthopper =  new CompactAdapter();        
           hopper        =  compacthopper;
        }
        
       hopper.dispense(100);        
       
    }
}