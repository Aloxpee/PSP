public class Lavadora extends Propiedades {


    private double precio;
    private boolean aguacaliente;

    public Lavadora(String tipo, double potencia, double precio) {
        super(tipo, potencia);
        this.precio = precio;
        this.aguacaliente = false;

    }

    public Lavadora(String marca, double potencia, double precio, boolean aguacaliente) {
        super(marca, potencia);
        this.precio = precio;
        this.aguacaliente = aguacaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguacaliente() {
        return aguacaliente;
    }

    public void setAguacaliente(boolean aguacaliente) {
        this.aguacaliente = aguacaliente;
    }


    @Override
    public double getconsumo(int horas) {
        if (!this.aguacaliente) {//si agua fria es decir el boolean es falso
            return horas * this.getPotencia();
        } else {
            return horas * (this.getPotencia() + this.getPotencia() * 0.20);
        }
    }

    @Override
    public double getCosteConsumo(int horas, double costeHora) {
        return horas * costeHora;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguacaliente=" + aguacaliente +
                getCosteConsumo+
                '}';
    }
}

