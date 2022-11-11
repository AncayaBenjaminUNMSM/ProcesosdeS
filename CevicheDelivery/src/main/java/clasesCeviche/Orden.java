package clasesCeviche;
/**
 *
 * @author hp
 */
public class Orden {
    public String estado;
    public String cdg;
    Ptoveedor provedor;

    public Orden(String estado, String cdg, Ptoveedor provedor) {
        this.estado = estado;
        this.cdg = cdg;
        this.provedor = provedor;
    }
                @Override
    public String toString() {
        String result;
        result = "(Estado " + estado + ", codigo " + cdg + " )\n";
        result += provedor;
        return result;
    }
    
}