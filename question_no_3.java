import java.util.Scanner;
class question_no_3
{

    static double area(int radius)
    {
        return 3.14*(radius*radius);
    }

    static double circumference(int radius)
    {
        return 2*(3.14*radius);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius :");
        int radius = sc.nextInt();
        System.out.println("***********  Menu ***********");
        System.out.println("1 . Calculate Area of Circle");
        System.out.println("2 . Calculate Circumference of a Circle");
        System.out.println("3 . Exit");
        int option = sc.nextInt();
        
        switch(option)
        {
            case 1:double result = area(radius);
            System.out.println("The area is :" + result);
            break;

            case 2:double result1 = circumference(radius);
            System.out.println("The circumference is :" + result1);
            break;

            case 3:break;
        }
    }
}