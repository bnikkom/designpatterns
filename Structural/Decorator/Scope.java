class Scope extends EquipmentAbstract {
    
    public Scope(EquipmentInterface equipment){
        super(equipment);
    }
    
    public void equip(){
        super.equip();
        testScope();
    }
                
    public void testScope(){
        System.out.println("scope");
    }
    
    
    

}