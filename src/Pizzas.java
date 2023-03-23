public class Pizzas {

    private String masa;
    private boolean relleno;
    private int tipo;
    private boolean salsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean pina;
    private boolean champinones;
    private boolean jamon;

    Pizzas(String masa, boolean relleno, int tipo, boolean salsa, boolean cebolla, boolean sinGluten, boolean pina, boolean champinones, boolean jamon) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
        this.salsa = salsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.pina = pina;
        this.champinones = champinones;
        this.jamon = jamon;
    }

    @Override
    public String toString() {
        return "Pizza: " +
                "masa=" + masa +
                ", relleno=" + relleno +
                ", tipo=" + tipo +
                ", salsa=" + salsa +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", pina=" + pina +
                ", champinones=" + champinones +
                ", jamon=" + jamon;
    }
}
