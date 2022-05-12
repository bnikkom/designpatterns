public class ExpensiveServiceProxy  implements ExpensiveServiceInterface {
    ExpensiveService expensiveService;
    public ExpensiveServiceProxy(){
        if(expensiveService == null)
            expensiveService = new ExpensiveService();        
    }
    
    public void test(Integer testNumber){
        if(testNumber > 10){
            expensiveService.test(testNumber);
        } 
        else System.out.println("THIS IS NOT ALLOWED");
    }
        

}