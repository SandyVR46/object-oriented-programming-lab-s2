import java.util.*;
class College
{
   static class Student
   {
      int i;
      String n;
       Student(int id,String name)
       {
           i = id;
           n = name;
       }
    void display()
    {
        System.out.println("Student Id : "+i); 
        System.out.println("Student Name : "+n); 
    }

   }
   class Staff
   {
       int i;
       String n;
       Staff(int id,String name)
       {
           i = id;
           n = name;
       }
    void display()
    {
        System.out.println("Staff Id : "+i); 
        System.out.println("Staff Name : "+n); 
    }
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter Id of Student : ");
      int id = in.nextInt();
      System.out.println("Enter the name of Student : ");
      String name = in.next();
      College.Student stud = new College.Student(id,name);
       System.out.println("Enter Id of Staff : ");
      int sid = in.nextInt();
      System.out.println("Enter the name of Staff : ");
      String sname = in.next();
      College c = new College();
      College.Staff st =c.new Staff(sid,sname);
      stud.display();
      st.display();

   }

}