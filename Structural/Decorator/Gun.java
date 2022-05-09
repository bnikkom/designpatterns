public class Gun {
    public static void main(String args[]){
        EquipmentAbstract gun = new ExtendedMagazine(new Scope(new Silencer(new FinalizeEquipment())));              
        gun.equip();
    }
}