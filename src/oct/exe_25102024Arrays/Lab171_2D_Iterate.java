package oct.exe_25102024Arrays;

public class Lab171_2D_Iterate {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        // R -3, C -3
        // We will iterate matrix by using two for loops one for rows and second is for columns

        for(int i =0; i<matrix.length;i++){
            for(int j =0; j<matrix[i].length;j++){
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
