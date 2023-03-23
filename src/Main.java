public class Main {
    public static void main(String[] args) {

        // Obtenemos nuestra pizza mediente build() usando el BuilderPizzas

        Pizzas pizza1 = new BuilderPizzas().build();

        Pizzas pizza2 = new BuilderPizzas()
                .setMasa(0)
                .setSize(1)
                .setRelleno(true)
                .setSalsa(true)
                .setCebolla(true)
                .setSinGluten(false)
                .setPina(false)
                .setChampinones(true)
                .setJamon(true)
                .setRecogida(1)
                .build();

        Pizzas pizza3 = new BuilderPizzas().setMasa(0).setSize(1).setRelleno(true).setSalsa(true).setCebolla(true).setSinGluten(true).setPina(true).setChampinones(true).setJamon(true).setRecogida(0).build();

        System.out.println(pizza1.toString());

        System.out.println(pizza2.toString());

        System.out.println(pizza3.toString());

    }
}
