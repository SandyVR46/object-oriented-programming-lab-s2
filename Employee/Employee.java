import java.util.Scanner;
 
public class Employee
{
 
public String name;
private int id;
public long mob;
public String designation;
public String department;
 
public Employee (String stuName) {
    name = stuName;
}
public void setID(int stuID) {
    id = stuID;
}
 
public void setMob(long stuMob) {
    mob = stuMob;
}

public void setDes(String stuDes) {
    designation = stuDes;
}

public void setDep(String stuDep) {
    department = stuDep;
}

public void printStu() {
    System.out.println("Name: " + name );
    System.out.println("ID : " + id);
    System.out.println("Mobile : " + mob);
    System.out.println("Designation : " + designation);
    System.out.println("Department : " + department);
}
 
public static void main(String args[]) {
    Employee StuOne = new Employee("Ross");
    StuOne.setID(1);
    StuOne.setMob(9993335566l);
    StuOne.setDes("Manager");
    StuOne.setDep("Development");
    StuOne.printStu();

}
}