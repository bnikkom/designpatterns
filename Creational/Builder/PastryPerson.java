import java.util.stream.DoubleStream;

public class PastryPerson {
     
    DoughnutBuilder builder;
    
    public void setDoughnutTask(DoughnutEnum doughnut){
      if(doughnut.equals(DoughnutEnum.ChocolateDoughnut)){
        this.builder =  new ChocolateDoughnutBuilder();  
        System.out.println("PastryPerson:I have a task to create chocolate doughnut");
      }
      else if(doughnut.equals(DoughnutEnum.StrawberryDoughnut)){
        this.builder =  new StrawBerryDoughnutBuilder();
        System.out.println("PastryPerson:I have a task to create strawberry doughnut");
      }
      else {
          System.out.println("PastryPerson:I have a task to create an unknown doughnut");    
      }

    }
    
    public Doughnut getDoughnut(){        
        if(this.builder instanceof ChocolateDoughnutBuilder){
            System.out.println("PastryPerson: Im getting the chocolate doughnut"); 
        }
        else if( this.builder instanceof StrawBerryDoughnutBuilder){
            System.out.println("PastryPerson: Im getting the strawberry doughnut"); 
        }        
        return builder.getDoughnut();        
    }
    
    public void makeDougnut(){
        builder.newDoughnut();
        builder.buildStuffing();
        builder.buildToppings();
    }


}