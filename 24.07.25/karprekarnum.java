import java.util.*;
public class karprekarnum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int m=a*a,sq=m,count=0,res=0;
        while(m>0){
            count++;
            m/=10;
        }
        for(int i=1;i<count;i++){
        int mu=(int)Math.pow(10,i);
        int q=sq/mu,w=sq%mu;
        res=q+w;
        if(mu==a){
            System.out.println("Not a kaprekar number");
            return;
        }
        if (res==a) {
            System.out.println("kaprekar number");
            return;
        }}
        System.out.println("Not a kaprekar number");
    }
}