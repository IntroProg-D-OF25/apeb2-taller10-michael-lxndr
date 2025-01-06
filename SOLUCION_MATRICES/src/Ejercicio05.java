/**
 * Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas. Utiliza una matriz bidimensional para almacenar los
 * productos disponibles en la tienda, con información como nombre, precio y cantidad. El programa debe permitir facturar un producto dado su código,
 * y unidades deseadas. Adicional se debe agregar a la factura al 15% del IVA, y si la compra superar los $100, se debe aplicar un descuento.
 **/
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        // Matriz bidimensional para el inventario (nombre, precio, cantidad)
        Object[][] inventario = {
                {"Leche", 01.0, 30},
                {"Queso", 03.0, 30},
                {"Quesillo", 02.0, 40},
                {"Chicle", 00.50, 100},
                {"Cafe", 1.20, 10},
                {"Chifles", 00.60, 100}
        };

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ver inventario");
            System.out.println("2. Facturar producto");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarInventario(inventario);
                    break;
                case 2:
                    facturarProducto(inventario, scanner);
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }

    // Mostrar el inventario
    public static void mostrarInventario(Object[][] inventario) {
        System.out.println("\n--- Inventario ---");
        System.out.printf("%-10s %-10s %-10s\n", "Código", "Nombre", "Precio", "Cantidad");
        for (int i = 0; i < inventario.length; i++) {
            System.out.printf("%-10d %-10s $%-9.2f %-10d\n", i + 1, inventario[i][0], (double) inventario[i][1], (int) inventario[i][2]);
        }
    }

    // Facturar producto
    public static void facturarProducto(Object[][] inventario, Scanner scanner) {
        System.out.println("\n--- Facturar Producto ---");
        mostrarInventario(inventario);
        System.out.print("Ingrese el código del producto: ");
        int codigo = scanner.nextInt() - 1;

        if (codigo < 0 || codigo >= inventario.length) {
            System.out.println("Código inválido.");
            return;
        }

        System.out.print("Ingrese la cantidad deseada: ");
        int cantidad = scanner.nextInt();

        if (cantidad > (int) inventario[codigo][2]) {
            System.out.println("No hay suficiente stock disponible.");
            return;
        }

        // Actualizar el inventario
        inventario[codigo][2] = (int) inventario[codigo][2] - cantidad;

        // Calcular subtotal, IVA, y total
        double precioUnitario = (double) inventario[codigo][1];
        double subtotal = precioUnitario * cantidad;
        double iva = subtotal * 0.15;
        double total = subtotal + iva;

        // Aplicar descuento si supera $100
        double descuento = 0.0;
        if (total > 100) {
            descuento = total * 0.1; // 10% de descuento
            total -= descuento;
        }

        // Mostrar factura
        System.out.println("\n--- Factura ---");
        System.out.printf("Producto: %s\n", inventario[codigo][0]);
        System.out.printf("Cantidad: %d\n", cantidad);
        System.out.printf("Precio unitario: $%.2f\n", precioUnitario);
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("IVA (15%%): $%.2f\n", iva);
        if (descuento > 0) {
            System.out.printf("Descuento (10%%): $%.2f\n", descuento);
        }
        System.out.printf("Total a pagar: $%.2f\n", total);
    }
}

/*
 * Salida:
 * --- Menú ---
 * 1. Ver inventario
 * 2. Facturar producto
 * 3. Salir
 * Seleccione una opción: 1

 * --- Inventario ---
 * Código     Nombre     Precio
 * 1          Leche      $1.00      30
 * 2          Queso      $3.00      30
 * 3          Quesillo   $2.00      40
 * 4          Chicle     $0.50      100
 * 5          Cafe       $1.20      10
 * 6          Chifles    $0.60      100
 *
 * --- Menú ---
 * 1. Ver inventario
 * 2. Facturar producto
 * 3. Salir
 * Seleccione una opción: 2

 * --- Facturar Producto ---

 * --- Inventario ---
 * Código     Nombre     Precio
 * 1          Leche      $1.00      30
 * 2          Queso      $3.00      30
 * 3          Quesillo   $2.00      40
 * 4          Chicle     $0.50      100
 * 5          Cafe       $1.20      10
 * 6          Chifles    $0.60      100
 * Ingrese el código del producto: 4
 * Ingrese la cantidad deseada: 60

 * --- Factura ---
 * Producto: Chicle
 * Cantidad: 60
 * Precio unitario: $0.50
 * Subtotal: $30.00
 * IVA (15%): $4.50
 * Total a pagar: $34.50

 * --- Menú ---
 * 1. Ver inventario
 * 2. Facturar producto
 * 3. Salir
 * Seleccione una opción: 1

 * --- Inventario ---
 * Código     Nombre     Precio
 * 1          Leche      $1.00      30
 * 2          Queso      $3.00      30
 * 3          Quesillo   $2.00      40
 * 4          Chicle     $0.50      40
 * 5          Cafe       $1.20      10
 * 6          Chifles    $0.60      100

 * --- Menú ---
 * 1. Ver inventario
 * 2. Facturar producto
 * 3. Salir
 * Seleccione una opción: 3
 * Gracias por usar el sistema.
*/