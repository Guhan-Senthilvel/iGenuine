import java.util.*;
public class PassScore {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean flag=false;
        System.out.println("Enter your password : ");
        while(flag==false){
            String a=in.nextLine();
            if(a.length()<8){
                System.out.println("Not enough digits");
                flag=false;
            }else if(a.length()>=8){
                boolean fn=false;
                for(int i=0;i<a.length();i++){
                    
                    if(Character.isDigit(a.charAt(i))==true){
                        fn=true;
                        break;
                    }
                }if(fn==false){
                    System.out.println("Password must contain number");
                }

                boolean fa=false;
                for(int i=0;i<a.length();i++){
                    if(Character.isLetter(a.charAt(i))==true){
                        fa=true;
                        break;
                    }
                }if(fa==false){
                    System.out.println("Password must contain alphabets");
                }

                boolean fu=false;
                for(int i=0;i<a.length();i++){
                    if(Character.isUpperCase(a.charAt(i))==true){
                        fu=true;
                        break;
                    }
                }if(fu==false){
                    System.out.println("Password must contain atleast one Capital letter");
                }

                boolean fl=false;
                for(int i=0;i<a.length();i++){
                    if(Character.isLowerCase(a.charAt(i))==true){
                        fl=true;
                        break;
                    }
                }if(fl==false){
                    System.out.println("Password must contain atleast one Small letter");
                }

                boolean fs=false;
                for(int i=0;i<a.length();i++){
                    if(a.charAt(i)=='@' || a.charAt(i)=='#'|| a.charAt(i)=='$'|| a.charAt(i)=='&'){
                        fs=true;
                        break;
                    }
                }if(fs==false){
                    System.out.println("Password must contain special characters: @, #, $, &");
                }
                
                
                if(fn==true && fa==true && fu==true && fl==true && fs==true){
                    System.out.println("Strong Password");
                    flag=true;
                }
            }else{
                System.out.println("Invalid Input");
            }
        }
        in.close();
    }
}
