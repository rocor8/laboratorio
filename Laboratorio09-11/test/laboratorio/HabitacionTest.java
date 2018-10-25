/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class HabitacionTest {
    
    public HabitacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    /**
     * Test of setCamasLibre method, of class Habitacion.
     */
    @Test
    public void testSetCamasLibre() {
        Habitacion hab =  new Habitacion(1, new Especialidad("Oftalmologia"),2,3);
        String[] libre = {"0","1","2"};
        assertEquals(libre,hab.setCamasLibre());
        
        
    }

   
   
    @Test
    public void testGetCamas() {
        Habitacion hab1 =  new Habitacion(1, new Especialidad("Oftalmologia"),2,2);
        String libre = "Cama "+0+":   Libre\n"+"Cama "+1+":   Libre\n";
        assertEquals(libre,hab1.getCamas());
        
    }

    /**
     * Test of setNumeroCamas method, of class Habitacion.
     */
    @Test
    public void testSetNumeroCamas() {
    }

    /**
     * Test of getCama method, of class Habitacion.
     */
    @Test
    public void testGetCama() {
    }
    
}
