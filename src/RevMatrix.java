
public class RevMatrix {
	
	private void rotate(int[][] matrix) {
		transpose(matrix);
		revCol(matrix);
	}

	private void revCol(int[][] matrix) {
		for (int i =0;i<matrix[0].length; i++){
			for (int j=0, k = matrix[0].length-1;j<k;j++,k--){
				int temp = matrix[j][i];
				matrix[j][i] = matrix[k][i];
				matrix[k][i] = temp;
			}
		}
		
		System.out.println("Rev Col");
		for (int i =0;i<matrix.length; i++){
			for (int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
	}

	private void transpose(int[][] matrix) {
		for (int i =0;i<matrix.length; i++){
			for (int j=i;j<matrix[0].length;j++){
				int temp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
		System.out.println("Transpose");
		for (int i =0;i<matrix.length; i++){
			for (int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private void print(int[][] matrix) {
		System.out.println("Final Output");
		for (int i =0;i<matrix.length; i++){
			for (int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	

	public static void main(String[] args){
		RevMatrix rm = new RevMatrix();
		
		int matrix[][] = {{1,2,3},
				          {4,5,6},
				          {7,8,9}};
		
		System.out.println("Input");
		for (int i =0;i<matrix.length; i++){
			for (int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		rm.rotate(matrix);
		rm.print(matrix);
		}


}
