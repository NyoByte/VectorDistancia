package ClasesNyo;

public class NodoNyo {
    private Object item;
    private NodoNyo next;
    
    public NodoNyo(){
    }
    
    public NodoNyo(Object item){
        this.item = item;
    }
    
    public NodoNyo(Object item, NodoNyo next){
        this.item = item;
        this.next = next;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public NodoNyo getNext() {
        return next;
    }

    public void setNext(NodoNyo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return item.toString();
    }
    
}
