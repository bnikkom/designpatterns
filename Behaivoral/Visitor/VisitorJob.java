public class VisitorJob implements VisitorInterface {
    public void doExtra(OperationInterface operation){
        Operation x = (Operation) operation;
        x.setData("adding decoration");
        System.out.println("Im doing Extra for $10");
    }
}