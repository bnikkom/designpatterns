abstract class AscendingAlgorithm extends Sorting{

    public void step2(){
    
        step2A();
        step2B();
        
    }
    
    public void step3(){
        System.out.println("Step 3. checking sorted data");
    }
    
    abstract void step2A();
    abstract void step2B();



}