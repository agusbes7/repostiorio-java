package Alura.curso2.screenmatch;

public class episodio {
private     int duracion,temporada;
    private String titulo;
private  boolean visible=false;
private  Serie x;
    public int getDuracion() {
        return duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

