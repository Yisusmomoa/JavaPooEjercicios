/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseContador;

/**
 *
 * @author bjls2
 */
public class Contador {
    private int cont;

    public Contador() {
    }

    public Contador(int cont) {
        if (cont>0)
            this.cont = cont;
        this.cont=0;
    }
    public Contador(Contador c){
        this.cont=c.cont;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public void incrementar(){
        this.cont++;
        
    }
    public void decrementar(){
        this.cont--;
        if (this.cont<0) {
            this.cont=0;
        }
    }
}
