package Clases;

public class VectorDistancia {
    private int matrizDistancia[][];
    private int matrizSgteSalto[][];
    private int n;
    private Grafo grafo;
    private Nodo[] listaAdy;

    public VectorDistancia(Grafo grafo){
        this.n = grafo.getN();
        this.grafo = grafo;
        matrizDistancia = new int[n][n];
        matrizSgteSalto = new int[n][n];
        listaAdy = grafo.getListaAdy();
    }
    public void inicializarMatrices(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrizDistancia[i][j] = 1000;
                matrizSgteSalto[i][j] = -1;
            }
            matrizDistancia[i][i] = 0;
        }
    }
    public void mostrarMatrices(){
        for(int i=0; i<n; i++) {
            System.out.println("Router " + i + ":");
            System.out.println("Nodos   Dist.   Sgte.");
            for (int j = 0; j < n; j++) {
                System.out.println(j + "       " + matrizDistancia[i][j] + "       "
                        + matrizSgteSalto[i][j]);
            }
        }
    }

    public void ejecutarVector(){
        for(int i=0; i<n-1; i++){
            //Calculamos en cada paso i el vector distancia de cada router
            System.out.println("T = " + i);
            for(int j=0; j<matrizDistancia.length; j++){
                for(int u=0; u<listaAdy.length; u++){
                    Nodo temp = listaAdy[u];
                    while(temp != null){
                        if(matrizDistancia[j][temp.getX()] + temp.getPeso() < matrizDistancia[j][temp.getY()]){
                            matrizDistancia[j][temp.getY()] = matrizDistancia[j][temp.getX()] + temp.getPeso();
                            matrizSgteSalto[j][temp.getY()] = temp.getX();
                        }
                        temp = temp.getSig();
                    }
                }
            }
            //Opcional: mostrar vectores en el tiempo i
            mostrarMatrices();
        }
    }
}
