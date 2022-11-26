package clasesCeviche;

import java.util.Arrays;

/**
 *
 * @author bnjmn
 */
public class ArregloPlatos {

    private Plato[] platos;
    private int indice;
    private int tamanio;

    public ArregloPlatos(int tam) {
        this.platos = new Plato[tam];
        this.indice = 0;
        this.tamanio = tam;
    }
    
    public void crecer(){
        Plato[] platos= this.platos;
        int tamanio = this.tamanio;
        Plato[] newArr = Arrays.copyOf(platos, platos.length*2);
        platos = newArr;
        tamanio=platos.length;
        this.tamanio = tamanio;
        this.platos = newArr;
    }
    
    public boolean agregar(Plato plato){
        boolean resultado = false;
        if(lleno()){
            crecer();
        }
        
        if(plato != null){
           resultado = true;
           this.platos[this.indice] = plato;
           this.indice++;
        }
        
        return resultado;
    }
    
    public void crecerB(){
        Plato[] nuevo = new Plato[this.platos.length*2];
        int i=0;
        for(Plato obj: this.platos ){
            nuevo[i]= obj;
            i++;
        }
        this.platos = nuevo;
    }
    
    
    
    private  boolean lleno(){
        boolean result = false;
        if(this.indice == this.platos.length){
            result = true;
        }
        return result;
    }

    public Plato[] getPlatos() {
        return platos;
    }

    public int getIndice() {
        return indice;
    }

    public int getTamanio() {
        return tamanio;
    }

    @Override
    public String toString() {
        
        String resultado = "";
        for(Plato objeto: this.platos){
            resultado += objeto;
        }
        return resultado;
    }
    
    
    
}
