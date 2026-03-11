import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos M= new Metodos();
        int n =0;
        System.out.println("Ingrese la dimension dela cantidadde productos");
        n= sc.nextInt();
        ObjProducto[][] m= new ObjProducto[n][n];
        System.out.println("ingrese los productos");
        m=M.LlenarMatriz(m);
        System.out.println("ahora vamos a organizarla");
        m=M.OrdenarMatriz(m);
        System.out.println("esta es la matriz");
        M.MostrarMatriz(m);
    }
}
