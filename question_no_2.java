import java.util.Scanner;
public class question_no_2 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a = "";
        StringBuilder str = new StringBuilder();
        while(true)
        {
            a = sc.next();
            if(a.equals("XDONE"))
            break;
            else{
                str.append(a + " ");
            }
        }
        System.out.println(str);
    }
}
