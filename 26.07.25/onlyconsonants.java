public class onlyconsonants {
    public static void main(String[] args) {
        String s="staticaey";
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u'){
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);

        //using indexof
        
        String str="Aeythokeeni";
        String res="";
        for(char ch: str.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)==-1){
                res+=ch;
            }
        }
        System.out.println(res);
    }
}
