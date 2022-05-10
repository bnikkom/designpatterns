import java.util.ArrayList;

abstract class Forest {
    
    private static ArrayList<Tree> forestTrees = new ArrayList<Tree>();
    private static TreeFactory treeFactory = new TreeFactory();
    
    public static void addTree(String name, Integer x, Integer y){        
        forestTrees.add( treeFactory.add(name, x, y));
    }
    
    public static ArrayList<Tree> getForest(){
        return forestTrees;
    }
    
    public static Tree getForestTree(Integer index){
          return forestTrees.get(index);
    }
}