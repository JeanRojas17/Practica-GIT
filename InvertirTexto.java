import java.util.Scanner;

public class InvertirTexto {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String texto;
        
        do {
            System.out.print("Ingrese un texto o escriba 'salir' para terminar: ");
            texto = sc.nextLine();
            if (texto.equalsIgnoreCase("salir")) {
                break;
            }
            System.out.println("El texto invertido es: " + new StringBuilder(texto).reverse());
        } while (true);

        sc.close();
    }
}