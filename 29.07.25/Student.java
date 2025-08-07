public class Student {
    static int startingRegNum=1000;
    String name;
    int regNo;
    String dept;
    String mailId;
    Student(String name,String dept,String mailId){
        regNo=startingRegNum++;
        this.name = name;
        this.dept = dept;
        this.mailId = mailId;
    }
    void print(){
        System.out.println("Reg Number : "+regNo);
        System.out.println("Name : "+name);
        System.out.println("Dept : "+dept);
        System.out.println("Email : "+mailId);
    }
}
class Database{
    public static void main(String[] args) {
        Student s1=new Student("Giri","CSE","kumargiri@gmail.com");
        Student s2=new Student("Naveen","CSE","nvnrio@gmail.com");
        Student s3=new Student("Logaysl","IT","logu@gmail.com");
        s1.print();
        s2.print();
        s3.print();

    }
}
