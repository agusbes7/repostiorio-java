package Alura.curso1.helloworld;

import java.util.Scanner;

public class LecturaUsuario {
    public static void  main(String[] args){

        Scanner teclado= new Scanner(System.in);
        System.out.println("Escribe el nombre de tu actor favorito");
    String actor= teclado.nextLine();

        System.out.println("escribe en que papeles te gusto más");
        String papeles= teclado.nextLine();
        System.out.println("cuantos años tiene?");
        int edad = teclado.nextInt();
for (int i=0;i<3;i++){
    System.out.println("Ingresa la serie del top "+ (3-i));
    pelicula();}

    }
public  static  void pelicula(){
        Scanner aux=new Scanner(System.in);
    System.out.print("Escribe la serie: ");
    String serie=aux.nextLine();
    System.out.print("Escribe al protagonista: ");
    String actor=aux.nextLine();
    System.out.print("Escribe fecha de estreno: ");
    int fecha=aux.nextInt();}
}
