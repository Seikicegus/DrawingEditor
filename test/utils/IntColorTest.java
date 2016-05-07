package utils;

import exceptions.MyOutOfBoundsException;
import exceptions.MyStringLengthException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Seikicegus
 */
public class IntColorTest {
    
    public IntColorTest() {
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
     * Test of getARGB method, of class IntColor.
     */
    @Test
    public void testGetARGB() {
        try {
            System.out.println("getARGB");
            IntColor instance = IntColor.Green;
            int expResult = IntColor.ARGB("ff00ff00");
            int result = instance.getARGB();
            assertEquals(expResult, result);
        } catch (MyStringLengthException ex) {
            Logger.getLogger(IntColorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of ARGB method, of class IntColor.
     */
    @Test
    public void testARGB_1() throws Exception {
        System.out.println("ARGB_1");
        String hexa = "00000000"; // Transparent
        int expResult = 0;
        int result = 1;
        try {
            result = IntColor.ARGB(hexa);
        } catch (MyStringLengthException e) {
            assertFalse(true);
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of ARGB method, of class IntColor.
     */
    @Test
    public void testARGB_2() throws Exception {
        System.out.println("ARGB_2");
        String hexa = "ff00ff00"; // Green
        int expResult = (int) Long.parseLong(hexa, 16);
        int result = 1;
        try {
            result = IntColor.ARGB(hexa);
        } catch (MyStringLengthException e) {
            assertFalse(true);
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of ARGB method, of class IntColor.
     */
    @Test
    public void testARGB_3() throws Exception {
        System.out.println("ARGB_3");
        String hexa = "ff000";
        int result = 1;
        try {
            result = IntColor.ARGB(hexa);
            assertFalse(true);
        } catch (MyStringLengthException e) {
            assertTrue(true);
        }
    }

    /**
     * Test of ARGB method, of class IntColor.
     */
    @Test
    public void testARGB_4() throws Exception {
        System.out.println("ARGB_4");
        String expResult = "ff00ff00";
        try {
            int code = IntColor.ARGB(expResult);
            String result = IntColor.ARGB(code);
            assertEquals(expResult, result);
        } catch (MyStringLengthException ex) {
            Logger.getLogger(IntColorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of ARGB method, of class IntColor.
     */
    @Test
    public void testRGB_1() throws Exception {
        System.out.println("RGB_1");
        String hexa = "00ff00"; // Green
        int expResult = (int) Long.parseLong("ff"+hexa, 16);
        int result = 1;
        try {
            result = IntColor.RGB(hexa);
        } catch (MyStringLengthException e) {
            assertFalse(true);
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of ARGB method, of class IntColor.
     */
    @Test
    public void testRGB_2() throws Exception {
        System.out.println("RGB_2");
        String hexa = "ff000";
        int result = 1;
        try {
            result = IntColor.RGB(hexa);
            assertFalse(true);
        } catch (MyStringLengthException e) {
            assertTrue(true);
        }
    }
    
}
