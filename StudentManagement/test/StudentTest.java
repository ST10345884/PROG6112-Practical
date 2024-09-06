/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ST10345884 TIEGO
 */
public class StudentTest {
    
    public StudentTest() {
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

    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        Student instance = null;
        String expResult = "";
        String result = instance.getStudentID();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetStudentName() {
        System.out.println("getStudentName");
        Student instance = null;
        String expResult = "";
        String result = instance.getStudentName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetStudentAge() {
        System.out.println("getStudentAge");
        Student instance = null;
        int expResult = 0;
        int result = instance.getStudentAge();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetStudentEmail() {
        System.out.println("getStudentEmail");
        Student instance = null;
        String expResult = "";
        String result = instance.getStudentEmail();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetStudentCourse() {
        System.out.println("getStudentCourse");
        Student instance = null;
        String expResult = "";
        String result = instance.getStudentCourse();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
