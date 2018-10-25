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
public class DoctorTest {
    private Doctor doc;
    private Paciente pac;
    private Especialidad esp;
    
    public DoctorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        esp = new Especialidad("Pediatria");
        doc = new Doctor("Tamara","Senatore","femenino","21342424","Centro",2313,esp);
        pac = new Paciente("Tamara","Senatore","femenino","21342424","Centro",28,10,1996);
        doc.setPaciente(pac);
    }
    
    @After
    public void tearDown() {
    }

    

    /**
     * Test of getEspecialidad method, of class Doctor.
     */
    @Test
    public void testGetEspecialidad() {
        
    }

    /**
     * Test of setEspecialidad method, of class Doctor.
     */
    @Test
    public void testSetEspecialidad() {
    }

    /**
     * Test of getPaciente method, of class Doctor.
     */
    @Test
    public void testGetPaciente() {
            
        assertEquals(pac,doc.getPaciente("21342424"));
        
        
    }

    /**
     * Test of setPaciente method, of class Doctor.
     */
    @Test
    public void testSetPaciente() {
    }
    
}
