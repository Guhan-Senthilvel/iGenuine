package Attendance;
import java.util.Arrays;

public class AttendanceEmployee extends Employee implements Markable{
    private int[] attendanceArray;

    AttendanceEmployee(String name, int id, String department){
        super(name, id, department);
        this.attendanceArray = new int[7];
    }

    @Override
    public void markAttendance(int[] attendanceArray){
        this.attendanceArray = attendanceArray;
    }

    @Override
    public int calculatePresentDays(int[] attendanceArray){
        int present = 0;
        for(int day:attendanceArray){
            if(day==1){
                present++;
            }
        }
        return present;
    }

    public void displayAttendance(){
        System.out.println("Attendance: " + Arrays.toString(attendanceArray));
        int totalPresent = calculatePresentDays(attendanceArray);
        System.out.println("Total Present Days: " + totalPresent);
    }
}