import java.util.Map;
import java.util.HashMap;

public class AndroidPrototypeFactory
{
    private static final Map<Integer, AndroidRobot> prototypes = new HashMap<>();     
    
    static{
        prototypes.put(18, new Android18());
        prototypes.put(17, new Android17());            
    }
    
    public AndroidRobot getProtoType(Integer version){
        return prototypes.get(version).clone();
    }   
    
}