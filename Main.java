package supermercado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Supermercado sm = new Supermercado();

            // Productos iniciales
            sm.agregarProducto(new Producto("001","Arroz",5,3500));
             sm.agregarProducto(new Producto("002","Leche",7,4200));
              sm.agregarProducto(new Producto("003","Pan",12,800));
              sm.agregarProducto(new Producto("004","Huevos",2,12000));
              sm.agregarProducto(new Producto("005","Azucar",4,3000));
               sm.agregarProducto(new Producto("006","Cafe",3,9000));
               sm.agregarProducto(new Producto("007","Aceite",6,11000));
              sm.agregarProducto(new Producto("008","Sal",10,1200));
              sm.agregarProducto(new Producto("009","Galletas",8,2500));
              sm.agregarProducto(new Producto("010","Queso",3,7500));

        int opcion;

        do {

            System.out.println("\n--- SUPERMERCADO ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio (+5%)");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Buscar producto");
            System.out.println("5. Mostrar productos");
            System.out.println("6. Generar factura");
            System.out.println("7. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("Codigo:");
                    String codigo = sc.nextLine();

                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();

                    System.out.println("Cantidad:");
                    int cantidad = sc.nextInt();

                    System.out.println("Precio:");
                    double precio = sc.nextDouble();

                    Producto p = new Producto(codigo, nombre, cantidad, precio);
                    sm.agregarProducto(p);

                    break;

                case 2:

                    sm.modificarPrecio();

                    break;

                case 3:

                    System.out.println("Codigo del producto:");
                    String codEliminar = sc.nextLine();
                    sm.eliminarProducto(codEliminar);

                    break;

                case 4:

                    System.out.println("Codigo del producto:");
                    String codBuscar = sc.nextLine();

                    Producto encontrado = sm.buscarProducto(codBuscar);

                    if (encontrado != null) {
                        encontrado.mostrar();
                    } else {
                        System.out.println("Producto no encontrado");
                    }

                    break;

                case 5:

                    sm.mostrarProductos();

                    break;

                case 6:

                    sm.generarFactura();

                    break;

            }

        } while (opcion != 7);

    }
}
