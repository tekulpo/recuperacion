public class ObjProducto {
    int Codigo;
    String Nombre;
    int Cantidad;
    int Stockmin;
    public ObjProducto() {
    }
    public ObjProducto(int codigo, String nombre, int cantidad, int stockmin) {
        Codigo = codigo;
        Nombre = nombre;
        Cantidad = cantidad;
        Stockmin = stockmin;
    }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    public int getStockmin() {
        return Stockmin;
    }
    public void setStockmin(int stockmin) {
        Stockmin = stockmin;
    }
}
