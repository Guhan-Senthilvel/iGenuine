import java.util.*;
public class stringcnt {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int count=0;
        for(int i=0;i<sb.length();i++){
            for(int j=i;j<sb.length();j++){
                if(sb.charAt(i)==sb.charAt(j)){
                    count++;
                    if(count>1){
                        sb.deleteCharAt(j);
                        j--;
                    }
                }
            }
            System.out.println(sb.charAt(i)+" - "+count);
            count=0;
        }
        in.close();
    }
}
