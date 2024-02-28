//JUAN PABLO PALOMINO GUARIN
//FICHA 2821728
//FECHA 23-02-2023

//clase
public class Products {
    // atributos
    private String nombre;
    private double precio;
    private int stock;
    private String descripcion;
    private int id;
    private boolean habilitado;

    // retorna el estado actual
    public boolean isHabilitado() {
        return habilitado;
    }

    // set modifica el estado
    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    // retorna el valor actual del nombre
    public String getNombre() {
        return nombre;
    }

    // modifica el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
