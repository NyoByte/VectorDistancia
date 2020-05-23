package Test;

import Clases.*;
import ClasesNyo.*;

/**
 *
 * @author Nyo
 */
public class Prueba {


    public static void main(String[] args) {
        // TODO code application logic here
        int n = 4;
        Grafo grafo = new Grafo(n);
        grafo.agregarLado(0, 1, 3);
        grafo.agregarLado(0, 2, 23);
        grafo.agregarLado(1, 2, 2);
        grafo.agregarLado(2, 3, 5);
        grafo.mostrarLados();
        VectorDistancia vd = new VectorDistancia(grafo);
        vd.inicializarMatrices();
        //vd.mostrarMatrices();
        vd.ejecutarVector();

        /*
        System.out.println("======PRUEBAS NYO======");
        System.out.println("FALTA BELLMAN-FORD Y QUE SEA NO DIRIGIDO");
        GrafoLista g = new GrafoLista();
        Vertice v1 = new Vertice("0");
        Vertice v2 = new Vertice("1");
        Vertice v3 = new Vertice("2");
        Vertice v4 = new Vertice("3");
        g.AgregarVertice(v1);
        g.AgregarVertice(v2);
        g.AgregarVertice(v3);
        g.AgregarVertice(v4);
        g.AgregarArco(v1, v2, 3);
        g.AgregarArco(v1, v3, 23);
        g.AgregarArco(v2, v3, 2);
        g.AgregarArco(v3, v4, 5);
        g.MostrarGrafo();*/

    }
}
