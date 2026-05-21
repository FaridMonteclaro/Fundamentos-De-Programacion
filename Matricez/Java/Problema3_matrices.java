public class Problema3_matrices {
    public static void main(String[] args) {
        int[][] pascal = new int[7][13];
        pascal[0][6] = 1;
        for (int r = 1; r < pascal.length; r++) {
            for (int c = 0; c < pascal[r].length; c++) {
                int arriba = (r-1 >= 0) ? pascal[r-1][c] : 0;
                int arribaIzq = (r-1 >= 0 && c-1 >= 0) ? pascal[r-1][c-1] : 0;
                pascal[r][c] = arriba + arribaIzq;
            }
        }
        // Imprimir solo los números > 0
        for (int r = 0; r < pascal.length; r++) {
            for (int c = 0; c < pascal[r].length; c++) {
                if (pascal[r][c] != 0)
                    System.out.print(pascal[r][c] + " ");
            }
            System.out.println();
        }
    }
}
