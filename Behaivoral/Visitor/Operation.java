public class Operation implements OperationInterface {
    
    private String data;
    
    public void accept(VisitorInterface visitor){
        visitor.doExtra(this);
    }
    
    public String getData(){
       return data; 
    }
    
    public void setData(String data){
       this.data = data; 
    }
    
    public void display(){
        System.out.println(this.data);
    }

}