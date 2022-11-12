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
public class ProcesoTest {
    
    public ProcesoTest() {
    }

    @Test
    public void testGetpedido() {
        System.out.println("getpedido");
        Proceso instance = new Proceso(1,1,"Caldoe Gaina","cocina");
        String expResult = "Caldoe Gaina";
        String result = instance.getpedido();
        assertEquals(expResult, result);
    }
    
}
