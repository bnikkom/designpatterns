abstract class EquipmentAbstract implements EquipmentInterface{
    private EquipmentInterface core;
    private Scope scope;
    
    public EquipmentAbstract(EquipmentInterface core){
        this.core = core;
    }
    
    public void equip(){
        core.equip();
    }
    
    public void setScope(Scope scope){
       this.scope = scope;
    }
    
    public void testScope(){
       this.scope.testScope();
    }

}