
package com.mycompany.parejarecuerdos;

import java.util.Scanner;

public class ParejaRecuerdos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos 
        System.out.println("Nombre del caballero: ");
        //arreglo tamaño 1
        String[] participante1 = new String[1];
        participante1[0] = scanner.nextLine();
        //aplica el split para separar con coma
        System.out.println("Ingrese sus recuerdos " + participante1[0] + ", separa con comas:");
        String[] recuerdos1 = scanner.nextLine().split(",");

        // Ingreso de datos Participante 2
        System.out.println("Nombre de la dama: ");
        String[] participante2 = new String[1];
        participante2[0] = scanner.nextLine();
        System.out.println("Ingrese sus recuerdos " + participante2[0] + " separa con comas:");
        String[] recuerdos2 = scanner.nextLine().split(",");
        
        
        //limpia espacios en blanco
        for (int i = 0; i < recuerdos1.length; i++) {
            recuerdos1[i] = recuerdos1[i].trim();  
        }
        for (int i = 0; i < recuerdos2.length; i++) {
            recuerdos2[i] = recuerdos2[i].trim();
        }
        
        // Encontrar recuerdos en común
        String[] recuerdosComun = new String[recuerdos1.length + recuerdos2.length];
        int indiceComun = 0;

        for (String recuerdo1 : recuerdos1) {
            for (String recuerdo2 : recuerdos2) {
                if (recuerdo1.equalsIgnoreCase(recuerdo2)) {  //aplico ignorecase para minusculas y mayusculas
                    
                    //para que no se repita 
                    boolean Agregado = false;
                    for (int j = 0; j < indiceComun; j++) {
                        if (recuerdosComun[j].equalsIgnoreCase(recuerdo1)) {
                            Agregado = true;
                            break;
                        }
                    }
                    if (!Agregado) {
                        recuerdosComun[indiceComun++] = recuerdo1;
                    }
                }
            }
        }

        // Mostrar recuerdos en común
        System.out.println("Recuerdos de la pareja en comun:");
        if (indiceComun == 0) {
            System.out.println("No hay recuerdos en comun.");
        } else {
            for (int i = 0; i < indiceComun; i++) {
                System.out.println("- " + recuerdosComun[i]);
            }
        }

        // Combinar todos los recuerdos únicos
        String[] recuerdosCombinados = new String[recuerdos1.length + recuerdos2.length];
        int indiceCombinado = 0;

        // Agregar recuerdos de recuerdos1
        for (String recuerdo1 : recuerdos1) {
            recuerdosCombinados[indiceCombinado++] = recuerdo1;
        }

        //agrega recuerdos del 2 uqe no esten en el 1 
        for (String recuerdo2 : recuerdos2) {
            boolean esUnico = true; //asumir que el recuerdo es unico
            for (String recuerdo1 : recuerdos1) {
                if (recuerdo1.equalsIgnoreCase(recuerdo2)) {
                    esUnico = false;
                    break;
                }
            }
            if (esUnico) {
                recuerdosCombinados[indiceCombinado++] = recuerdo2;
            }
        }

        // Mostrar recuerdos combinados
        System.out.println("Recuerdos combinados:");
        for (int i = 0; i < indiceCombinado; i++) {
            System.out.println("- " + recuerdosCombinados[i]);
        }
    }
}
