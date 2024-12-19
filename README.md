# Taller 10

## Construcción de programas usando arreglos bidimensionales

* Leer detenidamente cada problemática propuesta.
* Programe/codifíque con el lenguaje de alto nivel Java _**(IDE NetBeans)**_, sus soluciones a cada uno de los problemas listados a continuación. 
* Para cada programa, genere una clase independiente pero dentro de un solo/único proyecto Java App. _(NO CREE VARIOS PROYECTOS, ni los empaquete, por favor, agregar los .java en el paquete por default)_. No olvide titular a cada clase, con el nombre representativo de la solución y con el número del problema de este listado. 
* No olvide la eficiencia en sus soluciones, limpieza del código, identación correcta, comenterias en procesos complejos, etc. lo cual para el 2do.Bim. no es opcional. 
* Verificar que sus soluciones son correctas con las técnicas de compilación, ejecución y depurado de programas. Y con el objetivo de evidenciar los resultados, por favor, dentro de la misma clase _(al final de todo el código)_, con los caracteres de bloque de comentarios, copie y pegue los resultados obtenidos en su solución, ejemplo: 

> *FORMATO*:
> ```
> /* BLOQUE DE COMENTARIOS */
> ```
> 
> *EJEMPLO*:
> ```
> /* 
> NOMBRES | ACD  | APE | AA  | PROMEDIOS
> Juan S.  | 5,85   | 6,70   | 6,83   | 6,44   
> Juan D.  | 0,92   | 3,44   | 6,55   | 3,49   
> Ricardo  | 7,43   | 9,50   | 6,96   | 8,01   
> Carlos   | 5,38   | 6,24   | 9,22   | 6,84    
>  */ 
> ```

### Ejercicio 1

Dada una matriz cuadrada _*(m X m)*_ de valores enteros aleatorios, desarrollar su procesamiento para presentar los elementos: 

- De la diagonal principal.
- De la diagonal segundaria.
- Ubicados bajo la diagonal principal.
- Ubicados sobre la diagonal principal.
- Ubicados bajo la diagonal secundaria.
- Ubicados sobre la diagonal secundaria.

### Ejercicio 2

Dadas dos matrices _(cuadradas y/o rectangulares)_ de valores enteros aleatorios, desarrollar su procesamiento para calcular y presentar:

- La suma de las dos matrices _(considerar las restricciones matemáticas para ello)_. 
- La multiplicación de las dos matrices _(considerar las reglas matemáticas para ello)_. 

### Ejercicio 3

El primer ciclo _paralelo C_, cuenta con **28** estudiantes, de los cuáles al finalizar el periodo, la Dirección de la carrera de Computación a solicitado las siguientes estadísticas de la materia **INTRODUCCIÓN A LA PROGRAMACIÓN** en función a los promedios por estudiante, dichos promedios se deben calcular _(ponderar, ya que el docente ingresa todo sobre 10pts.)_ de 3 calificaciones _(**ACD** que representa el **35%** de la nota, **APE** del **35%** y la nota del **AA** con un peso del **30%**)_. En resumen, los requerimientos son los siguientes: 

- Registre los nombres de cada estudiante de dicho paralelo.
- Genere aleatoriamente las notas **ACD**, **APE**, **AA**, para cada uno de los 28 estudiantes de 0-10 pts. 
- Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: **ACD**->35%, **APE**->35%, y el **AA**->30%.
- Obtenga el promedio del curso, del _paralelo C_. 
- Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso. 
- Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso. 
- Muestre el estudiante con su calificación, si es el del mayor promedio _(el más alto de la clase)_. 
- Muestre el estudiante con su calificación, si es el del menor promedio _(el más bajo de la clase)_. 

### Ejercicio 4

Crea un programa que gestione el inventario de una tienda. Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad. El programa debe permitir agregar nuevos productos, actualizar existencias, buscar productos y eliminarlos.

### Ejercicio 5

Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas. Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad. El programa debe permitir facturar un producto dado su código, y unidades deseadas. Adicional se debe agregar a la factura al _15% del IVA_, y si la compra superar los $100, se debe aplicar un descuento. 

_**Nota**_: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva. 

### Ejercicio 6

Crea un juego de tres en raya utilizando una matriz bidimensional de _**3x3**_. Permita a dos jugadores marcar sus movimientos alternativamente. El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.