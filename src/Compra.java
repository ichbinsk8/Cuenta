public class Compra implements Comparable<Compra> {

private double valor;
private String descripcion;

    public Compra(double valor, String descripción) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra; valor= " + valor +
                ", descripcion='" + descripcion;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}
