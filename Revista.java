public class Revista extends Publicacion {
    private String fechaPublicacion;
    private String numEdicion;

    

    public Revista(){
        
    }
    public Revista(String titulo, String editor, String numEdicion, String fechaPublicacion) {
        super(titulo, editor );
        this.fechaPublicacion = fechaPublicacion;
        this.numEdicion = numEdicion;
    }


    @Override
    public void leer() {
        System.out.println("Leyendo la revista ");
        
        
    }
    public void info(){
        super.info(); 
        System.out.println("Fecha de publicación ");
        System.out.println("Número de edición ");
    }


    public String getnumEdicion() {
        return numEdicion;
    }


    public void setnumEdicion(String numEdicion) {
        this.numEdicion = numEdicion;
    }

    public String getfechaPublicacion() {
        return fechaPublicacion;
    }


    public void setfechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion= fechaPublicacion;
    }
    
}
