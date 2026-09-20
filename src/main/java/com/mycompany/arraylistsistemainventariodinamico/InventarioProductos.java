package com.mycompany.arraylistsistemainventariodinamico;

import java.util.Scanner;
import java.util.ArrayList;

public class InventarioProductos {

   public static Scanner sc;
    public static ArrayList<String> ListaProductos = new ArrayList<>();
    public static int opcion = 0;
    

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        System.out.println("---Bienvenido al sistema inventario de registro---");
        System.out.println("Ingrese 5 productos:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Producto#" + (i + 1) + ":");
            String nombreProducto = sc.nextLine();
            ListaProductos.add(nombreProducto);

        }

        do {
            System.out.println("Que deseas hacer?");
            System.out.println("1.Ver Productos");
            System.out.println("2.Agregar Producto");
            System.out.println("3.Editar Producto");
            System.out.println("4.Eliminar Producto");
            System.out.println("0.Salir");
            System.out.println("Seleccione una opcion  del menu");
            opcion = sc.nextInt();

            System.out.println("********");
            switch (opcion) {
                case 1:
                    verProducto();
                    break;
                case 2:
                    agregarProducto();
                    break;
                case 3:
                    editarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;

            }
        } while (opcion != 0);

        System.out.println("----FIN DEL PROGRAMA----");
    }

    public static void verProducto() {
        System.out.println("*******");
        System.out.println("--Lista de Productos---");

        for (int i = 0; i < ListaProductos.size(); i++) {
            System.out.println(ListaProductos.get(i));

        }
    }

    public static void agregarProducto() {
        System.out.println("Cuantos productos dessea agregar:");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre Producto:");
            String nuevoProducto = sc.nextLine();
            ListaProductos.add(nuevoProducto);
        }
    }

    public static void editarProducto() {
        System.out.println("de esta lista de productos cual deseea moddificar");
        for (int i = 0; i < ListaProductos.size(); i++) {
            System.out.println("" + i + "->" + ListaProductos.get(i));
        }
        System.out.println("Elija una de las opciones a editar ");
        int opcionEditar = sc.nextInt();
        sc.nextLine();

        System.out.println("con que nombre desea reemplazarlo?");
        String nuevoNombre = sc.nextLine();
        ListaProductos.set(opcionEditar, nuevoNombre);
        sc.nextLine();
    }

    public static void eliminarProducto() {
        System.out.println("que producto deseea eliminar?");

        for (int i = 0; i < ListaProductos.size(); i++) {
            System.out.println(i + " -> " + ListaProductos.get(i));
        }
        System.out.println("Elija el producto que desea eliminar:");
        int opcionEliminar = sc.nextInt();

        ListaProductos.remove(opcionEliminar);

        System.out.println("se eliminado correctamente.");

    }
}