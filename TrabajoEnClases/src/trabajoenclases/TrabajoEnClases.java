
package trabajoenclases;

import java.util.Scanner;

public class TrabajoEnClases {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona el tipo de animal:");
        System.out.println("1. Mamifero");
        System.out.println("2. Ave");
        System.out.println("3. Reptil");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // lee toda la linea

        System.out.print("Ingresa el nombre del animal: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa la edad del animal: ");
        int edad = scanner.nextInt();

        switch (opcion) {
            case 1: 
                // Mamífero
                scanner.nextLine(); 
                System.out.print("Ingresa el tipo de pelaje: ");
                String tipoPelaje = scanner.nextLine();
                Mamifero mamifero = new Mamifero(nombre, edad, tipoPelaje);
                mamifero.comer();
                mamifero.amamantarCrias();
                break;
            case 2: 
                // Ave
                System.out.print("Ingresa la envergadura de las alas (en metros): ");
                double envergaduraAlas = scanner.nextDouble();
                Ave ave = new Ave(nombre, edad, envergaduraAlas);
                ave.comer();
                ave.volar();
                break;

            case 3: 
                // Reptil
                scanner.nextLine(); 
                System.out.print("Ingresa el tipo de escamas: ");
                String tipoEscamas = scanner.nextLine();
                Reptil reptil = new Reptil(nombre, edad, tipoEscamas);
                reptil.comer();
                reptil.arrastrarse();
                break;

            default:
                System.out.println("Opcion no valida.");
        }

    }
}    
    
    

