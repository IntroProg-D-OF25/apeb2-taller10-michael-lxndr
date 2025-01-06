/**
 * Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros aleatorios, desarrollar su
 * procesamiento para calcular y presentar:

 * La suma de las dos matrices (considerar las restricciones matemáticas para ello).
 * La multiplicación de las dos matrices (considerar las reglas matemáticas para ello).
 */

import java.util.Random;

public class Ejercicio02 {
    public static void main(String[] args) {

        int n = 4;
        int[][] m1 = new int[n][n];
        int[][] m2 = new int[n][n];
        int[][] m3 = new int[n][n];

        Random random = new Random();
        System.out.println("MATRIZ [1]");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nMATRIZ [2]");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m2[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nSUMA DE MATRICES\n// MATRIZ [1] + MATRIZ [2] = MATRIZ [3] \t");
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
                System.out.print(m3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
/**
 * MATRIZ [1]
 * 1	6	1	7
 * 8	7	6	7
 * 5	8	2	3
 * 6	3	1	5
 * <p>
 * MATRIZ [2]
 * 8	0	3	9
 * 3	8	1	7
 * 0	9	2	5
 * 7	2	0	3
 * <p>
 * SUMA DE MATRICES
 * // MATRIZ [1] + MATRIZ [2] = MATRIZ [3]
 * 9	6	4	16
 * 11	15	7	14
 * 5	17	4	8
 * 13	5	1	8
 */
