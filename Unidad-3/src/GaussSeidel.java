import java.util.Scanner;

public class GaussSeidel {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el total de ecuaciones:");
        int n = entrada.nextInt();

        double[][] coef = new double[n][n];
        double [] independiente = new double[n];
        double [] valores = new double[n];

        //Captura de la matriz de coeficientes
        System.out.println("\nDatos del sistema de ecuaciones:");
        for(int fila = 0; fila < n; fila++){
              System.out.println("Ecuacion " + (fila + 1));

            for (int col = 0; col < n; col++) {
                System.out.print("Valor del Coeficiente [" + (fila + 1) + "][" + (col + 1) + "]: ");
                coef[fila][col] = entrada.nextDouble();
            }

            System.out.print("Valor del Termino independiente: ");
            independiente[fila] = entrada.nextDouble();
        }

        //Valores iniciales para las iteraciones
        System.out.println("\nIngresar los Valores iniciales:");
        for (int i = 0; i < n; i++) {
            System.out.print("x" + (i + 1) + " = ");
            valores[i] = entrada.nextDouble();
        }

        System.out.print("\nIngresar la Tolerancia: ");
        double tolerancia = entrada.nextDouble();

        System.out.print("Ingresar el Numero maximo de iteraciones: ");
        int maximo = entrada.nextInt();

        resolverGaussSeidel(coef, independiente, valores, tolerancia, maximo);

        entrada.close();
    }

    public static void resolverGaussSeidel(double[][] coef, double[] independiente,
                                           double[] valores, double tolerancia,
                                           int maximo) {

        int n = valores.length;

        for (int iteracion = 1; iteracion <= maximo; iteracion++) {
            double errorMayor = 0;

            System.out.println("\nIteracion " + iteracion);

            for (int fila = 0; fila < n; fila++) {
                double suma = 0;

                for (int col = 0; col < n; col++) {
                    if (col != fila) {
                        suma += coef[fila][col] * valores[col];
                    }
                }

                double anterior = valores[fila];
                valores[fila] = (independiente[fila] - suma) / coef[fila][fila];

                double error = Math.abs(valores[fila] - anterior);

                if (error > errorMayor) {
                    errorMayor = error;
                }

                System.out.printf("x%d = %.6f\n", fila + 1, valores[fila]);
            }

            System.out.printf("Error mayor = %.6f\n", errorMayor);

            if (errorMayor < tolerancia) {
                System.out.println("\nEl metodo llego a la tolerancia indicada.");
                break;
            }
        }

        System.out.println("\nResultado final aproximado:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.6f\n", i + 1, valores[i]);
        }
    }
}