package clasesCeviche;

/**
 *
 * @author hp
 */
public class ArregloPtoveedor {
    
    private Ptoveedor[] ptovedores;
    private int indice;
    
    public  ArregloPtoveedor(int tamanio){
        ptovedores = new Ptoveedor[tamanio];
        this.indice = 0;
        
    }
    
    public boolean agregar(Ptoveedor prodres){
        boolean result;
        if(lleno())
            crecer();
        ptovedores[indice] = prodres;
        indice++;
        result = true;
        return result;

    }
    
    void crecer(){
        int i;
        Ptoveedor[] nuevo = new Ptoveedor[indice*2];
        for(i = 0; i<indice; i++)
            nuevo[i] = ptovedores[i];
        ptovedores = nuevo;
        
    }
    
    boolean lleno(){
        boolean result = false;
        if(indice == ptovedores.length)
            result = true;
        return result;

    }
    public Ptoveedor buscar(String name){
        Ptoveedor buscado = null;
        for (int i = 0; i<this.indice; i++) {
            if (ptovedores[i].nombre.equals(name)) {
                buscado = ptovedores[i];
            }
        }
        return buscado;
    }    
    
        @Override
    public String toString() {
        String result = "";
        for(Ptoveedor obj : this.ptovedores ){
            result += obj + "\n";
        }
        return result;
    }
}