public class Android18 implements AndroidRobot {
    
    public String introduce(){
        return "Im Android 18";
    }
    
    public AndroidRobot clone(){
        return new Android18();
    }
}