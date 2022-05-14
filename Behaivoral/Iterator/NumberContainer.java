import java.util.ArrayList;

public class NumberContainer implements Containter {
        
    NumberIterator iterator;
    private ArrayList<Integer> numberCollection = new ArrayList<>();
    
    
    public NumberContainer(){
        iterator = new NumberIterator();
    }

    public NumberIteratorInterface getIterator(){
       return iterator;
    }
    
    public void add(Integer number){
        numberCollection.add(number);
    }
    
    private class NumberIterator implements NumberIteratorInterface {
        
        int index;
        
        public Object next(){    
             return hasNext() ? numberCollection.get(index++) : null;                            
        }
        
        public boolean hasNext(){
           return index < numberCollection.size();
        }
            
    }


}