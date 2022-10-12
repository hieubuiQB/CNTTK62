package Pizza;

public class PizzaClient {




    public void run() {
        Pizza pz1 = new Pizza(6,new Circle(5));
        System.out.println(pz1);
        Pizza pz2 = new Pizza(7,new Circle(4));
        System.out.println(pz2);
        Pizza pz3 = new Pizza(8,new Rectangle(6,2));
        System.out.println(pz3);
        Pizza pz4 = new Pizza(9,new Rectangle(5,3));
        System.out.println(pz4);



        PizzaDeal pd = new PizzaDeal();
        System.out.println(pz1 + " có ưu đãi tốt hơn " + pz2

                + ": " + pd.betterDeal(pz1, pz2));
        System.out.println(pz3 + " có ưu đãi tốt hơn " + pz4

                + ": " + pd.betterDeal(pz1, pz2));






    }


    public static void main (String[] nu) {

        new PizzaClient().run();

    }



}