abstract class Sorting{
    
    public void sort(){
        step1();
        step2();
        step3();
        step4();    
    }
    
    public void step1(){
        System.out.println("Step 1. Prepare Data");
    }
    
    abstract void step2();
    
    abstract void step3();
    
    public void step4(){
        System.out.println("Step 4. Present Sorted Data");
    }
    
}