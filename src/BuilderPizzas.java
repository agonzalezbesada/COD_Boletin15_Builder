public class BuilderPizzas {

    protected Pizzas _pizza;

    public Pizzas build() {
        return this._pizza;
    }

    public BuilderPizzas() {
        _pizza = new Pizzas();
    }

    // Métodos de personalización
    public BuilderPizzas setMasa(int masa) {
        _pizza.setMasa(masa);
        return this;
    }

    public BuilderPizzas setSize(int size) {
        _pizza.setSize(size);
        return this;
    }

    public BuilderPizzas setRelleno(boolean relleno) {
        _pizza.setRelleno(relleno);
        return this;
    }

    public BuilderPizzas setSalsa(boolean salsa) {
        _pizza.setSalsa(salsa);
        return this;
    }

    public BuilderPizzas setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    public BuilderPizzas setSinGluten(boolean sinGluten) {
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    public BuilderPizzas setPina(boolean pina) {
        _pizza.setPina(pina);
        return this;
    }

    public BuilderPizzas setChampinones(boolean champinones) {
        _pizza.setChampinones(champinones);
        return this;
    }

    public BuilderPizzas setJamon(boolean jamon) {
        _pizza.setJamon(jamon);
        return this;
    }

    public BuilderPizzas setRecogida(int recogida) {
        _pizza.setRecogida(recogida);
        return this;
    }
}
