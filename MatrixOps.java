public class MatrixOps
{

public static double[][] multiply(double[][] A, double[][] B)
	{
	int count = 0;	
	if(A.length != B[0].length) // to check if matA has the same number of row as the columns of matB
		{
			return null;
		}
		double[][] prod = new double[A.length][B[0].length];
		double ans = 0;
		
		for(int i = 0; i<A.length; i++)
		{
			
			for(int j = 0; j<B[i].length; j++)
			{
				ans = ans + (A[i][j] * B[j][i]);
				prod[i][count] = ans;
				
				for (int k = 0; k < A[0].length; k++)
				{ // aColumn
                    prod[i][j] += A[i][k] * B[k][j];
                }

			}
			count++;
			ans = 0;
		}
		return prod;
	}
}
