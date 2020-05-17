package Clases;

public class Grafo {
    private int n; //numero de vertices
    private Nodo[] listaAdy;
    //El grafo siempre es dirigido

    public Grafo(int size){
        n = size;
        listaAdy = new Nodo[n];
    }

    public void agregarLado(int x, int y, int peso){
        Nodo temp = new Nodo(x, y, peso);
        temp.setSig(listaAdy[x]);
        listaAdy[x] = temp;
    }

    public Nodo obtenerLado(int x, int y){
        Nodo temp = listaAdy[x];
        while(temp != null){
            if(temp.getY() == y){
                break;
            }
            temp = temp.getSig();
        }
        return temp;
    }

    public void mostrarLados(){
        for(int i=0; i<listaAdy.length; i++){
            Nodo temp = listaAdy[i];
            while(temp != null){
                System.out.println("(" + temp.getX() + "," +temp.getY()+"): " + temp.getPeso());
                temp = temp.getSig();
            }
        }
    }
}
