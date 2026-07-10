package matrix;

public class Main2 {

    public static void main(String[] args) {

        int[][] A = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] B = {
                {9,8,7},
                {6,5,4},
                {3,2,1}
        };

        MatrixOperations op = new MatrixOperations();
        MatrixAdvanced adv = new MatrixAdvanced();

        System.out.println("Matrix A");
        op.printMatrix(A);

        System.out.println("\nMatrix B");
        op.printMatrix(B);

        System.out.println("\nAddition");
        op.printMatrix(op.add(A,B));

        System.out.println("\nSubtraction");
        op.printMatrix(op.subtract(A,B));

        System.out.println("\nMultiplication");
        op.printMatrix(op.multiply(A,B));

        System.out.println("\nTranspose of A");
        op.printMatrix(op.transpose(A));

        System.out.println("\nSum = " + adv.sum(A));


        System.out.println("Diagonal Sum = " + adv.diagonalSum(A));

        System.out.println("Search 5 = " + adv.search(A,5));

        System.out.println("Identity Matrix = " + adv.isIdentity(A));

        System.out.println("Symmetric Matrix = " + adv.isSymmetric(A));
    }
}