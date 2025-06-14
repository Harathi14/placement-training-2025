public class add2matrix {
    public static void main(String[] args) {
        // Define two matrices
        int[][] firstMatrix = {
            {2, 3, 4},
            {5, 2, 3}
        };

        int[][] secondMatrix = {
            {-4, 5, 3},
            {5, 6, 3}
        };

        // Determine the number of rows and columns
        int rows = firstMatrix.length;
        int columns = firstMatrix[0].length;

        // Initialize a matrix to store the sum
        int[][] sum = new int[rows][columns];

        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Display the result
        System.out.println("Sum of the two matrices is:");
        for (int[] row : sum) {
            for (int value : row) {
                System.out.print(value + "    ");
            }
            System.out.println();
        }
    }
}
