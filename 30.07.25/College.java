public class College {
    static int startingCode=7200;
    int code;
    String dept;
    String collegeName;
    College(String dept,String collegeName){
        this.dept = dept;
        this.collegeName=collegeName;
        this.code=startingCode++;

    }
    void display(){
        //displayCollege
        System.out.println("Dept : "+dept);
        System.out.println("College : "+collegeName);
        System.out.println("College code : "+code);

    }

}
class Student extends College{
    static int startingRegNum=1000;
    String name;
    int regNo;
    String mailId;
    Student(String name,String mailId,String dept,String collegeName){
        super(dept, collegeName);  
        this.regNo=startingRegNum++;
        this.name = name;
        this.mailId = mailId;    
    }
    void display(){
        //displayStudent
        System.out.println("Name : "+name);
        System.out.println("Reg Number : "+regNo);
        System.out.println("Email : "+mailId);
        super.display();
    }
    
}
class Database{
    public static void main(String[] args) {
        Student s1=new Student("Giri","kumargiri@gmail.com","CSE","HICET");
        // Student s2=new Student("Naveen","nvnrio@gmail.com","CSE","HICET");
        // Student s3=new Student("Logaysl","logu@gmail.com","IT","HICET");
        // s1.displayStudent();
        // s2.displayStudent();
        // s3.displayStudent();
        //Student s1= new College("CSE", "HICET");
        College c1= new College("IT", "HIT");
        College c2= new Student("Gir", "jhbvub@fh.com", "CSE", "HICET");
        s1.display();
        c1.display();
        c2.display();

    }
}
