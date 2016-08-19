package edu.uniminuto.ordenamiento;

/**
 * La clase Ordenamiento contiene metodos de ordenamiento.
 *
 * @author fbeltra6@uniminuto.edu.co
 * @version 1.0
 * @since 2016-08-18
 */
public class Ordenamiento {

    /**
     * Retorna un array de tipo entero ordenado. Utilizando el metodo de
     * ordenamiento por insercionAscendente.
     *
     * @param array
     * @return array ordenado
     */
    public int[] insercionAscendente(int[] array) {
        int auxiliar;
        int tamañoArray = array.length;
        for (int i = 1; i < tamañoArray; i++) {
            auxiliar = array[i];
            for (int j = i - 1; j >= 0 && array[j] > auxiliar; j--) {
                array[j + 1] = array[j];
                array[j] = auxiliar;
            }
        }
        return array;
    }

    /**
     * Retorna un array de tipo entero ordenado. Utilizando el metodo de
     * ordenamiento por insercionDescendente.
     *
     * @param array
     * @return array ordenado
     */
    public int[] insercionDescendente(int[] array) {
        int auxiliar;
        int tamañoArray = array.length;
        for (int i = 1; i < tamañoArray; i++) {
            auxiliar = array[i];
            for (int j = i - 1; j >= 0 && array[j] < auxiliar; j--) {
                array[j + 1] = array[j];
                array[j] = auxiliar;
            }
        }
        return array;
    }

    /**
     * Retorna un array de tipo entero ordenado. Utilizando el metodo de
     * ordenamiento por seleccionAscendente.
     *
     * @param array
     * @return array ordenado
     */
    public int[] seleccionAscendente(int[] array) {
        int tamañoArray = array.length;
        for (int i = 0; i < tamañoArray - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < tamañoArray; j++) {
                if (array[j] < array[menor]) {
                    menor = j;
                }
            }
            if (i != menor) {
                int aux = array[i];
                array[i] = array[menor];
                array[menor] = aux;
            }
        }
        return array;
    }

    /**
     * Retorna un array de tipo entero ordenado. Utilizando el metodo de
     * ordenamiento por seleccionDescendente.
     *
     * @param array
     * @return array ordenado
     */
    public int[] seleccionDescendente(int[] array) {
        int tamañoArray = array.length;
        for (int i = 0; i < tamañoArray - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < tamañoArray; j++) {
                if (array[j] > array[menor]) {
                    menor = j;
                }
            }
            if (i != menor) {
                int aux = array[i];
                array[i] = array[menor];
                array[menor] = aux;
            }
        }
        return array;
    }
}
