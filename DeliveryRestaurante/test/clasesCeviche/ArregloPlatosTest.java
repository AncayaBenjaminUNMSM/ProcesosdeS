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
public class ArregloPlatosTest {
    
    public ArregloPlatosTest() {
    }

    @Test
    public void testCrecerA() {
        System.out.println("crecer");
        ArregloPlatos instance = new ArregloPlatos(1);
        instance.crecer();
        int expResult = instance.getPlatos().length;
        int result = 2;
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCrecerB() {
        System.out.println("crecer");
        ArregloPlatos instance = new ArregloPlatos(2);
        instance.crecer();
        int expResult = instance.getTamanio();
        int result = 4;
        assertEquals(expResult, result);
    }    

}
