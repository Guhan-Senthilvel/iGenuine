public class anagram {
    public static void main(String[] args){
        String s1="silent";
        String s2="listen";
        boolean isflag=true;
        for(int i=0;i<s1.length();i++){
            if(isflag==true){
                for(int j=0;j<s2.length();j++){
                    if(s1.charAt(i)==s2.charAt(j)){
                        isflag=true;
                        break;
                    }else{
                        isflag=false;
                    }
                }
            }else{
                break;
            }
        }
        if(isflag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
