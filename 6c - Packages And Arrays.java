class main{
	public static void main(String[] arg){
		int[][] a = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		int[][] b = {
			{9, 8, 7},
			{6, 5, 4},
			{3, 2, 1}
		};
		
		int[][] c = new int[3][3];
		
		int i, j, k, l, sum = 0;
		
		for(i=0;i<3;i++)
			for(j=0;j<3;j++){
				for(k=0;k<3;k++)
					sum += a[i][k] * b[k][j];
				
				c[i][j] = sum;
				sum = 0;
			}
		
		System.out.println("Matrix A + Matrix B = Matrix C\n\n");
		
		for(i=0;i<3;i++){
			for(j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
			System.out.print("\t");
			for(k=0;k<3;k++)
				System.out.print(b[i][k]+" ");
			System.out.print("\t");
			for(l=0;l<3;l++)
				System.out.print(c[i][l]+" ");
			System.out.println("");
		}
	}
}