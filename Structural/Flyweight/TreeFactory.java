import java.util.ArrayList;

public class TreeFactory {    
    
    private ArrayList<Tree> trees = new ArrayList<Tree>(); 
      
    final public Tree add(String name, Integer x, Integer y){           
        Tree treePlanting;     
        Boolean exist = false;
        Integer index = 0; 
        for(Tree plantedTree : trees){        
            if(plantedTree.getX().equals(x)  && plantedTree.getY().equals(y) && plantedTree.getName().equals(name)){
                exist = true;
                plantedTree.setName(name);
                trees.set(index, plantedTree);
                System.out.println("(Found duplicate "+name+")");
                break;
            }   
            index++;
        }
        
        if(!exist){
            System.out.println("(New "+name+")");
            treePlanting = new Tree();
            treePlanting.setX(x);
            treePlanting.setY(y);
            treePlanting.setName(name);
            trees.add(treePlanting);  
            return treePlanting;
        } else treePlanting = trees.get(index);
        
       return treePlanting;
    }   
}