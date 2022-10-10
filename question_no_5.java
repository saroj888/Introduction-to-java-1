class employee
{
    private String firstname,lastname,designation;
    private int age;

    public employee()
    {
    }

    public employee(String fname,String lname,int ag,String desig)
    {
        this.firstname = fname;
        this.lastname = lname;
        this.age = ag;
        this.designation = desig;
    }

    public employee(employee emp)
    {
        this.firstname = emp.firstname;
        this.lastname = emp.lastname;
        this.age = emp.age;
        this.designation = emp.designation;
    }

    public String getFirstName()
    {
        return firstname;
    }

    public String getLastName()
    {
        return lastname;
    }

    public int getAge()
    {
        return age;
    }
    public String getDesignation()
    {
        return designation;
    }

    public void setFirstName(String fname)
    {
        firstname = fname;
    }

    public void setLastName(String lname)
    {
        lastname = lname;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setDesignation(String design)
    {
        designation = design;
    }

    public String toString()
    {
        return firstname + " " + lastname + " " + age + " " + designation;
    }
}

public class question_no_5
{
    public static void main(String args[])
    {
        employee emp = new employee();
        System.out.println(emp.toString());
        emp = new employee("Saroj","Gope",22,"QE");
        System.out.println(emp.toString());
        employee emp1 = new employee(emp);
        System.out.println(emp1.toString());
    
    }
}
