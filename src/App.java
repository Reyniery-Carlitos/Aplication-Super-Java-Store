/* NOTA: PARA NO SOBRECARGAR UN MENSAJE EN LA SALIDA Y MOSTRAR MUCHOS MENSAJES, EL CODIGO DE LOS MENSAJES DE SALIDA ESTARAN COMENTADOS
POR LO QUE SI QUIERE MOSTRAR ALGO EN ESPECIFICO TENDRA QUE DESCOMENTAR DICHO BLOQUE DE CODIGO. 

SOBRE CADA BLOQUE DE CODIGO SE ESPECIFICA QUE MOSTRARA DE SALIDA. */

import Utilerias.*;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // CRECION DE LOS ASISTENTES
        Asistente As1 = new Asistente("Alex", "Oyuela", "As02");
        Asistente As2 = new Asistente("Miguel", "Leiva", "As01");

        // CREACION DE LOS CLIENTES.
        Cliente c1 = new Cliente("Carlos", "Rubio", "0807199905667", "si");
        Cliente c2 = new Cliente("Mario", "Hernandez", "0801199805345", "no");
        Cliente c3 = new Cliente("Maria", "Salgado", "0807199103000", "si");
        Cliente c4 = new Cliente("Elena", "Rodriguez", "0801199503721", "no");
        Cliente c5 = new Cliente("Jairo", "Casas", "0701198500030", "si");

        // CREACION DE LOS ARTICULOS
        Articulos a1 = new Articulos("T01", "Televisor", "Televisor Smart TV marca Samsung de 60pulg", 20000);
        Articulos a2 = new Articulos("C01", "Celular", "iPhone 11 de 124GB de almacenamiento, 8GB de RAM", 25000);
        Articulos a3 = new Articulos("I01", "Impresora", "Epson ecotank e450, flujo continuo", 5000);
        Articulos a4 = new Articulos("CMP01", "Computadora", "HP spectre x360", 18000);
        Articulos a5 = new Articulos("PS01", "Play Station 5", "Play station 5, 2TB de almacenamiento", 18000);
        Articulos a6 = new Articulos("HDD01", "Disco Duro", "Disco Duro de 2TB, 3.0", 2500);

        // Asignando articulos a los clientes (Al carrito de compras).
        c1.Asignar_articulos(a1);
        c1.Asignar_articulos(a2);
        c1.Asignar_articulos(a4);
        c1.Asignar_articulos(a4);

        c2.Asignar_articulos(a2);
        c2.Asignar_articulos(a4);
        c2.Asignar_articulos(a6);
        c2.Asignar_articulos(a3);

        c3.Asignar_articulos(a1);
        c3.Asignar_articulos(a5);

        c4.Asignar_articulos(a4);
        c4.Asignar_articulos(a6);
        c4.Asignar_articulos(a3);

        c5.Asignar_articulos(a2);
        c5.Asignar_articulos(a1);

        // Asignando Articulos al historial de compras por orden
        c1.Historial_compras(a1);
        c1.Historial_compras(a4);

        c2.Historial_compras(a6);
        c2.Historial_compras(a4);
        c3.Historial_compras(a1);
        c3.Historial_compras(a5);

        c4.Historial_compras(a3);

        c5.Historial_compras(a2);

        // ASIGNAR ASISTENTE DE VENTAS AL CLIENTE
        c1.Asignar_asistente(As2);
        c3.Asignar_asistente(As1);
        c5.Asignar_asistente(As1);

        c2.Asignar_asistente(As2);
        c4.Asignar_asistente(As2);

        // MOSTRAR DATOS DEL ASISTENTE
        // As1.MostrarMensajeAsistente();
        // As2.MostrarMensajeAsistente();

        // MOSTRAR DATOS DEL CLIENTE
        // c1.MostrarDatosCliente();
        // c2.MostrarDatosCliente();
        // c3.MostrarDatosCliente();
        // c4.MostrarDatosCliente();
        // c5.MostrarDatosCliente();

        // MOSTRAR LISTADO DEL CARRITO DE COMPRAS
        // System.out.println("---------------------------------------------------------------");
        // System.out.println("Listado de articulos en el carrito de compras de los clientes: ");
        // c1.Mostrar_carrito();
        // c2.Mostrar_carrito();
        // c3.Mostrar_carrito();
        // c4.Mostrar_carrito();
        // c5.Mostrar_carrito();

       // MOSTRAR LISTADO DEL HISTORIAL DE COMPRAS
        // System.out.println("---------------------------------------");
        // System.out.println("Historial de compras de los clientes: ");
        // c1.Mostrar_historial();
        // c2.Mostrar_historial();
        // c3.Mostrar_historial();
        // c4.Mostrar_historial();
        // c5.Mostrar_historial();

        // MOSTRAR FACTURA
        c1.Total_compra();
        c2.Total_compra();
        c3.Total_compra();
        c4.Total_compra();
        c5.Total_compra();

        // MOSTRAR ORDENES DE LOS ASISTENTES     
        // Cliente[] mi_asistente = new Cliente[5];
        // mi_asistente[0] = c1;
        // mi_asistente[1] = c2;
        // mi_asistente[2] = c4;
        // mi_asistente[3] = c3;
        // mi_asistente[4] = c5;

        // for (Cliente c : mi_asistente) {
        //     c.Mostrar_orden();            
        // }
    }
}
