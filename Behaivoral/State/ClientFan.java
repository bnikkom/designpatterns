public class ClientFan {

    public static void main(String args[]){
        int i = 0;
        while(i < 500){
        ElectricFan.pull(); // Note : this is expensive, new instance created every pull()
        i++;
    }
   
    }

}