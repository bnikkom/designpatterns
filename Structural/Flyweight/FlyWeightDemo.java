import java.util.*;

public class FlyWeightDemo{
    public static void main(String args[]){
       Forest.addTree("Coconut", 1, 20);  
       Forest.addTree("Coconut", 1, 21);
       Forest.addTree("Mango", 1, 20);
       Forest.addTree("Mango", 1, 20); 
       Forest.addTree("Mango", 1, 20);  
       Forest.addTree("Abaca", 1, 20);         
       ArrayList<Tree> forestTrees =  Forest.getForest();
  
       for(Tree tree : forestTrees){
           System.out.println("Name : "+tree.getName());
       }
      
    }
}