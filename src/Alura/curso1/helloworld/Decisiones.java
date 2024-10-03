package Alura.curso1.helloworld;

public class Decisiones {
    public  static void main(String[] args){
        int fecha = 1999;
        boolean incluidoEnPlan= false;
        double notaPelicula = 8.2;
        String plan= "plus";
        if(fecha > 2022){
        System.out.println("Peliculas mas pedorras");}
    else {
        System.out.println("Pelicula piola");}

    if(incluidoEnPlan && plan.equals("plus")){
        System.out.println("Se encuentra disponible en el catalogo");}
else{
        System.out.println("pelicula no pertenece al catalogo ");}
    }

    }

