public class Client{
    public static void main(String args[]){
        NumberContainer numbers = new NumberContainer();
        NumberIteratorInterface iterator = numbers.getIterator();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(iterator.next().toString());
        System.out.println(iterator.next().toString());
        System.out.println(iterator.next().toString());
        
    }
}