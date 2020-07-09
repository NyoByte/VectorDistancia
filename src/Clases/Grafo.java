package Clases;

public class Grafo {
    private int n; //numero de vertices
    private Nodo[] listaAdy;
    //El grafo siempre es no dirigido

    public Grafo(int size){
        n = size;
        listaAdy = new Nodo[n];
    }

    public void agregarLado(int x, int y, int peso){
        Nodo temp = new Nodo(x, y, peso);
        temp.setSig(listaAdy[x]);
        listaAdy[x] = temp;
        
        
        Nodo temp2 = new Nodo(y, x, peso);
        temp2.setSig(listaAdy[y]);
        listaAdy[y] = temp2;
    }
    
    public Nodo obtenerLado(int x, int y){
        Nodo temp = listaAdy[x];
        while(temp != null){
            if(temp.getDestino() == y){
                break;
            }
            temp = temp.getSig();
        }
        return temp;
    }
  
    public boolean existeLado(int x, int y, int peso){
        Nodo aux = listaAdy[x];
        while(aux!=null){
            if(aux.getOrigen()==x){
                return true;
            }
            aux = aux.getSig();
        }
        return false;
    }

    public void mostrarLados(){
        //ScreenMain menu = new ScreenMain();
        
        for(int i=0; i<listaAdy.length; i++){
            Nodo temp = listaAdy[i];
            while(temp != null){
                //JOptionPane.showMessageDialog(null, "(" + temp.getOrigen() + "," +temp.getDestino()+"): " + temp.getPeso());
                
                System.out.println("(" + temp.getOrigen() + "," +temp.getDestino()+"): " + temp.getPeso());
                temp = temp.getSig();
            }
        }
    }

    public Nodo[] getListaAdy() {
        return listaAdy;
    }

    public void setListaAdy(Nodo[] listaAdy) {
        this.listaAdy = listaAdy;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
