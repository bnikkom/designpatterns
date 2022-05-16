class ElectricFan {

    private static EletricFanInterface state;
    private static ElectricFan fan;
            
    public static void pull(){
      if(state==null){
         state = new TurnOff();
         fan   = new ElectricFan();
         state.pull(fan);
      }
      else{
         state.pull(fan);
      }
    }
    
    public void setState(EletricFanInterface fan){
         this.state = fan;   
    }

}