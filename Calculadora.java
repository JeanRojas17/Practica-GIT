import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextDouble();

        System.out.println("\nSeleccione la operación a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("\nOpción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " +(num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " +(num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " +(num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " +(num1 / num2));
                } else {
                    System.out.println("No es posible dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}