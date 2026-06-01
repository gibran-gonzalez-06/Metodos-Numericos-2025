# Código Fuente - Unidad 4

## Descripción

Esta carpeta contiene los programas desarrollados en Java para la aplicación de métodos de integración numérica.

Los programas permiten aproximar el valor de una integral definida utilizando diferentes técnicas de integración, mostrando los resultados obtenidos a partir de los datos ingresados por el usuario.

## Programas incluidos

### ReglaTrapecio.java

Implementa el Método del Trapecio para aproximar el área bajo una curva.

Características:

- Solicita límite inferior (a).
- Solicita límite superior (b).
- Solicita el número de intervalos.
- Calcula el tamaño del paso (h).
- Muestra el resultado aproximado de la integral.

Ejemplo ejecutado:

- Función: f(x) = x³
- a = 0
- b = 1
- Intervalos = 4
- Resultado aproximado = 0.34375

---

### ReglaSimpson.java

Implementa el Método de Simpson 1/3 para aproximar una integral definida.

Características:

- Solicita límite inferior.
- Solicita límite superior.
- Solicita un número par de intervalos.
- Calcula la aproximación de la integral mediante la fórmula de Simpson.

Ejemplo ejecutado:

- Función: f(x) = x²
- Intervalo = [0,2]
- Número de intervalos = 4
- Resultado aproximado = 2.6666666666666665

## Objetivo

Aplicar métodos numéricos de integración para obtener aproximaciones de integrales definidas mediante programación en Java.

## Lenguaje utilizado

Java
