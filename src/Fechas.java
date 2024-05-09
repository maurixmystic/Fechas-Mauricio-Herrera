import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que digite la primera fecha
        System.out.println("Por favor, introduce la primera fecha (DD/MM/AAAA):");
        String fechaUno = entrada.nextLine();

        // Pedimos al usuario que digite la segunda fecha
        System.out.println("Por favor, introduce la segunda fecha (DD/MM/AAAA):");
        String fechaDos = entrada.nextLine();

        // Separamos los elementos de la primera fecha
        int diaUno = Integer.parseInt(fechaUno.substring(0, 2));
        int mesUno = Integer.parseInt(fechaUno.substring(3, 5));
        int anioUno = Integer.parseInt(fechaUno.substring(6, 10));

        // Separamos los elementos de la segunda fecha
        int diaDos = Integer.parseInt(fechaDos.substring(0, 2));
        int mesDos = Integer.parseInt(fechaDos.substring(3, 5));
        int anioDos = Integer.parseInt(fechaDos.substring(6, 10));

        // Comparamos las fechas y se determina quién es mayor
        if (anioUno < anioDos || (anioUno == anioDos && (mesUno < mesDos || (mesUno == mesDos && diaUno < diaDos)))) {
            System.out.println("La persona 1 es mayor");
        } else if (anioUno > anioDos || (anioUno == anioDos && (mesUno > mesDos || (mesUno == mesDos && diaUno > diaDos)))) {
            System.out.println("La persona 2 es mayor");
        } else {
            System.out.println("Ambas personas tienen la misma edad");
        }

        entrada.close(); // Cerrar el objeto Scanner
    }
}
