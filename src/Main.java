import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String opc;
        
        TablaDispersa tabla = new TablaDispersa();
        CasaRural casa;

        do {
            System.out.println("      MENÚ");
            System.out.println("-----------------");
            System.out.println("1 - INSERTAR CASA");
            System.out.println("2 - BUSCAR CASA");
            System.out.println("3 - ELIMINAR CASA");
            System.out.println("-----------------");
            System.out.println("0 - SALIR");
            System.out.println("");
            System.out.print("Opción: ");
            opc = entrada.readLine();
            switch (opc) {
                case "0":
                    //Sale del ciclo y finaliza
                break;
                case "1":
                    //Crea una casa en la tabla
                    casa = new CasaRural();
                    tabla.insertar(casa);    
                break;
                case "2":
                    //Busca una casa por el código y la muestra
                    System.out.print("Ingrese la casa que desea buscar: ");
                    try {
                        CasaRural buscado = tabla.buscar(entrada.readLine());
                        buscado.muestra();
                    }
                    catch(Exception e) {
                        System.out.println("La casa no existe.");
                    }
                break;
                case "3":
                    //Busca una casa por el código y la elimina
                    System.out.print("Ingrese el código de la casa que desea eliminar: ");
                    tabla.eliminar(entrada.readLine());
                break;
                default:
                    System.out.println("OPCIÓN INCORRECTA");
                break;
            }
        } while (!opc.equals("0"));  
    }
}