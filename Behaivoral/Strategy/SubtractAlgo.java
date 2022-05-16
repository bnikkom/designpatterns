abstract class SubtractAlgo implements AlgorithmInterface {
            
    public void solve(int a, int b){
        //do algorithm for solving    
        doChecking();
        doInvalidation();
    }
    abstract void  doChecking();
    abstract void  doInvalidation(); 
    
}