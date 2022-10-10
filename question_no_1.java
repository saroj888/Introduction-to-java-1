public class question_no_1 
{
    static String firstname = "Saroj";
    static String lastname = "Gope";
    static int age = 22;

    private static void function()
    {
        System.out.println("Static Method:");
    }

    static{
        System.out.println("Static Block:");
    }

    public static void main(String args[])
    {
        System.out.println("Main Method");
        System.out.println(firstname + " " + lastname + " " + age);           
        function();
        
    }
} 