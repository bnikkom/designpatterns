public class Android17 implements AndroidRobot{

    public String introduce(){
        return "Im Android 17";
    }
    
    public AndroidRobot clone(){
        return new Android17();
    }
    
}