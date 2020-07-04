package ClasesNyo;

public class GrafoLista {

    private Vertice vertice;
    private ListaAdyacencia lista;
    private GrafoLista subGrafo;

    public GrafoLista() {
    }

    public GrafoLista(Vertice vertice, ListaAdyacencia listaAdya, GrafoLista subGrafo) {
        this.vertice = vertice;
        this.lista = listaAdya;
        this.subGrafo = subGrafo;
    }

    public Vertice getVertice() {
        return vertice;
    }

    public void setVertice(Vertice vertice) {
        this.vertice = vertice;
    }

    public ListaAdyacencia getLista() {
        return lista;
    }

    public void setLista(ListaAdyacencia lista) {
        this.lista = lista;
    }

    public GrafoLista getSubGrafo() {
        return subGrafo;
    }

    public void setSubGrafo(GrafoLista subGrafo) {
        this.subGrafo = subGrafo;
    }

    public boolean esVacio() {
        if (vertice == null) {
            return true;
        }
        return false;
    }

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
    
    public void AgregarVertice(Vertice x) {
        if (hayVertice(x) == true) {
            System.out.println("Ya existe el vértice: " + x);
        } else {
            if (esVacio()) {
                vertice = new Vertice(x.getItem());
                lista = new ListaAdyacencia();
                subGrafo = new GrafoLista();
            } else {
                if ((x.toString().compareTo(vertice.toString())) < 0) {//Si el nuevo vértice es menor al actual
                    GrafoLista aux = new GrafoLista(vertice, lista, subGrafo);
                    vertice = new Vertice(x.getItem());
                    lista = new ListaAdyacencia();
                    subGrafo = aux;
                } else {
                    subGrafo.AgregarVertice(x);
                }
            }
        }
    }
    // Falta que sea NO DIRIGIDO
    public void AgregarArco(Vertice origen, Vertice destino, int peso) {
        if (hayVertice(origen) && hayVertice(destino)) {
            if (hayArco(origen, destino)) {
                System.out.println("Ya está el arco de: " + origen.toString() + "->" + destino.toString());
            } else {
                AgregandoArco(origen, destino, peso);
            }
        } else {
            System.out.println("No es posible agregar el arco de: " + origen.toString() + "->" + destino.toString());
        }
    }

    public void AgregandoArco(Vertice origen, Vertice destino, int peso) {
        if (vertice.getItem().equals(origen.getItem())) {
            lista.Insertar(destino, lista.Prefe(destino) +1, peso);
            //lista.Insertar(origen, lista.Prefe(origen) +1, peso);
        } else {
            if (subGrafo != null) {
                subGrafo.AgregandoArco(origen, destino, peso);
            }
        }
    }

    public void EliminarArco(Vertice origen, Vertice destino) {
        if (hayVertice(origen) && hayVertice(destino)) {
            EliminandoArco(origen, destino);
        } else {
            System.out.println("No es posible eliminar el arco");
        }
    }

    public void EliminandoArco(Vertice origen, Vertice destino) {
        if (!hayArco(origen, destino)) {
            System.out.println("No hay arco de: " + origen.toString() + "->" + destino.toString());
        } else {
            if (vertice.getItem().equals(origen.getItem())) {
                int pos = lista.Prefe(destino) + 1;
                if (pos > 0) {
                    this.lista.Eliminar(pos);
                }
            } else {
                if (subGrafo != null) {
                    subGrafo.EliminandoArco(origen, destino);
                }
            }
        }
    }

    public void EliminarVertice(Vertice x) {
        if (hayVertice(x)) {
            GrafoLista gAux = subGrafo;
            Vertice vAux = vertice;
            while (gAux != null) {
                EliminarArco(vAux, x);
                vAux = gAux.vertice;
                gAux = gAux.subGrafo;
            }
            if (vertice.getItem().equals(x.getItem())) {
                vertice = subGrafo.vertice;
                lista = subGrafo.lista;
                subGrafo = subGrafo.getSubGrafo();
            } else {
                this.subGrafo.EliminarVertice(x);
            }
        }
    }

    //Recorrido
    public Vertice SiguienteNoVisitado() {
        if (!vertice.isVisitado()) {
            return vertice;
        } else {
            if (subGrafo != null) {
                return subGrafo.SiguienteNoVisitado();
            }
            return null;
        }
    }

    public void DFS(Vertice v) {
        MarcarDFS(v);
        Vertice w = SiguienteNoVisitado();
        if (w != null && !w.isVisitado()) {
            MarcarDFS(w);
        }
    }

    public void MarcarDFS(Vertice v) {
        if (v != null && !esVacio()) {
            System.out.print(v.getItem() + "\t");
            v.setVisitado(true);
            ListaAdyacencia listaAdyacentes = this.adyacentes(v);
            if (listaAdyacentes != null) {
                for (int i = 1; i <= listaAdyacentes.Longitud(); i++) {
                    Vertice w = (Vertice) listaAdyacentes.Iesimo(i);
                    if (!w.isVisitado()) {
                        MarcarDFS(w);
                    }
                }
            }
        }
    }

    public ListaAdyacencia adyacentes(Vertice v) {
        if (hayVertice(v)) {
            if (v.getItem().equals(vertice.getItem())) {
                return lista;
            } else {
                return subGrafo.adyacentes(v);
            }
        } else {
            return null;
        }
    }

    public int CantidadVertices() {
        if (esVacio()) {
            return 0;
        } else {
            return 1 + this.subGrafo.CantidadVertices();
        }
    }

    public void marcarNoVisitados() {
        if (!esVacio()) {
            vertice.setVisitado(false);
            if (subGrafo != null) {
                subGrafo.marcarNoVisitados();
            }
        }
    }

    public void BFS(Vertice v) {
        Cola Q = new Cola();
        Q.Encolar(v);
        System.out.print(v.getItem() + "\t");
        v.setVisitado(true);
        while (!Q.esVacia()) {
            v = (Vertice) Q.DesEncolar();
            ListaAdyacencia listaAdyacentes = adyacentes(v);
            for (int i = 1; i <= listaAdyacentes.Longitud(); i++) {
                Vertice w = (Vertice) listaAdyacentes.Iesimo(i);
                if (!w.isVisitado()) {
                    System.out.print(w.getItem() + "\t");
                    w.setVisitado(true);
                    Q.Encolar(w);
                }
            }
        }
    }

    public void MostrarGrafo() {
        if (!esVacio()) {
            System.out.print("Vertice " + vertice + ": ");
            for (int i = 1; i <= lista.Longitud(); i++) {
                System.out.print(" -P("+lista.iesimoPeso(i)+")->"+lista.Iesimo(i));
            }
            System.out.print(" --> null");
            System.out.println();
            subGrafo.MostrarGrafo();
        }
    }
}
