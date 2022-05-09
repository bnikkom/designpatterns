public class Silencer extends EquipmentAbstract
{
    public Silencer(EquipmentInterface equipment){
        super(equipment);
  
    }
    
    public void testSilencer(){
        System.out.println(" silencer");
    }
    
    public void equip(){
        super.equip();
        testSilencer();
    }
 
}