public class Main {
    public static void main(String[] args) {

        Pizzas pizza1 = new Pizzas("Integral",true,3,true,true,false,false,true,true);

        System.out.println(pizza1.toString());

        Pizzas pizza2 = new Pizzas("Normal",false,3,true,true,false,false,false,true);

        System.out.println(pizza2.toString());

        Pizzas pizza3 = new Pizzas("Fina",false,3,true,true,true,true,true,false);

        System.out.println(pizza3.toString());

    }
}
