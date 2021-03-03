package Utilerias;
import java.util.ArrayList;

public class Asistente {
    ArrayList <Cliente> clientes;
    String nombreAsistente;
    String apellidoAsistente;
    String idAsistente;
    public Cliente miAsistente;

    // Inicio del constructor de la clase Asistente
    public Asistente(String nombreAsistente, String apellidoAsistente, String idAsistente){
        this.nombreAsistente = nombreAsistente;
        this.apellidoAsistente = apellidoAsistente;
        this.idAsistente = idAsistente;
    }

    // Datos de salida para Factura
    public void MostrarDatosAsistente(){
        System.out.println(nombreAsistente);
        System.out.println(apellidoAsistente);
    }

    // Mostrar mensaje de informacion del asistente.
    public void MostrarMensajeAsistente(){
        System.out.println("Nombre del asistente: " + this.nombreAsistente + " " + this.apellidoAsistente);
        System.out.println("Identificador del asistente: " + this.idAsistente);
        System.out.println("----------------------------------------------------------------------------");

    }
}
