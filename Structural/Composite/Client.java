public class Client {
    public static StringBuffer buffer =  new StringBuffer();
    public static void main(String args[]){
        Folder myDocument  =  new Folder("MyDocument");
        Folder pictures  =  new Folder("Pictures");
        Folder videos    = new Folder("Videos");
        Pictures garden  =  new Pictures("garden.png");
        Pictures house  =  new Pictures("house.png");
        Videos spiderman =  new Videos("spidername.mov");
        Videos avengers =  new Videos("avengers.mov");        
        pictures.add(garden);
        pictures.add(house);
        videos.add(spiderman);
        myDocument.add(pictures);
        myDocument.add(videos);
        
        myDocument.list();
    }


}