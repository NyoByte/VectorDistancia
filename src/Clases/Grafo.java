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
    
      /*
        public boolean hayVertice(Vertice x) {
        if (esVacio() || x == null) {
            return false;
        } else {
            if (vertice.getItem().equals(x.getItem())) {
                return true;
            } else {
                return subGrafo.hayVertice(x);
            }
        }
    }

    public boolean hayArco(Vertice origen, Vertice destino) {
        if(hayVertice(origen) && hayVertice(destino)){
            if (vertice.getItem().equals(origen.getItem())) {
                return lista.ExisteItem(destino);
            } else {
                if (subGrafo != null) {
                    subGrafo.hayArco(origen, destino);
                }
            }
        }
        return false;
    }
    
    public boolean existeItem(int item){
        for(int i=1;i<=Longitud();i++){
            if(Iesimo(i).toString().equals(item.toString())){    
                return true;
            }
        }
        return false;
    }*/
    
    public boolean existeLado(int x, int y){
        Nodo aux = listaAdy[x];
        while(aux!=null){
            if(aux.getDestino()==y){
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
