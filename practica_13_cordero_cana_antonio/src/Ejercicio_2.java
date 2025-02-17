import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_2 {
    public void Ej2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crear una opción en Java que cree un inventario de una tienda, " +
                "se tendrán que almacenar 10 productos con su cantidad, " +
                "posteriormente se tendrán que vender alguno de los productos y se tendrá que mostrar el inventario. " +
                "Se tendrá que usar LinkedHashMap.");

                // LinkedHashMap para almacenar los productos y cantidades
                LinkedHashMap<String, Integer> inventory = new LinkedHashMap<>();

                // Productos con su cantidad
                inventory.put("Producto1", 5);
                inventory.put("Producto2", 10);
                inventory.put("Producto3", 3);
                inventory.put("Producto4", 7);
                inventory.put("Producto5", 2);
                inventory.put("Producto6", 8);
                inventory.put("Producto7", 4);
                inventory.put("Producto8", 6);
                inventory.put("Producto9", 1);
                inventory.put("Producto10", 9);

                // Venta:
                sellProduct(inventory, "Producto2", 3);

                // Inventario actualizado
                System.out.println("Inventario actualizado:");
                for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                    System.out.println("Producto: " + entry.getKey() + ", Cantidad: " + entry.getValue());
                }
            }

            // Método para vender un producto y actualizar la cantidad en el inventario
            public static void sellProduct(LinkedHashMap<String, Integer> inventory, String product, int quantity) {
                if (inventory.containsKey(product)) {
                    int currentQuantity = inventory.get(product);
                    if (currentQuantity >= quantity) {
                        inventory.put(product, currentQuantity - quantity);
                        System.out.println("Se han vendido " + quantity + " unidades de " + product + ".");
                    } else {
                        System.out.println("No hay suficientes existencias de " + product + " para vender.");
                    }
                } else {
                    System.out.println("El producto " + product + " no se encuentra en el inventario.");
                }
    }
}
