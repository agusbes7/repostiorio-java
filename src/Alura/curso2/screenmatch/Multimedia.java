package Alura.curso2.screenmatch;

public class Multimedia {
    private String nombre, idioma,reparto;
    private int fechaDeLanzamiento=0,   numeroDeEvaluaciones=0;
    private boolean IncluyePlan;
    private double sumaDeEvaluacion;

    void mostrarMultimedia() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("Su fecha de lanzamiento fue en: " + fechaDeLanzamiento + "|| Idiomas disponibles:" + idioma);
        if(sumaDeEvaluacion==0){ System.out.println("Aun no hay reseñas del producto");}
        else{System.out.println("La valoracion  del producto es " + calculamedia());}
        System.out.println("Incluye plan: "+ IncluyePlan);
         System.out.println(reparto);
                for (int i = 0; i < 50; i++) {     System.out.print("#");}
        System.out.println();}

    void mostrarNombre(){   System.out.println("El nombre del medio es: "+ nombre);}
    void mostrarFecha(){    System.out.println("El anio de publicacion es: "+ fechaDeLanzamiento);}
    void mostraReparto(){   System.out.println("El reparto es: "+ reparto);}
    void Idiomas(){       System.out.println("El medio se encuentra disponible en los siguientes idiomas: "+ idioma);}
    void inicializa(String Name, int Fecha, String lenguajes, String artistas, boolean plan){
        nombre=Name;                fechaDeLanzamiento=Fecha;
        reparto=artistas;                   idioma=lenguajes;
    IncluyePlan=plan;}


    void calificacion(double nota){
        sumaDeEvaluacion+=nota;
    numeroDeEvaluaciones++;}
double calculamedia(){ return   sumaDeEvaluacion/numeroDeEvaluaciones;}
}