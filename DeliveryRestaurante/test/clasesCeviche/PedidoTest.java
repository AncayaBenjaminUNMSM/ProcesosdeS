/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package clasesCeviche;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class PedidoTest {
    
    public PedidoTest() {
    }

    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Pedido instance = new Pedido(1,"cocina");
        String expResult = "cocina";
        String result = instance.getEstado();
        assertEquals(expResult, result);
    }
    
}
