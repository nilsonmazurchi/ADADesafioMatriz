import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class etapa1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtém a dimensão da matriz do usuário
        System.out.print("Digite a dimensão da matriz (3, 5, 10, 100, ou 1000): ");
        int dimension = scanner.nextInt();

        // Verifica se a dimensão inserida está entre os tamanhos permitidos
        if (dimension != 3 && dimension != 5 && dimension != 10 && dimension != 100 && dimension != 1000) {
            System.out.println("Tamanho de matriz inválido. Escolha entre 3, 5, 10, 100 ou 1000.");
            return;
        }

        // Cria as matrizes com valores aleatórios
        int[][] a = createRandomMatrix(dimension);
        int[][] b = createRandomMatrix(dimension);
        int[][] c = multiplyMatrices(a, b);

        // Imprime as matrizes geradas e o resultado da multiplicação
        System.out.println("Matriz A:");
        printMatrix(a);
        System.out.println("Matriz B:");
        printMatrix(b);
        System.out.println("Resultado da multiplicação:");
        printMatrix(c);
    }

    // Função para criar uma matriz com a dimensão especificada e valores aleatórios
    public static int[][] createRandomMatrix(int dimension) {
        Random random = new Random();
        int[][] matrix = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = random.nextInt(10); // Gera números aleatórios de 0 a 9 (altere conforme necessário)
            }
        }

        return matrix;
    }

    // Função para imprimir uma matriz
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    // Função para multiplicar duas matrizes
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }
}

