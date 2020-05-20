package ClasesNyo;

public class Vertice {
    private Object item;
    private boolean visitado;

    public Vertice() {
    }

    public Vertice(Object name) {
        this.item = name;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    

    @Override
    public String toString() {
        return (String)item;
    }
    
}
