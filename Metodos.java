import java.util.Scanner;
import java.util.ArrayList;
public class Metodos {
    Scanner sc = new Scanner(System.in);
    

    public ObjProducto[][] LlenarMatriz(ObjProducto[][] m){
        int s=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjProducto o = new ObjProducto();
                System.out.println("Ingrese el codigo del articulo");
                o.setCodigo(sc.nextInt());

                System.out.println("Ingrese el nombre del producto");
                o.setNombre(sc.next());

                System.out.println("Ingresa la cantidad disponibleen stock");
                o.setCantidad(sc.nextInt());
                
                System.out.println("Ingrese el stock minimo requerido");
                o.setStockmin(sc.nextInt());
                
                
                
                if (o.getNombre()==o.getNombre()) {
                     s= o.getCantidad() + o.getCantidad();
                } else if( o.getCantidad()==0 ){
                    System.out.println("como la cantidad de su producto es iguala 0, entonces es invalido");
                }else if(o.getCantidad()<o.getStockmin()){
                    System.out.println("la cantidad del producto excede la cantidad maxima disponible");
                }else{ System.out.println("bien");}

                
            }
            
        }
        
        return m;
    }
    public void MostrarMatriz(ObjProducto[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Este es el codigo: "+m[i][j].getCodigo());
                System.out.println("Este es el nombre: "+m[i][j].getNombre());
                System.out.println("Este es la cantidadde stock: "+m[i][j].getCantidad());
                System.out.println("este es el stock minimo: "+m[i][j].getStockmin());
                System.out.println("--------------------------------------------------------------");
                
            }
        }
    }
    public ObjProducto[][] OrdenarMatriz(ObjProducto[][] m){
        
        
            
        

        return m;
    }
}
