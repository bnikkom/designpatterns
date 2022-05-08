public class AdvanceRemote implements RemoteInterface {

    private DeviceInterface device;
    
    public AdvanceRemote(DeviceInterface device){
        this.device = device;
    }
    
    public void sendPowerOn(){
        device.powerOn();
    }
    
    public void sendPowerOff(){
        device.powerOff();
    }
    
}