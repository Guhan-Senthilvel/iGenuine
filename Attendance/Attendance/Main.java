package Attendance;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Helper.printInstructions();
        AttendanceEmployee[] employees = new AttendanceEmployee[4];

        for(int i=0;i<employees.length;i++){
            System.out.println("\nEnter details for Employee " + (i+1) + ":");
            System.out.print("Enter Name : ");
            String name=in.nextLine();
            
            System.out.print("Enter ID : ");
            int id = in.nextInt();
            in.nextLine();
            System.out.print("Enter Department : ");
            String department = in.nextLine();
            employees[i] = new AttendanceEmployee(name, id, department);
            System.out.println("Enter Attendance (7 values of 0/1):");
            int[] attendance = new int[7];
            for(int j=0;j<7;j++){
                attendance[j] = in.nextInt();
            }
            employees[i].markAttendance(attendance);
            in.nextLine();
        }
        System.out.println("\n--- Attendance Records ---");
        
        for(AttendanceEmployee emp : employees) {
            System.out.println();
            emp.showDetails();
            emp.displayAttendance();
        }
        System.out.println("\n--------------------------");
        
        Employee.showEmployeeCount();
        in.close();
    }
}