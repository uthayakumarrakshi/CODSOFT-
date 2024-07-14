import java.util.Scanner;
class Calculater
{
    int  mark,subject;
   
    Scanner sc=new Scanner(System.in);
    int total=0;
    
    public int  getmarks()
    {
        System.out.println("enter the number of the subject");
        subject=sc.nextInt();
        for(int i=1;i<=subject;i++)
        {
            System.out.println("enter your each subject marks");
            mark=sc.nextInt();
            total+=mark;
        }
        return total;
    }
    int avg;
    
    public int average()
    { 
        System.out.println("enter the number of the subject");
        subject=sc.nextInt();
        
           avg=total/subject;
        
        return avg;
    }
    public void getgrade()
    {
        if(avg>=85 && avg<=100)
        {
            System.out.print("your grade is :- A+");
        }
        else if(avg>=80 && avg<85)
        {
            System.out.print("your grade is :- A");

        }
        else if(avg>=75 && avg<80)
        {
            System.out.print("your grade is :- A-");

        }
        else if(avg>=70 && avg<75)
        {
            System.out.print("your grade is :- B+");

        }
        else if(avg>=65 && avg<70)
        {
            System.out.print("your grade is :- B");
        }
        else if(avg>=55 && avg<60)
        {
            System.out.print("your grade is :- B-");
        }
        else if(avg>=45 && avg<55)
        {
            System.out.print("your grade is :- C+");
        }
        else if(avg>=35)
        {
            System.out.print("your grade is :- D+");
        }
        else 
        {
            System.out.print("your grade is :- F");
        }
    }
    
}

class Student extends Calculater
{
    public static void main(String args[])
    {
        System.out.println("------------------ STUDENT GRADE CALCULATION --------------------------");
        Student std=new Student();
        System.out.print("student total marks :-"+std.getmarks()) ;
        System.out.println();
        System.out.print("student marks average is :-"+std.average());
        System.out.println();
        std.getgrade();
        System.out.println();
      System.out.println("-------------------------------------------------------------");

    }
}