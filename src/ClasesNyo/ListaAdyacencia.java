package ClasesNyo;

public class ListaAdyacencia {

    private Object item;
    private ListaAdyacencia sublista;
    private int peso;

    public ListaAdyacencia() {
        this.peso = 0;
    }

    public ListaAdyacencia(Object item, ListaAdyacencia sublista, int peso) {
        this.item = item;
        this.sublista = sublista;
        this.peso = peso;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public ListaAdyacencia getSublista() {
        return sublista;
    }

    public void setSublista(ListaAdyacencia sublista) {
        this.sublista = sublista;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean esVacia() {
        if (item == null && sublista == null) {
            return true;
        }
        return false;
    }

    public int Longitud() {
        if (esVacia()) {
            return 0;
        } else {
            return 1 + sublista.Longitud();
        }
    }

    public Object Iesimo(int pos) {
        if (pos == 1) {
            return item;
        } else {
            return sublista.Iesimo(pos - 1);
        }
    }
    
    public int iesimoPeso(int posicion) {
        if (posicion == 1) {
            return this.peso;
        } else {
            return this.sublista.iesimoPeso(posicion - 1);
        }
    }

    public void Insertar(Object item, int pos, int peso) {
        if (pos == 1) {
            sublista = new ListaAdyacencia(this.item, sublista, this.peso);
            this.item = item;
            this.peso = peso;
        } else {
            sublista.Insertar(item, pos - 1, peso);
        }
    }

    public int Posicion(Object item) { //Se podría mejorar
        if (esVacia()) {
            return 0;
        } else {
            if (this.item.equals(item)) {
                return 1;
            } else {
                if (sublista.Posicion(item) == 0) {
                    return 0;
                } else {
                    return 1 + sublista.Posicion(item);
                }
            }
        }
    }
    
    public int Prefe(Object item){
        if(esVacia()){
            return 0;
        }else{
            if(item.toString().compareTo(this.item.toString())<0){
                return 0;
            }else{
                return 1+sublista.Prefe(item);
            }
        }
    }

    public void Eliminar(int pos) {
        if (pos == 1) {
            item = sublista.getItem();
            sublista = sublista.getSublista();
        } else {
            sublista.Eliminar(pos - 1);
        }
    }

    public boolean ExisteItem(Object item){
        for(int i=1;i<=Longitud();i++){
            if(Iesimo(i).toString().equals(item.toString())){    
                return true;
            }
        }
        return false;
    }
    //Agregar al final
    //Limpiar
    public void Ver(String name) {
        System.out.println("====Lista " + name + "====");
        for (int i = 1; i <= Longitud(); i++) {
            System.out.println("Item[" + i + "]: " + Iesimo(i));
        }
        System.out.println();
    }
}
