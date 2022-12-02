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
public class AdministradorTest {
    
    public AdministradorTest() {
    }

    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Administrador instance = new Administrador("1","Admi");
        String expResult = "1";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
    }

    
}
