public class ExtendedMagazine extends EquipmentAbstract{

    public ExtendedMagazine(EquipmentInterface equipment){
        super(equipment);
    }
    
    public void testExtendedMagazine(){
        System.out.println(" ExtendedMagazine");        
    }
    
    public void equip(){
        super.equip();
        testExtendedMagazine();
    }
    
    

}