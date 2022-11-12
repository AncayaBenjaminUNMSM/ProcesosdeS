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
public class ProductoTest {
    
    public ProductoTest() {
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Producto instance = new Producto("Arroz Chaufa");
        String expResult = "Arroz Chaufa";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
    
}
