import java.util.Scanner;
import java.io.*;
class question_no_4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the Columns");
        int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];
        System.out.println("Enter the values: ");

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++)
        {
            int rows_sum = 0;
            for(int j=0;j<columns;j++)
            {
                rows_sum = rows_sum + arr[i][j];
            }
            System.out.println((i+1) + " Rows Sum is :" + rows_sum); 
        }


        for(int j=0;j<columns;j++)
        {
            int columns_sum = 0;
            for(int i=0;i<rows;i++)
            {
                columns_sum = columns_sum + arr[i][j];
            }
            System.out.println((j+1) + " Columns Sum is :" + columns_sum); 
        }
    }
}