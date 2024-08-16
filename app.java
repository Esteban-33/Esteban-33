import java.util.Scanner;

public class App {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        String opcion = "";
        while (!opcion.equals("0")) {
            System.out.println("################  MENÚ ################");
            System.out.println("####  1. Crear Libro               ####");
            System.out.println("####  2. Crear Revista             ####");
            System.out.println("####  0. Salir                     ####");
            System.out.println("#######################################");
            opcion = teclado.nextLine();

            switch(opcion) {
                case "1":
                    System.out.println("Digite el titulo del libro:");
                    String tituloLibro = teclado.nextLine();
                    System.out.println("Digite el autor del libro: ");
                    String autorLibro = teclado.nextLine();
                    System.out.println("Digite el ISBN del libro: ");
                    String isbnLibro = teclado.nextLine();
                    System.out.println("Digite el número de páginas del libro: ");
                    String numPaginas = teclado.nextLine();
                    Libro miLibro = new Libro(tituloLibro, autorLibro, isbnLibro, numPaginas);
                    miLibro.leer();
                    miLibro.info();
                    System.out.println(miLibro);
                    break;
                case "2":
                    System.out.println("Digite el titulo de la Revista:");
                    String tituloRevista = teclado.nextLine();
                    System.out.println("Digite el editor de la Revista: ");
                    String editorRevista = teclado.nextLine();
                    System.out.println("Digite el número de edición de la Revista: ");
                    String numEdicion = teclado.nextLine();
                    System.out.println("Digite la fecha de publicación de la Revista: ");
                    String fechaPublicacion = teclado.nextLine();
                    Revista miRevista = new Revista(tituloRevista, editorRevista, numEdicion, fechaPublicacion);
                    miRevista.leer();
                    miRevista.info();
                    System.out.println(miRevista);
                    break;

                default:
                    break;
            }
        }
    }
}


