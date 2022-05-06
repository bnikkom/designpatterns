public class DoughnutOrders {    
    public static void main(String args[]){
        PastryPerson person = new PastryPerson();
        person.setDoughnutTask(DoughnutEnum.StrawberryDoughnut);
        person.makeDougnut();        
        Doughnut served = person.getDoughnut();
        System.out.println("Stuffing :"+served.getStuffing());
        System.out.println("getToppings :"+served.getToppings());
    }
}