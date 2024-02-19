//calses abstractas no pueden tener objetos
public abstract class  Propiedades {



    private String Marca;
    private String tipo;
    private double potencia;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public Propiedades(String marca, double potencia) {
        Marca = marca;
        this.potencia = potencia;
    }

    public abstract double getconsumo(int horas);
    public  double getCosteConsumo(int horas, double costeHora){
        return horas*costeHora;
    }

    @Override
    public String toString() {
        return "Propiedades{" +
                "potecia=" + potencia +
                ", Marca='" + Marca + '\'' +
                ", Tipo='" + tipo + '\'' +
                '}';
    }
}
