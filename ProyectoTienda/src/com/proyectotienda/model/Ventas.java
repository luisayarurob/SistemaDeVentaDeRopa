import java.lang.reflect.Array;

public class Ventas {
    private int id;
    private Cliente cliente;
    private String fecha;
    private ArrayList<Producto> productos;
    private double total;

    public Ventas() {
    }

    public Ventas(int id, Cliente cliente, String fecha, ArrayList<Producto> productos, double total) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.productos = productos;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
