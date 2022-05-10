public class PaymentFacade
{
   public void onPayment(Integer amount, String type){
       if(type.equalsIgnoreCase("coin")){
        Coin coin = new Coin();
        coin.log();
       }
       else if(type.equalsIgnoreCase("bill")){
        Bill bill = new Bill();
        bill.log();        
       }
       else{
        Card card = new Card();
        card.log();            
       }
       
   }     
}