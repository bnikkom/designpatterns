import java.util.ArrayList;

public class Folder implements FilesInterface{
    
    private String folderName;
    private ArrayList files = new ArrayList();
    
    public Folder(String folderName){
        this.folderName =  folderName;
    }
    
    public void add(Object obj){
        files.add(obj);
    }
    
    public void list(){
        System.out.println(Client.buffer+this.folderName);
        Client.buffer.append("   ");
        for(Object file : files){
            FilesInterface ff =  (FilesInterface) file;
            ff.list();
        }
        Client.buffer.setLength(Client.buffer.length() - 3);
    }
    
    
    
}