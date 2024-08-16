public class Libro extends Publicacion {
    private String isbn;
    private String numPaginas;

    

    public Libro(){
        
    }
    public Libro(String titulo, String autor, String isbn, String numPaginas) {
        super(titulo, autor );
        this.isbn = isbn;
        this.numPaginas = numPaginas;
    }


    @Override
    public void leer() {
        System.out.println("Leyendo el libro ");
        
        
    }
    public void info(){
        super.info(); 
        System.out.println("ISBN ");
        System.out.println("Número de páginas ");
    }


    public String getnumPaginas() {
        return numPaginas;
    }


    public void setnumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getisbn() {
        return isbn;
    }


    public void setisbn(String isbn) {
        this.isbn = isbn;
    }
    
}
