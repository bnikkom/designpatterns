import java.util.ArrayList;

public class TesterCareTaker {

    private ArrayList<TesterMemento> testerMementos = new ArrayList<>();
    
    public void add(TesterMemento testerMemento){
        testerMementos.add(testerMemento);
    }
    
    public TesterMemento getMemento(int index){
        return testerMementos.get(index);
    }

}