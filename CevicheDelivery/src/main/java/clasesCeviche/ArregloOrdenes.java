package clasesCeviche;
/**
 *
 * @author hp
 */
public class ArregloOrdenes {
    private Orden[] ordenes;
    private int indice;
    
    public  ArregloOrdenes(int tamanio){
        ordenes = new Orden[tamanio];
        this.indice = 0;
        
    }
    
    public boolean agregar(Orden ordn){
        boolean result;
        if(lleno())
            crecer();
        ordenes[indice] = ordn;
        indice++;
        result = true;
        return result;

    }
    
    void crecer(){
        int i;
        Orden[] nuevo = new Orden[indice*2];
        for(i = 0; i<indice; i++)
            nuevo[i] = ordenes[i];
        ordenes = nuevo;
        
    }
    
    boolean lleno(){
        boolean result = false;
        if(indice == ordenes.length)
            result = true;
        return result;

    }
    
        @Override
    public String toString() {
        String result = "";
        for(Orden obj : this.ordenes ){
            result += obj + "\n";
        }
        return result;
    }
 
}