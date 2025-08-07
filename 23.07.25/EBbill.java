import java.util.*;
class EBbill{
    void domestic(int unit){
        if(unit<=100){
            System.out.println("No charge: Rs.0/-");
        }else if(unit>100 && unit<=200){
            System.out.println("Charge: Rs. "+(unit*5)+"/-");
        }else if(unit>200 && unit<=300){
            System.out.println("Charge: Rs. "+(unit*10)+"/-");
        }else if(unit>300 && unit<=400){
            System.out.println("Charge: Rs. "+(unit*15)+"/-");
        }else if(unit>400 && unit<=500){
            System.out.println("Charge: Rs. "+(unit*20)+"/-");
        }else{
            System.out.println("Charge: Rs. "+(unit*25)+"/-");
        }
    }
    void commercial(int unit){
        if(unit<=100){
            System.out.println("Charge: Rs. "+(unit*10)+"/-");
        }else if(unit>100 && unit<=200){
            System.out.println("Charge: Rs. "+(unit*20)+"/-");
        }else if(unit>200 && unit<=300){
            System.out.println("Charge: Rs. "+(unit*30)+"/-");
        }else if(unit>300 && unit<=400){
            System.out.println("Charge: Rs. "+(unit*40)+"/-");
        }else if(unit>400 && unit<=500){
            System.out.println("Charge: Rs. "+(unit*50)+"/-");
        }else{
            System.out.println("Charge: Rs. "+(unit*60)+"/-");
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        EBbill obj=new EBbill();
        System.out.println("Enter your type : \n1)Domestic\n2)Commercial");
        int n=in.nextInt();
        in.nextLine();
        System.out.println("Enter your name : ");
        String name=in.nextLine();
        System.out.println("Enter your EB number : ");
        int num=in.nextInt();
        System.out.println("Enter your unit : ");
        int unit=in.nextInt();
        if(n==1){
            obj.domestic(unit);
        }else if(n==2){
            obj.commercial(unit);
        }else{
            System.out.print("Invalid Input");
        }
        in.close();
    }
}