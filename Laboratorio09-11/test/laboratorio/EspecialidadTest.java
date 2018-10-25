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
public class EspecialidadTest {
    
    public EspecialidadTest() {
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
     * Test of toString method, of class Especialidad.
     */
    @Test
    public void testToString() {
    }

    /**
     * Test of estadoEspecialidad method, of class Especialidad.
     */
    @Test
    public void testEstadoEspecialidad() {
    }

    /**
     * Test of getNombre method, of class Especialidad.
     */
    @Test
    public void testGetNombre() {
    }

    /**
     * Test of setNombre method, of class Especialidad.
     */
    @Test
    public void testSetNombre() {
    }

    /**
     * Test of getDoctores method, of class Especialidad.
     */
    @Test
    public void testGetDoctores() {
       
        Especialidad esp = new Especialidad("Traumatologia");
        esp.setDoctor(new Doctor ("Juan","Daneri","Masculino","40749281","barrio 6 de enero",4324,esp));
        esp.setDoctor(new Doctor("Juana","Perez","ads","23423423","cfsddsd",3432,esp));
        String expectativa;
        
        expectativa ="\nJuan" +" Daneri- MPN° 4324"+"\nJuana" +" Perez- MPN° 3432";
        
        
        assertEquals(expectativa,esp.getDoctores());
        
        
        
        
    }

    /**
     * Test of setDoctor method, of class Especialidad.
     */
    @Test
    public void testSetDoctor() {
    }

    /**
     * Test of getHabitacion method, of class Especialidad.
     */
    @Test
    public void testGetHabitacion() {
    }

    /**
     * Test of setHabitacion method, of class Especialidad.
     */
    @Test
    public void testSetHabitacion() {
    }
    
}
