package clasesCeviche;

/**
 *
 * @author hp
 */
public class ArregloProducto{
    public Producto[] productosry;
    public  int indice;
    
    public  ArregloProducto(int tamanio){
        productosry = new Producto[tamanio];
        this.indice = 0;
        
    }
    
    public boolean agregar(Producto prdto){
        boolean result = false;
        if(lleno())
            crecer();
        if(prdto != null){
            this.productosry[this.indice] = prdto;
            this.indice++;
            result = true;
        }
        
        return result;

    }
    
    void crecer(){
        int i;
        Producto[] nuevo = new Producto[productosry.length*2];
        for(i = 0; i<indice; i++)
            nuevo[i] = productosry[i];
        productosry = nuevo;
        
    }
    
    boolean lleno(){
        boolean result = false;
        if(indice == productosry.length)
            result = true;
        return result;
    }
    
    public Producto buscar(String name){
        Producto buscado = null;
        for (int i = 0; i<this.indice; i++) {
            if (productosry[i].getNombre().equals(name)) {
                buscado = productosry[i];
            }
        }
        return buscado;
    } 
    
        @Override
    public String toString() {
        String result = "";
        for(Producto obj : this.productosry ){
            result += obj + "\n";
        }
        return result;
    }

}