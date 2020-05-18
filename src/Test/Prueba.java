
package Test;
import Clases.*;

/**
 *
 * @author Nyo
 */
public class Prueba {
    public static void bellmanFord(Grafo grafo, int n, int origen){
        int[] distancia = new int[n];
        int[] predecesor = new int[n];
        for(int i=0; i<n; i++){
            //Inicializamos las distancias en infinito
            distancia[i] = 1000;
            predecesor[i] = -1;
        }
        //El nodo origen tiene distancia 0
        distancia[origen] = 0;

        //Numero de relajaciones = vertices - 1
        for(int i=0; i<n-1; i++){
            //Iteramos por cada lado del grafo
            for(int j=0; j<n; j++){
                Nodo temp = grafo.getListaAdy()[j];
                while(temp != null){
                    if(distancia[temp.getY()] > distancia[temp.getX()] + temp.getPeso()){
                        distancia[temp.getY()] = distancia[temp.getX()] + temp.getPeso();
                        predecesor[temp.getY()] = temp.getX();
                    }
                    temp = temp.getSig();
                }
            }
        }
        //Comprobamos si hay ciclos negativos
        for(int i=0; i<n; i++){
            Nodo temp = grafo.getListaAdy()[i];
            while(temp != null){
                if(distancia[temp.getY()] > distancia[temp.getX()] + temp.getPeso()){
                    System.out.println("Hay ciclo negativo");
                }
                temp = temp.getSig();
            }
        }
        //Viendo resultados
        for(int i=0; i<n; i++){
            System.out.print(distancia[i] + "\t");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int n = 4;
        Grafo grafo = new Grafo(n);
        grafo.agregarLado(0,1,3);
        grafo.agregarLado(0,2,23);
        grafo.agregarLado(1,2,2);
        grafo.agregarLado(2,3,5);
        grafo.mostrarLados();

        int origen = 0;
        for(int i=0;i<n;i++){
            System.out.println("Origen = " + i);
            bellmanFord(grafo,n,i);
            System.out.println("\n");
        }
    }
    
}
