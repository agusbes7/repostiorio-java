package Alura.curso2.screenmatch;
import Alura.curso2.screenmatch.episodio;

public class Serie extends Multimedia {
    private int cantidadTemporadas = 0;
    private int[] episodiosPorTemporada;


    //--------------------------------------------------------------------------------

    public void setcantidadTemporadas(int cantidadTemporadas) {
        this.cantidadTemporadas = cantidadTemporadas;}

    public void setepisodiosPorTemporada(int[] episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public void setSerieCompleta(int[] episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;}

 public void  agregarTemporadaNueva(int episodios, episodio[] capitulos){
     int[] Auxiliar = new int[++cantidadTemporadas];
     Auxiliar=episodiosPorTemporada;
     Auxiliar[cantidadTemporadas-1]=episodios;

 }
}


