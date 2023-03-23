public class Pizzas {

    private int masa;
    private int size;
    private boolean relleno;
    private boolean salsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean pina;
    private boolean champinones;
    private boolean jamon;
    private int recogida;

    // Tipo de masa
    public static final int NORMAL= 1;
    public static final int FINA= 1;
    public static final int PAN = 2;

    // Tamaño de pizza
    public static final int PEQUENA = 0;
    public static final int MEDIANA = 2;
    public static final int GRANDE = 3;

    // Recogida

    public static final int TIENDA = 0;
    public static final int PARALLEVAR = 1;

    /**
     * Construcción predeterminada
     */
    public Pizzas() {
        this.masa = NORMAL;
        this.size = MEDIANA;
        this.relleno = false;
        this.salsa = false;
        this.cebolla = false;
        this.sinGluten = false;
        this.pina = false;
        this.champinones = false;
        this.jamon = true;
        this.recogida = TIENDA;
    }

    /**
     * Construcción personalizada
     * @param masa Tipo de masa
     * @param size Tamaño de la pizza
     * @param relleno Tipo de relleno
     * @param salsa Si lleva salsa o no
     * @param cebolla Si lleva Cebolla o no
     * @param sinGluten Si lleva gluten o no
     * @param pina Si lleva piña o no
     * @param champinones Si lleva champiñones o no
     * @param jamon Si lleva jamón o no
     * @param recogida Cómo la recibirá el cliente
     */
    Pizzas(int masa, int size, boolean relleno, boolean salsa, boolean cebolla, boolean sinGluten, boolean pina, boolean champinones, boolean jamon, int recogida) {
        this.masa = masa;
        this.size = size;
        this.relleno = relleno;
        this.salsa = salsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.pina = pina;
        this.champinones = champinones;
        this.jamon = jamon;
        this.recogida = recogida;
    }

    // Getters y Setters
    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean getRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public boolean getSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public boolean getCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean getSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean getPina() {
        return pina;
    }

    public void setPina(boolean pina) {
        this.pina = pina;
    }

    public boolean getChampinones() {
        return champinones;
    }

    public void setChampinones(boolean champinones) {
        this.champinones = champinones;
    }

    public boolean getJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public int getRecogida() {
        return recogida;
    }

    public void setRecogida(int recogida) {
        this.recogida = recogida;
    }

    @Override
    public String toString() {
        return "Pizza: " +
                "masa=" + masa +
                ", size=" + size +
                ", relleno=" + relleno +
                ", salsa=" + salsa +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", pina=" + pina +
                ", champinones=" + champinones +
                ", jamon=" + jamon +
                ", tipo de recogida=" + recogida;
    }
}
