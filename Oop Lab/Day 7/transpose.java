import java.util.Scanner;;

public class transpose {
    public static void main(String args[]){
Scanner x=new Scanner(System.in);
System.out.println("Enter row:");
int r=x.nextInt();
System.out.println("Enter column:");
int c=x.nextInt();
int matrix[][]=new int[r][c];
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
matrix[i][j]=x.nextInt();
            }
        }
        int[][] transpose=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
System.out.println(" ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}