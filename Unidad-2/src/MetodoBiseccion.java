package metodobiseccion;

import java.util.Scanner;

public class MetodoBiseccion {

    public static double f(double x) {
        return Math.pow(x, 3) - x - 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("METODO DE BISECCION");
        System.out.println("Funcion: f(x) = x^3 - x - 2");

        System.out.print("Ingresa el limite inferior a: ");
        double a = sc.nextDouble();

        System.out.print("Ingresa el limite superior b: ");
        double b = sc.nextDouble();

        System.out.print("Ingresa la tolerancia: ");
        double tolerancia = sc.nextDouble();

        System.out.print("Ingresa el numero maximo de iteraciones: ");
        int maxIteraciones = sc.nextInt();

        if (f(a) * f(b) > 0) {
            System.out.println("No se puede aplicar el metodo.");
            System.out.println("f(a) y f(b) tienen el mismo signo.");
            return;
        }

        double c = 0;
        int iteracion = 1;

        System.out.println("\nIteracion\t a\t\t b\t\t c\t\t f(c)\t\t Error");

        while (iteracion <= maxIteraciones) {
            c = (a + b) / 2;
            double fc = f(c);
            double error = Math.abs(b - a);

            System.out.printf("%d\t\t %.6f\t %.6f\t %.6f\t %.6f\t %.6f\n",
                    iteracion, a, b, c, fc, error);

            if (Math.abs(fc) < tolerancia || error < tolerancia) {
                break;
            }

            if (f(a) * fc < 0) {
                b = c;
            } else {
                a = c;
            }

            iteracion++;
        }

        System.out.println("\nRaiz aproximada: " + c);
        System.out.println("f(raiz) = " + f(c));
    }
}