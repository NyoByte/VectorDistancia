package ClasesNyo;

public class Cola {
    private NodoNyo first;
    private NodoNyo last;
    private int e;

    public Cola() {
        this.first = null;
        this.last = null;
    }
    
    public boolean esVacia(){
        if(first==null){
            return true;
        }
        return false;
    }
    
    public void Encolar(Object item){
        NodoNyo aux = new NodoNyo(item);
        if(esVacia()){
            first = aux;
            last = aux;
        }else{
            last.setNext(aux);
            last = aux;          
        }
        e++;
    }
    
    public Object DesEncolar(){
        Object aux = first.getItem();
        if (esVacia()){
            return null;            
        }else{
            first = first.getNext();
            e--;
            return aux;   
        }
    }
    
    public int Longitud(){
        return e;
    }
    
    public void VerCola(){
        System.out.println("====DATOS====");
        NodoNyo aux = first;
        int cont=1;
        while(aux!=null){
            System.out.println("item["+cont+"] = "+aux.getItem());
            cont++;
            aux = aux.getNext();           
        }
    }
}
