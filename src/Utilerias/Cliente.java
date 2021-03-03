package Utilerias;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente{
    Scanner entrada = new Scanner(System.in);
    ArrayList<Articulos> articulos;
    ArrayList<Articulos> historial = new ArrayList<Articulos>();
    ArrayList<Asistente> asistentes = new ArrayList<Asistente>();
    String nombreCliente;
    String apellidoCliente;
    String identidadCliente;
    String membresia;

    // Constructor de la clase Clientes
    public Cliente(String nombreCliente, String apellidoCliente, String identidadCliente, String membresia){
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.identidadCliente = identidadCliente;
        this.membresia = membresia;
        this.articulos = new ArrayList<Articulos>();
        this.historial = new ArrayList<Articulos>();
    }

    //Mostrar datos de los clientes
    public void MostrarDatosCliente(){
        System.out.println("Nombre: " + nombreCliente + " " + apellidoCliente);
        System.out.println("Numero de identidad: " + identidadCliente);
    }

    // Asignar articulos al cliente
    public void Asignar_articulos(Articulos nuevo_articulo){
        nuevo_articulo.miCliente = this;
        this.articulos.add(nuevo_articulo);
    }

    // Historial de articulos de compra del cliente
    public void Historial_compras(Articulos nuevo_historial){
        nuevo_historial.compra = this;
        this.historial.add(nuevo_historial);
    }

    // Mostrar Asistentes de los clientes
    public void Asistentes_cliente(Asistente nuevo_asistente){
        nuevo_asistente.miAsistente = this;
        this.asistentes.add(nuevo_asistente);
    }

    // Mostrar carrito de compras
    public void Mostrar_carrito(){
        int i = 1;
        System.out.println("---------------------------------------");
        for(Articulos c : this.articulos){
            System.out.println("El articulo numero: " + i + " aniadido al carrito por el cliente " + nombreCliente + " " + apellidoCliente + " es: " + c.idArticulo + ", " + c.nombreArticulo + ", " + c.descripcion);
            i++;
        }
    }

    // Mostrar historial de compras
    public void Mostrar_historial(){
        int i = 1;
        System.out.println("---------------------------------------");
        for(Articulos c : this.historial){
            System.out.println("El articulo numero: " + i + " comprado por el cliente " + nombreCliente + " " + apellidoCliente + " es: " + c.idArticulo + ", " + c.nombreArticulo + ", " + c.descripcion);
            i++;
        }
    }

    // Mostrar articulos
    public void Listado_articulos(){
        int i = 1;
        System.out.println("---------------------------------------");
        for(Articulos c : this.historial){
            System.out.println(c.nombreArticulo + " = " + c.precio + " Lps" );
            i++;
        }
    }

    // Funcion que importa de Asistentes la informacion de los asistentes.
    public void Listado_Asistentes(){
        int i = 1;
        System.out.println("---------------------------------------");
        for(Asistente c : this.asistentes){
            System.out.println("Nombre= " + c.nombreAsistente + " = " + c.apellidoAsistente);
            i++;
        }
    }

    // Total de la compra de los clientes
    public void Total_compra(){
        Scanner entrada = new Scanner(System.in);
        float descuento = 0, impuesto, total = 0, descuento_unitario, subtotal = 0, subtotal_unitario;
        int cantidad;

        if (membresia == "si"){
            for(Articulos c : this.historial) {
                // Ingresar la cantidad a comprar.
                System.out.println("----------------------------------------------------------------------------------------------------------------");
                System.out.println("Ingrese la cantidad de: " + c.nombreArticulo + " que compro el cliente: " + nombreCliente + " " + apellidoCliente);
                cantidad = entrada.nextInt();
                System.out.println("----------------------------------------------------------------------------------------------------------------");

                subtotal += (c.precio * cantidad);
                // subtotal += subtotal_unitario;
            }
            descuento_unitario = (float) (subtotal * 0.20);     // Si cuenta con membresia entonces tendra un 20% de descuento.
            descuento += (subtotal - descuento_unitario);
            impuesto = (float) (descuento * 0.15);
            total = descuento + impuesto;

            // Mensaje de salida de la factura
            System.out.println("FACTURA: ");
            System.out.println("------------------------------------------------------");
            System.out.println("**** ASISTENTE DE VENTAS ****");
            Listado_Asistentes();
            System.out.println("------------------------------------------------------");
            System.out.println("INFORMACION CLIENTE: ");
            System.out.println("Nombre= " + nombreCliente + " " + apellidoCliente);
            System.out.println("Identidad= " + identidadCliente);
            System.out.println("**** Si posee membresia!!! ****");
            Listado_articulos();
            System.out.println("Subtotal= " + subtotal + "Lps");
            System.out.println("Descuento del 20% = " + descuento_unitario + "Lps");
            System.out.println("Subtotal menos el Descuento 20% = " + descuento + "Lps");
            System.out.println("Impuesto 15%= " + impuesto + "Lps");
            System.out.println("TOTAL= " + total + "Lps");
            System.out.println("------------------------------------------------------");
        } else{
            for(Articulos c : this.historial) {
                // Ingresar cantidad a comprar
                System.out.println("Ingrese la cantidad de: " + c.nombreArticulo + " que compro el cliente: " + nombreCliente + " " + apellidoCliente);
                cantidad = entrada.nextInt();
                System.out.println("----------------------------------------------------------------------------------------------------------------");

                subtotal += (c.precio * cantidad);
            }     // Si cuenta con membresia entonces tendra un 20% de descuento.
            impuesto = (float) (subtotal * 0.15);
            total = subtotal + impuesto;

            // Mensaje de salida de la factura
            System.out.println("FACTURA: ");
            System.out.println("------------------------------------------------------");
            System.out.println("**** ASISTENTE DE VENTAS ****");
            Listado_Asistentes();
            System.out.println("------------------------------------------------------");
            System.out.println("INFORMACION CLIENTE: ");
            System.out.println("Nombre= " + nombreCliente + " " + apellidoCliente);
            System.out.println("Identidad= " + identidadCliente);
            System.out.println("**** Si posee membresia!!! ****");
            Listado_articulos();
            System.out.println("Subtotal= " + subtotal + "Lps");
            System.out.println("Impuesto 15%= " + impuesto + "Lps");
            System.out.println("TOTAL= " + total + "Lps");
            System.out.println("------------------------------------------------------");
        }
    }

    // Asignar asistente a los clientes
    public void Asignar_asistente(Asistente nuevo_asistente){
        nuevo_asistente.miAsistente = this;
        this.asistentes.add(nuevo_asistente);
    }

    // Funcion Mostrar orden
    public void Mostrar_orden(){
        System.out.println("---------------------------------------");
        for(Asistente c : this.asistentes){
                System.out.println("Nombre= " + c.nombreAsistente + " " + c.apellidoAsistente + " Id: " + c.idAsistente);
                System.out.println("Realizo las ordenes: ");
                System.out.println("--------------------------------------------------");
                System.out.println("Identidad: " + identidadCliente);
                System.out.println("Nombre: " + nombreCliente + " " + apellidoCliente);
                System.out.println("Y compro: ");
                Listado_articulos();
        }    
    }
}
