public class PrototypeClient {

    public static void main(String args[]){
        AndroidPrototypeFactory factory = new AndroidPrototypeFactory();       
        AndroidRobot prototype = factory.getProtoType(17);
        System.out.println(prototype.introduce());
    }

}