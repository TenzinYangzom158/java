import java.io.*;
import java.util.*;
class Person
{

    String name,address;
    int age;
    Person()
    {
        age=0;
    }
    

    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter Name : ");
        this.name=sc.nextLine();
        System.out.print(" Enter Age : ");
        this.age=sc.nextInt();sc.nextLine();
        System.out.print(" Enter the Address : ");
        this.address=sc.nextLine();
        
    }
     void show()
    {
        
        System.out.println(" Name : "+this.name);
        System.out.println(" Age : "+this.age);
        System.out.println(" Address : "+this.address);
        
    }

}
class Employee extends Person{
    int emp_id;
    String c_name;
    String dep,desig;

    Employee(int id)
    {
        super();
        this.emp_id=id;
    }

    void read()
    {
        super.read();
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the Company Name : ");
        this.c_name=sc.nextLine();
        System.out.print(" Enter the name of the Department : ");
        this.dep=sc.nextLine();
        System.out.print(" Enter the Designation : ");
        this.desig=sc.nextLine();
       

    }
    void display()
    {
        super.show();
         System.out.println(" employee Id : "+this.emp_id);
        System.out.println(" Company Name : "+this.c_name);
        System.out.println(" Department  : "+this.dep);
        System.out.println(" Designation : "+this.desig);

    }

}
class Emp_salary extends Employee
{
    float basic,g_sal,n_sal,deduction;
    float pf,it,da,hra;
    static int id=2147150;
    Emp_salary()
    {   
        
        super(id++);
        pf=0;
        it=0;
        da=0;
        hra=0;
        basic=0;
        g_sal=0;
        n_sal=0;
        deduction=0;
    }

    void read()
    {
        super.read();
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the basic salary : ");
        this.basic=sc.nextFloat();
        
    }
    void net_salary()
    {
        super.display();
        hra = basic * 0.1f;
        da = basic * 0.16f;
        it = basic * 0.06f;
        pf=basic*0.08f;
        deduction=pf+it;
        g_sal = basic + hra + da  ;
        n_sal=g_sal-deduction;
        System.out.println(" Gross Salary : "+g_sal);
        System.out.println(" Deduction : "+deduction);
        System.out.println(" NEt Salary : "+n_sal);
    }

}




public class CAT1
{

    
    public static void main(String args[])
    {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the number of employees");
        n=sc.nextInt();
        sc.nextLine();
        Emp_salary emp[]=new Emp_salary[30];
        for (int i=0;i<n;i++)
        {
            emp[i]=new Emp_salary();
            emp[i].read();
             emp[i].net_salary();
        }
         
         float h_salary=emp[0].n_sal;
         int pos=0;
         for(int i=0;i<n;i++)
         {
             if(emp[i].n_sal>h_salary)
             {
                 h_salary=emp[i].n_sal;
                 pos=i;
             }
         }
        System.out.println(" \n\n Highest Paid Employee : ");
        emp[pos].net_salary();
        float l_salary=emp[0].n_sal;
        pos=0;
         for(int i=0;i<n;i++)
         {
             if(emp[i].n_sal<l_salary)
             {
                 l_salary=emp[i].n_sal;
                 pos=i;
             }
         }
        System.out.println(" \n\n Lowest Paid Employee : ");
        emp[pos].net_salary();
    }
}
