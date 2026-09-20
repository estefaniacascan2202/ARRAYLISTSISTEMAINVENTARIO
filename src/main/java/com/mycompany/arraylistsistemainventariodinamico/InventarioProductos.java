package com.mycompany.arraylistsistemainventariodinamico;

import java.util.Scanner;
import java.util.ArrayList;

public class InventarioProductos {

    public static Scanner sc;
    public static ArrayList<String> listaProductos = new ArrayList<>();
    public static int opcion = 0;

    public static void main(String[] args) {
        //Use rraylist y solicite 5 cosas al usuario para que ingrese
        //Debo usar los metodos del arraylist para demostrar su funcionalidad
        sc = new Scanner(System.in);
        System.out.println("--Bienvenido al sistema de registro de inventario--");
        System.out.print("ingrese 5 productos");
        for (int i = 0; i < 5; i++) {
            System.out.println("Producto #" + (i + 1) + "  :");
            String nombreProducto = sc.nextLine();
            listaProductos.add(nombreProducto);

        }

        do {
            System.out.println("Que desea hacer?");
            System.out.println("1.Ver todos los productos");
            System.out.println("2.Agregar productos");
            System.out.println("3.Editar Producto");
            System.out.println("4.Eliminar Producto");
            System.out.println("0.Salir");
            System.out.println("Seleccione una opcion del menu");
            opcion = sc.nextInt();

            System.out.println("******************+");
            switch (opcion) {
                case 1 ->
                    verProductos();
                case 2 ->
                    agregarProductos();
                case 3 ->
                    System.out.println("EDITANDO PRODUCTO");
                case 4 ->
                    System.out.println("ELIMINANDO PRODUCTO");

            }

        } while (opcion != 0);

        System.out.println("FIN DEL PROGRAMA, GRACIAS");

    }

    public static void verProductos() {
        System.out.println("********************");
        System.out.println("***Lista de Prodductos******");
        for (int i = 0; i < listaProductos.size(); i++) {

            System.out.println(listaProductos.get(i));
        }

    }

    public static void agregarProductos() {
        System.out.println("Cuantos productos desea agregar:");
        int cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre Producto");
            String nuevoProducto = sc.nextLine();
            listaProductos.add(nuevoProducto);
        }
    }

    public static void editarProductos() {
        System.out.println("De esta lista de productos cual deseas modificar");
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println("" + i + "->" + listaProductos.get(i));
        }

        System.out.println("Elija una de las opciones a editar:");
        int opcionEditar = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Con que nombre desea reemplazarlo?");
        String nuevoNombre = sc.nextLine();

        listaProductos.set(opcionEditar, nuevoNombre);

    }

    public static void eliminarProducto() {

    }

}
