package multimedia;

import multimedia.Formato;

public class Multimedia {

    Formato formato;
    private String titulo;
    private String autor;
    private int duracion;

    public Multimedia(String titulo, String autor, int duracion, Formato formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.formato = formato;
    }

    public String getAutor() {
        return autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public Formato getFormato() {
        return formato;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Title ;" + titulo + "Auther :" + autor + "Formet ; " + getFormato() + "Duracion ;" + duracion;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Multimedia))
            return false;

        Multimedia multimedia = (Multimedia) obj;
        return (multimedia.titulo.equals(this.titulo) && multimedia.autor.equals(this.autor));

    }
}
