# Código Fuente - Unidad 2

## Descripción

Esta carpeta contiene los programas desarrollados en Java para resolver ecuaciones no lineales mediante métodos numéricos iterativos.

## Programas incluidos

### MetodoBiseccion.java

Implementa el Método de Bisección para aproximar raíces de ecuaciones.

Características:

- Solicita límite inferior y superior.
- Verifica el cambio de signo en el intervalo.
- Calcula el punto medio.
- Evalúa la función en cada iteración.
- Calcula el error aproximado.
- Muestra la raíz aproximada obtenida.

Ejemplo utilizado
f(x) = x³ - x - 2

a = 1

b = 2

Tolerancia = 0.1

Iteraciones máximas = 20

Resultado obtenido:

Raíz aproximada = 1.53125
---

### NewtonRaphson.java

Implementa el Método de Newton-Raphson para aproximar raíces de ecuaciones no lineales.

Características:

- Calcula f(x).
- Calcula f'(x).
- Aplica la fórmula iterativa de Newton-Raphson.
- Muestra las iteraciones realizadas.
- Calcula el error de aproximación.
- Obtiene la raíz aproximada.

Ejemplo utilizado:

f(x) = x² - 2

Raíz aproximada:

√2 ≈ 1.41421356

## Objetivo

Automatizar el cálculo de raíces de ecuaciones utilizando métodos numéricos iterativos desarrollados en Java.

## Lenguaje utilizado

Java
