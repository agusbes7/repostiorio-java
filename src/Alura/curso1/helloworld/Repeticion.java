package Alura.curso1.helloworld;

import java.util.Scanner;

public class Repeticion {
    public static void main(String[] args) {
        Scanner aux= new Scanner(System.in) ;
        System.out.print("cuantas personas rindieron el examen");
   int x= aux.nextInt();
double prom=0;
   /*     for (int i = 0; i < x; i++) {
            System.out.print("Ingrese la nota: ");
            double ax= aux.nextDouble();
            prom+=ax;}*/
        prom/=x;
        System.out.println("El promedio de notas ronda: " + prom);
    }
}
