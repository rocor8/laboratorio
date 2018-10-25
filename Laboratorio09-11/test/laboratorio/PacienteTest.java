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
 * @author Ruth
 */
public class PacienteTest {
    private Paciente p;
    
    public PacienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p = new Paciente("Tamara","Senatore","femenino","21342424","Centro",28,10,1996);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of pacienteAtendido method, of class Paciente.
     */
    @Test
    public void testPacienteAtendido() {
    }

    /**
     * Test of calcularEdad method, of class Paciente.
     */
    @Test
    public void testCalcularEdad() {
        
        assertEquals(20,p.calcularEdad(),0.001);
        //espectaiva - obtenido - margen de error
    }

    @Test
    public void testGetFechaDeNaciemiento(){
        
        assertEquals("28/10/1996",p.getFechaDeNaciemiento());
        
    }
    
}
