package org.example;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    
    public static int elegirOpciones() {
        System.out.println("MENU PIZZERIA");
        System.out.println("1. Mostrar todos los artículos");
        System.out.println("2. Mostrar todas las promociones");
        System.out.println("3. Mostrar promoción Happy Hour");
        System.out.println("4. Mostrar promoción Verano");
        System.out.println("5. Mostrar promoción Invierno");
        System.out.println("6. Mostrar día y horario de Promo Verano");
        System.out.println("7. Mostrar la más económica");
        System.out.println("0. Terminar programa");
        System.out.print("Elija una opción: ");
        
        int opcion = sc.nextInt();
        
        return opcion;
        
    }
    
}

