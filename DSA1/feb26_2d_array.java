import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int rows = 2;
		int colums = 2;
		// int n =5;
		// int arr[] = new int[n];
		int matrix[][] = new int[rows][colums];

		// read input as 2D array
		for(int i=0;i<rows;i++){
			for(int j=0;j<colums;j++){
				matrix[i][j] = sc.nextInt();
			}
		} 

		//deter
		int ans = (matrix[0][0] *matrix[1][1]) - (matrix[0][1]*matrix[1][0]);
		System.out.println(ans);
		
	}
}



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		while(testcases>0){
			testcases--;

			int rows = sc.nextInt();
			int columns = sc.nextInt();

			int arr[][] = new int[rows][columns];
				// store input into arr
			for(int i=0;i<rows;i++){
				for(int j=0;j<columns;j++){
					arr[i][j] = sc.nextInt();
				}
			}



			if(rows==1){
				for(int i=0;i<columns;i++){
					System.out.print(arr[0][i]+" ");
				}
			}else if(columns==1){
				for(int i=0;i<rows;i++){
					System.out.print(arr[i][0]+" ");
				}
			}else{
			// top row or frist row -> -> -> 
			for(int i=0;i<columns;i++){
				System.out.print(arr[0][i]+" ");
			}
			
			// last column -> increasing rows
			for(int i=1;i<rows-1;i++){
				System.out.print(arr[i][columns-1]+" ");
			}

			// print array in reverse order
			// last row <- <- <- <-
			for(int i=columns-1;i>=0;i--){
				System.out.print(arr[rows-1][i]+" ");
			}
			// first columns
			for(int i=rows-2;i>=1;i--){
				System.out.print(arr[i][0]+" ");
			}
			}
			System.out.println();



		}
	}
}



class Main{
    public static void main(String args[]){
        int a[] = {10, 12, 14, 16};
        int b[] = {20, 22, 24, 26};
        int c[] = {30, 32, 34, 36};

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();

        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println("\n--------------");

        // int arr[][] = {a, b, c};
        int arr[][] = {{10, 12, 14, 16}, {20, 22, 24, 26}, {30, 32, 34, 36}};
        // int rows = arr.length;
        // int colums = arr[0].le;
        
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
        // for each loop
        for(int tempArr[]:arr){
            for(int i:tempArr){
                System.out.print(i+ "-");
            }
            System.out.println();
        }

        // // for each loop
        // int tempArr2[] = {10, 20, 30, 40};
        // // //for loop
        // // for(int i=0;i<tempArr2.length;i++){
        // //     System.out.println(tempArr2[i]);
        // // }
        // enhanced for loop
        for(int i:tempArr2){
            System.out.println(i);
        }
        // System.out.println(arr[2][3]);
        


    }
}

