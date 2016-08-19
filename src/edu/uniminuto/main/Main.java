package edu.uniminuto.main;

import edu.uniminuto.ordenamiento.Ordenamiento;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase Main se encarga de ejecutar la aplicacion.
 *
 * @author fbeltra6@uniminuto.edu.co
 * @version 1.0
 * @since 2016-08-18
 */
public class Main {

    public static void main(String[] args) {
        try {
            Ordenamiento ordenamiento = new Ordenamiento();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese Array a ordenar separado por comas (,) || Ejemplo: 4,7,6,2,1,3 ");
            String inputArray = bufferedReader.readLine().trim();
            int opcion;
            if (inputArray != null) {
                System.out.println("Digite el número del método de ordenamiento: ");
                System.out.println("1 - Ordenamiento por Selección Ascendente");
                System.out.println("2 - Ordenamiento por Selección Descendente");
                System.out.println("3 - Ordenamiento por Inserción Ascendente");
                System.out.println("4 - Ordenamiento por Inserción Descendente");
                opcion = Integer.parseInt(bufferedReader.readLine().trim());

                switch (opcion) {
                    case 1:
                        System.out.println("Opcion " + opcion + " seleccionada");
                        System.out.println("Ordenamiento por Selección Ascendente");
                        System.out.println("Array Ordenado: ");
                        System.out.println(Arrays.toString(ordenamiento.seleccionAscendente(toIntArray(inputArray))));
                        break;
                    case 2:
                        System.out.println("Opcion " + opcion + " seleccionada");
                        System.out.println("Ordenamiento por Selección Descendente");
                        System.out.println("Array Ordenado: ");
                        System.out.println(Arrays.toString(ordenamiento.seleccionDescendente(toIntArray(inputArray))));
                        break;
                    case 3:
                        System.out.println("Opcion " + opcion + " seleccionada");
                        System.out.println("Ordenamiento por Inserción Ascendente");
                        System.out.println("Array Ordenado: ");
                        System.out.println(Arrays.toString(ordenamiento.insercionAscendente(toIntArray(inputArray))));
                        break;
                    case 4:
                        System.out.println("Opcion " + opcion + " seleccionada");
                        System.out.println("Ordenamiento por Inserción Descendente");
                        System.out.println("Array Ordenado: ");
                        System.out.println(Arrays.toString(ordenamiento.insercionDescendente(toIntArray(inputArray))));
                        break;
                    default:
                        System.out.println("No se seleccionó ninguna opción valida");
                        System.out.println("Método de ordenamiento Default: Selección Ascendente: ");
                        System.out.println(Arrays.toString(ordenamiento.insercionAscendente(toIntArray(inputArray))));
                        break;
                }

            } else {
                System.out.println("No se ha recibido ningún valor");
                System.exit(0);
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Recibe una cadena de texto con número separados por comas y lo convierte
     * a un array de tipo entero.
     *
     * @param text
     * @return array tipo int
     */
    public static int[] toIntArray(String text) {
        String[] stringArray = text.split("\\,");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            String numberAsString = stringArray[i];
            intArray[i] = Integer.parseInt(numberAsString); 
        }
        return intArray;
    }
}
