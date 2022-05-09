public class Pictures implements FilesInterface{

    private String fileName;
    
    public Pictures(String fileName){
        this.fileName = fileName;
    }
    
    public void list(){
        System.out.println(Client.buffer+fileName);
    }
}