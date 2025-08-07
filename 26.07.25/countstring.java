import java.util.Scanner;
public class countstring {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int count=0;
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                if(!flag){
                flag=true;
                count++;}
            }else{
                flag=false;
            }
        }
        System.out.println(count);

    }
}
