import java.util.Scanner;
class MaxNum{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        if(a==b && b==c && c==d){
            System.out.print("All are equal");
        }else if(a==b && a==c && a>d){
            System.out.print("A, B and C are larger");
        }else if(a==b && a==d && a>c){
            System.out.print("A, B and D are larger");
        }else if(b==c && b==d && b>a){
            System.out.print("B, C and D are larger");
        }else if(a==b && a>c && a>d){
            System.out.print("A and B are larger");
        }else if(a==c && a>b && a>d) {
            System.out.print("A and C are larger");
        }else if(a==d && a>b && a>c){
            System.out.print("A and D are larger");
        }else if(b==c && b>d && b>a){
            System.out.print("B and C are larger");
        }else if(b==d && b>c && b>a){
            System.out.print("B and D are larger");
        }else if(d==c && d>a && d>b){
            System.out.print("C and D are larger");
        }else if(a>b && a>c && a>d){
            System.out.print("A is largest");
        }else if(b>c && b>d){
            System.out.print("B is largest");
        }else if(c>d){
            System.out.print("C is largest");
        }else{
            System.out.print("D is largest");
        }
        in.close();
    }
}