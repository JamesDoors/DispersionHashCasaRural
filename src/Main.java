import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TablaDispersa tabla=new TablaDispersa();
        CasaRural casa = new CasaRural();

        tabla.insertar(casa);
        String codigo;

        System.out.print("Ingrese la casa que desea buscar: ");
        codigo = sc.nextLine();

        try {
            CasaRural buscado = tabla.buscar(codigo);
            buscado.muestra();
        }
        catch(Exception e) {
            System.out.println("La casa no existe.");
        }

        System.out.print("Ingrese el código de la casa que desea eliminar: ");
        codigo=sc.nextLine();
        try {
            System.out.println("La casa fue eliminada"); 
            tabla.eliminar(codigo);
        }
        catch(Exception e) {
            System.out.println("La casa no existe.");
        }
        sc.close(); 
    }
}