abstract class DoughnutBuilder {
    
    protected Doughnut doughnut;
    
    public Doughnut newDoughnut(){
        doughnut = new Doughnut();
        return this.doughnut;
    }    
    
    
    public Doughnut getDoughnut(){
        return doughnut;
        
    }
    
    public abstract void buildToppings();
    public abstract void buildStuffing();
    
}