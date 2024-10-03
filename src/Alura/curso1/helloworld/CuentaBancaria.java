package Alura.curso1.helloworld;

import java.util.Scanner;


public class CuentaBancaria {
    public static void main(String[] args) {
        double saldo=2500;
        String cliente= "Tony Stark";
        Boolean corriente= true;
        Scanner aux= new Scanner(System.in);
int opcion=0;
String menu= """
       1- saldo actual
       2- Ingresar efectivo
       3- Retirar efectivo
       4- salir
       5- cuenta corriente?
    Ingrese la operacion a realizar
        """;
        do {
    /*        System.out.println("1- saldo actual");
            System.out.println("2- Ingresar efectivo");
            System.out.println("3- Retirar efectivo");
            System.out.println("4- salir");
            System.out.println("5- cuenta corriente?");
            System.out.print("Ingrese la operacion a realizar");*/
            System.out.print(menu);
            opcion= aux.nextInt();
switch (opcion) {
    case 1:
        System.out.println("tu saldo actualizado es de; " + saldo);
        break;
    case 2: {
        System.out.print("Cuanto saldo desea ingresar: ");
        double efectivo = aux.nextDouble();
        saldo += efectivo;
        System.out.println("tu saldo actualizado es de; " + saldo);
        break; }
    case 3: {
        System.out.print("Cuanto saldo desea retirar: ");
        double efectivo = aux.nextDouble();
        if (efectivo > 500 && efectivo <= saldo) {
            saldo -= efectivo;
            System.out.println("tu saldo actualizado es de; " + saldo);}
        else {
            System.out.println(efectivo<500? "el monto minimo de retiro es de 500":"Saldo insuficiente");}
        break;}
    case 5: {
        System.out.println(corriente ? "Cuenta corriente" : "No es cuenta corriente");
        break;}
    default:{
        System.out.println("No es una opcio correcta");}}

        }while (opcion!=4);

System.out.println("fue un placer atenderlo vuelta pronto");}
}
/*las operaciones realizadas deberian pertenecer a diferentes metodos,
/no conciernen a main, debo ver como puedo acceder a una instancia de clase para modificar sus atributos sin pasar el atributo al metodo
Deberia pasar el objeto o la instancia para tener acceso a sus atributos
por logica del paradigma de objetos y sus caracteristicas el encapsulamientos etc
*/