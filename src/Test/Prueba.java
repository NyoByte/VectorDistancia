
package Test;
import Clases.*;

/**
 *
 * @author Nyo
 */
public class Prueba {

    public static void main(String[] args) {
        // TODO code application logic here
        Grafo grafo = new Grafo(3);
        grafo.agregarLado(0,1,5);
        grafo.agregarLado(1,2,9);
        grafo.agregarLado(2,01,-7);
        grafo.mostrarLados();
    }
    
}
