/**
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar el periodo, la Dirección de la carrera de Computación
 * ha solicitado las siguientes estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN en función a los promedios por estudiante,
 * dichos promedios se deben calcular (ponderar, ya que el docente ingresa  sobre 10pts.) de 3 calificaciones (ACD que representa el 35% de la nota,
 * APE del 35% y la nota del AA con un peso del 30%). En resumen, los requerimientos son los siguientes:

 * Registre los nombres de cada estudiante de dicho paralelo.
 * Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
 * Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
 * Obtenga el promedio del curso, del paralelo C.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
 * Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
 * Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase).
 **/

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio03 {
    public static void main(String[] args) {
        int nS = 28;
        Random rand = new Random();
        String[] estudiantes = new String[nS];
        double[] acd = new double[nS], ape = new double[nS], aa = new double[nS], promedios = new double[nS];
        double promedioPromedio = 0.0;

        // Generar datos aleatorios y calcular el promedio de cada estudiante
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = "Estudiante-" + (i + 1);
            acd[i] = rand.nextFloat() * 10; // Calificación entre 0 y 10
            ape[i] = rand.nextFloat() * 10;
            aa[i] = rand.nextFloat() * 10;
            promedios[i] = (acd[i] * 0.35) + (ape[i] * 0.35) + (aa[i] * 0.3);
            promedioPromedio += promedios[i];
        }

        // Calcular promedio general de la clase
        promedioPromedio /= estudiantes.length;

        // Encontrar estudiantes por encima del promedio
        ArrayList<String> estudiantesEncimaPromedio = new ArrayList<>();
        ArrayList<Double> calificacionEncimaPromedio = new ArrayList<>();
        ArrayList<String> estudiantesDebajoPromedio = new ArrayList<>();
        ArrayList<Double> calificacionDebajoPromedio = new ArrayList<>();
        int mejorAlumno = 0, peorAlumno = 0;

        for (int i = 0; i < estudiantes.length; i++) {
            if (promedios[i] > promedioPromedio) {
                estudiantesEncimaPromedio.add(estudiantes[i]);
                calificacionEncimaPromedio.add(promedios[i]);
            }
            if (promedios[i] < promedioPromedio) {
                estudiantesDebajoPromedio.add(estudiantes[i]);
                calificacionDebajoPromedio.add(promedios[i]);
            }

            // Determinar mejor y peor alumno
            if (promedios[i] > promedios[mejorAlumno]) {
                mejorAlumno = i;
            }
            if (promedios[i] < promedios[peorAlumno]) {
                peorAlumno = i;
            }
        }


        System.out.printf("\n\nPromedio general de la clase: %.2f\n", promedioPromedio);

        System.out.println("\nEstudiantes por encima del promedio general:");
        for (int i = 0; i < calificacionEncimaPromedio.size(); i++) {
            System.out.printf("%s\t%s\t%.2f\n", estudiantesEncimaPromedio.get(i), "|", calificacionEncimaPromedio.get(i));
        }

        System.out.println("\nEstudiantes por debajo del promedio general:");
        for (int i = 0; i < calificacionDebajoPromedio.size(); i++) {
            System.out.printf("%s\t%s\t%.2f\n", estudiantesDebajoPromedio.get(i), "|", calificacionDebajoPromedio.get(i));
        }

        System.out.printf("\nEl mejor alumno es %s con un promedio de %.2f\n", estudiantes[mejorAlumno], promedios[mejorAlumno]);
        System.out.printf("El peor alumno es %s con un promedio de %.2f\n", estudiantes[peorAlumno], promedios[peorAlumno]);
    }
}

/*
 * Salida:
 * Promedio general de la clase: 5.34

 * Estudiantes por encima del promedio general:
 * Estudiante-2	    |	9.01
 * Estudiante-4	    |	6.15
 * Estudiante-5	    |	5.94
 * Estudiante-8	    |	7.90
 * Estudiante-10	|	7.65
 * Estudiante-13	|	5.98
 * Estudiante-16	|	5.87
 * Estudiante-17	|	6.41
 * Estudiante-22	|	6.06
 * Estudiante-23	|	6.99
 * Estudiante-24	|	7.86
 * Estudiante-26	|	7.89
 * Estudiante-28	|	6.52

 * Estudiantes por debajo del promedio general:
 * Estudiante-1	    |	1.95
 * Estudiante-3	    |	4.03
 * Estudiante-6	    |	3.57
 * Estudiante-7	    |	5.05
 * Estudiante-9	    |	4.24
 * Estudiante-11	|	4.92
 * Estudiante-12	|	2.71
 * Estudiante-14	|	2.78
 * Estudiante-15	|	3.64
 * Estudiante-18	|	4.46
 * Estudiante-19	|	4.51
 * Estudiante-20	|	5.09
 * Estudiante-21	|	3.65
 * Estudiante-25	|	3.94
 * Estudiante-27	|	4.75

 * El mejor alumno es Estudiante-2 con un promedio de 9.01
 * El peor alumno es Estudiante-1 con un promedio de 1.95
 */
