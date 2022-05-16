public class ClientStrategy {
    
    public static void main(String args[]){
       
    AlgorithmInterface[] algorithms = {new Sum(), new Subtract()};
        for (AlgorithmInterface algorithm : algorithms) {
            algorithm.solve(1,2);
        }
    }

}