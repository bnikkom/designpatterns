public class BasicRemote implements RemoteInterface{

    private DeviceInterface device;
    
    public BasicRemote(DeviceInterface device){
        this.device =  device;
    }
    
    public void sendPowerOn(){
        device.powerOn();
    }
    
    public void sendPowerOff(){
       device.powerOff();  
    }
}