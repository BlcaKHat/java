/* Finding the difference of diagonals in a matrix.........
........................................
..........................................*/

import java.util.Scanner;

public class Matrix_diagonal

{

    public static void main(String[] args) 

    {

        int m, n;
	    

        Scanner s = new Scanner(System.in);

	System.out.print("Enter matrix size:");

        m= n  = s.nextInt(); //size of matrix..
            int a[][] = new int[m][n];
      
            System.out.println("Enter all the elements of first matrix:");

            for (int i = 0; i < m; i++) 

           {

                for (int j = 0; j < n; j++) 

                {

                    a[i][j] = s.nextInt();

                }
          }
        int d1=0 , d2= 0;
        for(int i=0; i<n;i++) {
          d1+=a[i][i];      /*  diagonal first , 0,0,    1,1,  2,2 ......*/
          d2+=a[i][n-i-1];  /*  diagonal first , 3,0,    2,1,  1,0 ......*/
        }

        System.out.println(d1);
        System.out.println(d2);

        int diff = d1-d2;
	//  for(int i=0;i<n;i++)  //printing the array.
	//  {
	// 	for (int j=0;j<m;j++)
	// 	 {
	// 		System.out.print(a[i][j]+" ");
	// 	 }
 //    System.out.println("\n");
	// }


   }
}

