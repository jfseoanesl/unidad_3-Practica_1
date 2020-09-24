
package edu.unicesar.p2.u3.practica1.ejercicioCircunferencia;

/**
 *
 * @author jairo
 */
public class TestCircunferencia {
    
    public static void main(String[] arg){
        
        Circunferencia b = new Circunferencia(5,4,3);
        Circunferencia a = new Circunferencia(5,4,3);
        
        System.out.println("Info Circunferencia a: ");
        imprimirCircunferencia(a);
        System.out.println("Info Circunferencia b:");
        imprimirCircunferencia(b);
        
        compararCircunferencias(a,b);
        
    }
    
    public static void compararCircunferencias(Circunferencia a, Circunferencia b){
        
        // compara las areas y muetsra el resultado
        Circunferencia res = a.compArea(b);
        if(res==null){System.out.println("Las areas son iguales");}
        else if(res==a){
            System.out.println("La mayor es de A");
        }
        else{
            System.out.println("La mayor es de B");
        }
        
        // Compara las longitudes y muestra el resultado
        res = a.compLongitud(b);
        if(res==null){System.out.println("Las longitudes son iguales");}
        else if(res==a){
            System.out.println("La mayor es de A");
        }
        else{
            System.out.println("La mayor es de B");
        }
        
        /* implementar las instrucciones para imprimir si 
         * se sobreponen o no las dos circunferencia   */
    }
    
    
    public static void imprimirCircunferencia(Circunferencia c){
        System.out.println("Coord X: " + c.getX());
        System.out.println("Coord Y: " + c.getY());
        System.out.println("Radio:   " + c.getR());
        System.out.println("Area:    " + c.calcularArea());
        System.out.println("Longitud:" + c.calcularLongitud());
    }
}
