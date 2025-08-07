package Attendance;

class Employee extends Person{
    private String department;
    static int employeeCount=0;
    
    public Employee(String name, int id, String department) {
        super(name, id);
        this.department = department;
        employeeCount++;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    static void showEmployeeCount(){
        System.out.println("Total Employee Count : "+employeeCount);
    }

    @Override
    void showDetails() {
        System.out.println("Employee Details : ");
        System.out.println("Employee name : "+getName());
        System.out.println("Employee Id : "+getId());
        System.out.println("Department : "+getDepartment());
        
    } 
}
