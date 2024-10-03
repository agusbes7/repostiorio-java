package Alura.curso1.helloworld;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//comentarios de linea
/* comentarios de bloque*/
        System.out.println("Hi, Bienvenidos!");
        System.out.println("Pelicula: Rocky 4");
        int fechaDeLanzamiento = 1994;
/*camel case primera letra de cada palabra con Mayuscula excepto la 1ra palabra
boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        double media = (notaDeLaPelicula + 6.0 + 9.0) / 3;
        System.out.println(media + " promedio de la pelicula");
String sinopsis= """
         la perdida de un amigo cercano, lleva a rocky(stallone)
         a su desafio mas dificil
        de todos en nada menos que la URSS estrenada en:""" + fechaDeLanzamiento;
        System.out.println((sinopsis));
int clasificacion = (int)(media/2);
        System.out.println("media de la pelicula " + clasificacion);*/
   conversor(3); }
//Desafio de clase
    public static void conversor(int a){
        double x=  (a*1.8)+32;
        System.out.println("La temperatura en grados Fahrenheit es: " + x);
    int b= (int) (x);
        System.out.println("Si la consideramos entera: " + b );
    }


}


