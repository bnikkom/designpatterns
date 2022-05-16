public class ClientTester {

    public static void main(String args[]){
        TesterOrigin    origin    = new TesterOrigin();
        TesterCareTaker caretaker = new TesterCareTaker();
            
        origin.setTestValue("test1");
        origin.save();        
        caretaker.add(origin.getState());       
        origin.setTestValue("test2");
        origin.save();        
        caretaker.add(origin.getState());        
        System.out.println(origin.getState().getTestValue());        
        origin.restore(caretaker.getMemento(0));        
        System.out.println(origin.getState().getTestValue());
        origin.restore(caretaker.getMemento(1));        
        System.out.println(origin.getState().getTestValue());        
    }

}