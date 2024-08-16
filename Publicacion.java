public abstract class Publicacion {
    protected String autorEditor;
    protected String titulo;
    

    
    public Publicacion() {
    }
    public Publicacion(String autorEditor, String titulo) {
        this.autorEditor = autorEditor;
        this.titulo = titulo;
      
    }
    public void info(){
        System.out.println("titulo: ");
        System.out.println("Autor/Editor: ");
    
    }
    public abstract void leer();

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutorEditor() {
        return autorEditor;
    }
    public void setAutorEditor(String autorEditor) {
        this.autorEditor = autorEditor;
    }
 
}
