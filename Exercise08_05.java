import java.util.Scanner;

public class Exercise08_05 {
    public Exercise08_05() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ROW = true;
        int COLUMN = true;
        double[][] matrix1 = new double[3][3];
        System.out.print("Enter your values for the first matrix: ");

        int x;
        for(int i = 0; i < matrix1.length; ++i) {
            for(x = 0; x < matrix1[i].length; ++x) {
                matrix1[i][x] = input.nextDouble();
            }
        }

        double[][] matrix2 = new double[3][3];
        System.out.print("Enter your values for the second matrix: ");

        for(x = 0; x < matrix2.length; ++x) {
            for(int y = 0; y < matrix2[x].length; ++y) {
                matrix2[x][y] = input.nextDouble();
            }
        }

        double[][] result = add(matrix1, matrix2);
        System.out.println("The addition of the matrices is:");
        printResult(matrix1, matrix2, result, '+');
    }

    public static double[][] add(double[][] m1, double[][] m2) {
        double[][] sum = new double[m1.length][m1[0].length];

        for(int i = 0; i < m1.length; ++i) {
            for(int j = 0; j < m1[i].length; ++j) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return sum;
    }

    public static void printResult(double[][] m1, double[][] m2, double[][] m3, char op) {
        for(int i = 0; i < m1.length; ++i) {
            int j;
            for(j = 0; j < m1[0].length; ++j) {
                System.out.print(" " + m1[i][j]);
            }

            if (i == m1.length / 2) {
                System.out.print(" " + op + " ");
            } else {
                System.out.print("   ");
            }

            for(j = 0; j < m2[0].length; ++j) {
                System.out.print(" " + m2[i][j]);
            }

            if (i == m1.length / 2) {
                System.out.print(" = ");
            } else {
                System.out.print("    ");
            }

            for(j = 0; j < m3[0].length; ++j) {
                System.out.print(" " + m3[i][j]);
            }

            System.out.println();
        }

    }
}

