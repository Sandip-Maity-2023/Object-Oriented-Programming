import java.util.Scanner;

public class string_multiplication {
    public static void main(String args[]){
    Scanner x=new Scanner(System.in);
    System.out.println("1st matrix");
    System.out.println("Enter row:");
    int r=x.nextInt();
    System.out.println("Enter column:");
    int c=x.nextInt();

    System.out.println("2st matrix");
    System.out.println("Enter row:");
    int r1=x.nextInt();
    System.out.println("Enter column:");
    int c1=x.nextInt();
    int matrix1[][]=new int[r][c];                          
    int matrix2[][]=new int[r1][c1];
    // int matrix3[][]=new int[matrix1.length][matrix2[0].length];
    int matrix3[][] = new int[r][c1];
    if(c==r1){
    System.out.println("Enter elements of 1st matrix:");
             for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
    matrix1[i][j]=x.nextInt();
                }
            }

            System.out.println("Enter elements of 2nd matrix:");
             for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
    matrix2[i][j]=x.nextInt();
                }
            }
            
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print(matrix1[i][j]+" ");
                }
                System.out.println();
            }
    System.out.println(" ");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    System.out.print(matrix2[i][j]+" ");
                }
                System.out.println();
            
            }

        for(int i=0;i<r;i++){
            for(int j=0;j<c1;j++){
                matrix3[i][j]=0;
                for(int k=0;k<c;k++){
                matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
            }
        }
    }
    System.out.println("Result");
for(int i=0;i<r;i++){
    for(int j=0;j<c1;j++){
System.out.print(matrix3[i][j]+" ");
    }
    System.out.println();
}

}
}
}