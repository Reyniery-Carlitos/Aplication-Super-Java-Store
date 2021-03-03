package Utilerias;

public class Articulos {
    public Cliente miCliente;
    public Cliente compra;
    String idArticulo;
    String nombreArticulo;
    String descripcion;
    int precio;

    // Constructor de la clase Articulos
    public Articulos(String idArticulo, String nombreArticulo, String descripcion, int precio){
        this.idArticulo = idArticulo;
        this.nombreArticulo = nombreArticulo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // mostrar mensaje de salida
    public String MostrarMensajeArticulo(){
        String mensajeSalida = this.nombreArticulo;
        return mensajeSalida;
    }
}
