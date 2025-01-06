/**
 * Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3. Permita a dos jugadores marcar sus movimientos alternativamente.
 * El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 **/

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        char[][] tablero = new char[3][3]; // Matriz de 3x3
        inicializarTablero(tablero);
        Scanner scanner = new Scanner(System.in);
        char jugadorActual = 'X'; // El primer jugador usa 'X'
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            imprimirTablero(tablero);
            System.out.println("Turno del jugador " + jugadorActual);
            System.out.print("Ingrese fila (1-3): ");
            int fila = scanner.nextInt() - 1; // Convertir a índice 0
            System.out.print("Ingrese columna (1-3): ");
            int columna = scanner.nextInt() - 1;

            if (esMovimientoValido(tablero, fila, columna)) {
                tablero[fila][columna] = jugadorActual;
                if (verificarGanador(tablero, jugadorActual)) {
                    imprimirTablero(tablero);
                    System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                    juegoTerminado = true;
                } else if (esEmpate(tablero)) {
                    imprimirTablero(tablero);
                    System.out.println("¡Es un empate!");
                    juegoTerminado = true;
                } else {
                    // Cambiar turno
                    jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Movimiento no válido. Intente nuevamente.");
            }
        }

        scanner.close();
    }

    // Inicializar el tablero con espacios vacíos
    public static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    // Imprimir el tablero
    public static void imprimirTablero(char[][] tablero) {
        System.out.println("  1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println(" ---+---+---");
            }
        }
    }

    // Verificar si un movimiento es válido
    public static boolean esMovimientoValido(char[][] tablero, int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ';
    }

    // Verificar si un jugador ha ganado
    public static boolean verificarGanador(char[][] tablero, char jugador) {
        // Verificar filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true;
            }
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                return true;
            }
        }
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }
        return tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador;
    }

    // Verificar si hay un empate
    public static boolean esEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // Hay al menos un espacio vacío
                }
            }
        }
        return true; // No hay espacios vacíos y nadie ha ganado
    }
}


/*
 * Salida:
 *   1   2   3
 * 1   |   |
 *  ---+---+---
 * 2   |   |
 *  ---+---+---
 * 3   |   |
 * Turno del jugador X
 * Ingrese fila (1-3): 2
 * Ingrese columna (1-3): 2
 *   1   2   3
 * 1   |   |
 *  ---+---+---
 * 2   | X |
 *  ---+---+---
 * 3   |   |
 * Turno del jugador O
 * Ingrese fila (1-3): 2
 * Ingrese columna (1-3): 3
 *   1   2   3
 * 1   |   |
 *  ---+---+---
 * 2   | X | O
 *  ---+---+---
 * 3   |   |
 * Turno del jugador X
 * Ingrese fila (1-3): 1
 * Ingrese columna (1-3): 1
 *   1   2   3
 * 1 X |   |
 *  ---+---+---
 * 2   | X | O
 *  ---+---+---
 * 3   |   |
 * Turno del jugador O
 * Ingrese fila (1-3): 1
 * Ingrese columna (1-3): 3
 *   1   2   3
 * 1 X |   | O
 *  ---+---+---
 * 2   | X | O
 *  ---+---+---
 * 3   |   |
 * Turno del jugador X
 * Ingrese fila (1-3): 3
 * Ingrese columna (1-3): 3
 *   1   2   3
 * 1 X |   | O
 *  ---+---+---
 * 2   | X | O
 *  ---+---+---
 * 3   |   | X
 * ¡El jugador X ha ganado!
*/