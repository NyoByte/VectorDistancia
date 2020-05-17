package Clases;

public class Nodo {
    private int x, y;
    private int peso;
    private Nodo sig;

    public Nodo(int x, int y, int peso){
       this.x = x;
       this.y = y;
       this.peso = peso;
       sig = null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
