abstract class Middleware {

    private Middleware next;

    
    public boolean proceedNext(){
         if(this.next != null)
               return this.next.check();
          else return true;        
    }
    
    public boolean check(){
       System.out.println("End Reached : Athenticating");
       return true;
    }
    
    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }
}