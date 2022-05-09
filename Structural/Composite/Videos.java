public class Videos implements FilesInterface {

    private String fileName;
    
    public Videos(String fileName){
        this.fileName =  fileName;
    }

    public void list(){
        System.out.println(Client.buffer+fileName);
    }

}