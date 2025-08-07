//Aggregation

public class Department {
    private String departmentname;

    public Department(String departmentname) {
        this.departmentname=departmentname;
    }

    public void displayDepartment(){
        System.out.println("Department name : "+departmentname);
    }
}

class Student{
    private String name;
    private int rollNo;
    private Department department;

    public Student(String name,int rollNo, Department department) {
        this.name=name;
        this.rollNo=rollNo;
        this.department=department;
    }

    public void displayStudent(){
        System.out.println("Student name : "+name);
        System.out.println("Student rollno : "+rollNo);
    }

 public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void display(){
        displayStudent();
        department.getDepartment().displayDepartment();
    }

   
}

class Maine{
    public static void main(String[] args) {
        Department d1=new Department("CSE");
        Department d2=new Department("IT");
        Student s1=new Student("Guhan", 101,d1);
        Student s2=new Student("Giri", 102,d2);
        s1.display();
        s2.display();

    }
}
