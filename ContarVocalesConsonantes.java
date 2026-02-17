import java.util.Scanner;

public class ContarVocalesConsonantes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = Character.toLowerCase(palabra.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            } else if (letra >= 'a' && letra <= 'z') {
                consonantes++;
            }
        }

        System.out.println("La palabra contiene " + vocales + " vocales y " + consonantes + " consonantes.");

        sc.close();
    }
}