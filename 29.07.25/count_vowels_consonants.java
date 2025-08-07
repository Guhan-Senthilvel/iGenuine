import java.util.Scanner;
public class count_vowels_consonants {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int c=0,v=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') v++;
                else c++;
            }
        }
        System.out.println("Consonants : " + c);
        System.out.println("Vowels : " + v);
    }
}
