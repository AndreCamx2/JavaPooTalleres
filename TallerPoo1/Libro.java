package TallerPoo1;

public class Libro {
String Titulo;
String Autor;
int numPaginas;


// Constructor por defecto
public Libro(){
    this.Titulo = "One Piece";
    this.Autor = "Echiro Oda";
    this.numPaginas = 1000;
    
}

// Constructor parametrizado
public Libro (String Titulo, String Autor, int NumPaginas) {
    this.Titulo = Titulo;
    this.Autor = Autor;
    this.numPaginas = NumPaginas;
}

public String goString() {
    return "Libro: " + Titulo + ", Autor: " + Autor + ", Paginas : " + numPaginas;
    }
}