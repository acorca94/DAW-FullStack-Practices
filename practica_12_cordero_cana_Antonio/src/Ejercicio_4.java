import java.util.Scanner;
public class Ejercicio_4 {
    public void Ej4(){
                Scanner scanner = new Scanner(System.in);
                double costoTotal = 0.0;
                while (true) {
                    System.out.print("Introduce la cantidad del producto a vender: ");
                    int cantidad = scanner.nextInt();
                    if (cantidad == 0) {
                        break;
                    }
                    System.out.print("Introduce el precio del producto: ");
                    double precio = scanner.nextDouble();
                    double costoProducto = cantidad * precio;
                    costoTotal += costoProducto;
                }
                System.out.println("El costo total del pedido es: " + costoTotal);
    }
}
