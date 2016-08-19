package edu.uniminuto.ordenamiento.test;

import edu.uniminuto.ordenamiento.Ordenamiento;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * OrdenamientoTest
 *
 * @author fbeltra6@uniminuto.edu.co
 * @version 1.0
 * @since 2016-08-18
 */
public class OrdenamientoTest {

    Ordenamiento inOrdenamiento = new Ordenamiento();
    int[] result = null;
    String TEST_ARRAY1;
    String TEST_ARRAY1_ASC;
    String TEST_ARRAY1_DESC;
    String TEST_ARRAY2;
    String TEST_ARRAY2_ASC;
    String TEST_ARRAY2_DESC;
    String TEST_ARRAY3;
    String TEST_ARRAY3_ASC;
    String TEST_ARRAY3_DESC;
    String TEST_ARRAY4;
    String TEST_ARRAY4_ASC;
    String TEST_ARRAY4_DESC;
    String TEST_ARRAY5;
    String TEST_ARRAY5_ASC;
    String TEST_ARRAY5_DESC;
    String TEST_ARRAY6;
    String TEST_ARRAY6_ASC;
    String TEST_ARRAY6_DESC;
    String TEST_ARRAY7;
    String TEST_ARRAY7_ASC;
    String TEST_ARRAY7_DESC;

    public OrdenamientoTest() {

        InputStream inputStream = null;
        try {
            Properties properties = new Properties();
            String fileName = "test\\edu\\uniminuto\\ordenamiento\\test\\TestCase.properties";
            inputStream = new FileInputStream(fileName);
            properties.load(inputStream);

            TEST_ARRAY1 = properties.getProperty("TEST_ARRAY1");
            TEST_ARRAY1_ASC = properties.getProperty("TEST_ARRAY1_ASC");
            TEST_ARRAY1_DESC = properties.getProperty("TEST_ARRAY1_DESC");
            TEST_ARRAY2 = properties.getProperty("TEST_ARRAY2");
            TEST_ARRAY2_ASC = properties.getProperty("TEST_ARRAY2_ASC");
            TEST_ARRAY2_DESC = properties.getProperty("TEST_ARRAY2_DESC");
            TEST_ARRAY3 = properties.getProperty("TEST_ARRAY3");
            TEST_ARRAY3_ASC = properties.getProperty("TEST_ARRAY3_ASC");
            TEST_ARRAY3_DESC = properties.getProperty("TEST_ARRAY3_DESC");
            TEST_ARRAY4 = properties.getProperty("TEST_ARRAY4");
            TEST_ARRAY4_ASC = properties.getProperty("TEST_ARRAY4_ASC");
            TEST_ARRAY4_DESC = properties.getProperty("TEST_ARRAY4_DESC");
            TEST_ARRAY5 = properties.getProperty("TEST_ARRAY5");
            TEST_ARRAY5_ASC = properties.getProperty("TEST_ARRAY5_ASC");
            TEST_ARRAY5_DESC = properties.getProperty("TEST_ARRAY5_DESC");
            TEST_ARRAY6 = properties.getProperty("TEST_ARRAY6");
            TEST_ARRAY6_ASC = properties.getProperty("TEST_ARRAY6_ASC");
            TEST_ARRAY6_DESC = properties.getProperty("TEST_ARRAY6_DESC");
            TEST_ARRAY7 = properties.getProperty("TEST_ARRAY7");
            TEST_ARRAY7_ASC = properties.getProperty("TEST_ARRAY7_ASC");
            TEST_ARRAY7_DESC = properties.getProperty("TEST_ARRAY7_DESC");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(OrdenamientoTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OrdenamientoTest.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                inputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(OrdenamientoTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
     * Recibe una cadena de texto con número separados por comas y lo convierte
     * a un array de tipo entero.
     *
     * @param text
     * @return array tipo int
     */
    public int[] toIntArray(String text) {
        String[] stringArray = text.split("\\,");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            String numberAsString = stringArray[i];
            intArray[i] = Integer.parseInt(numberAsString);
        }
        return intArray;
    }

    /**
     * Test of insercionAscendente method, of class Ordenamiento.
     */
    @Test
    public void testInsercionAscendente() {
        System.out.println("INSERCIÓN ASCENDENTE");
        result = inOrdenamiento.insercionAscendente(toIntArray(TEST_ARRAY7));
        System.out.println("Tamaño: " + result.length);
        assertArrayEquals(toIntArray(TEST_ARRAY7_ASC), result);
        System.out.println("Array: " + Arrays.toString(result));
        System.out.println("");

    }

    /**
     * Test of insercionDescendente method, of class Ordenamiento.
     */
    @Test
    public void testInsercionDescendente() {
        System.out.println("INSERCIÓN DESCENDENTE");
        result = inOrdenamiento.insercionDescendente(toIntArray(TEST_ARRAY7));
        System.out.println("Tamaño: " + result.length);
        assertArrayEquals(toIntArray(TEST_ARRAY7_DESC), result);
        System.out.println("Array: " + Arrays.toString(result));
        System.out.println("");
    }

    /**
     * Test of seleccionAscendente method, of class Ordenamiento.
     */
    @Test
    public void testSeleccionAscendente() {
        System.out.println("SELECCION ASCENDENTE");
        result = inOrdenamiento.insercionAscendente(toIntArray(TEST_ARRAY7));
        System.out.println("Tamaño: " + result.length);
        assertArrayEquals(toIntArray(TEST_ARRAY7_ASC), result);
        System.out.println("Array: " + Arrays.toString(result));
        System.out.println("");
    }

    /**
     * Test of seleccionDescendente method, of class Ordenamiento.
     */
    @Test
    public void testSeleccionDescendente() {
        System.out.println("SELECCION DESCENDENTE");
        result = inOrdenamiento.seleccionDescendente(toIntArray(TEST_ARRAY7));
        System.out.println("Tamaño: " + result.length);
        assertArrayEquals(toIntArray(TEST_ARRAY7_DESC), result);
        System.out.println("Array: " + Arrays.toString(result));
        System.out.println("");
    }
}
