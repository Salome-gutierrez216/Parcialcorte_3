/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author salom
 */
public class MotorCombateTest {
    
    public MotorCombateTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of ejecutarAtaque method, of class MotorCombate.
     */
    @org.junit.jupiter.api.Test
    public void testEjecutarAtaque_5args() {
        System.out.println("ejecutarAtaque");
        Jugador jAtacante = null;
        Jugador jDefensor = null;
        CartaMonstruo atacante = null;
        CartaMonstruo defensor = null;
        GestorPersistencia persistencia = null;
        MotorCombate instance = new MotorCombate();
        String expResult = "";
        String result = instance.ejecutarAtaque(jAtacante, jDefensor, atacante, defensor, persistencia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejecutarAtaque method, of class MotorCombate.
     */
    @org.junit.jupiter.api.Test
    public void testEjecutarAtaque_4args() {
        System.out.println("ejecutarAtaque");
        Jugador jAtacante = null;
        Jugador jDefensor = null;
        CartaMonstruo atacante = null;
        GestorPersistencia persistencia = null;
        MotorCombate instance = new MotorCombate();
        String expResult = "";
        String result = instance.ejecutarAtaque(jAtacante, jDefensor, atacante, persistencia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
