abstract class SumAlgo implements AlgorithmInterface {
            
    public void solve(int a, int b){
        //do algorithm for solving   
        doValidation();        
        doComparison();
    }    
    abstract void doValidation();
    abstract void  doComparison();
    
}