public class nonrepeating {
    public static void main(String[] args) {
        String str="AAythokeeni";
        boolean flag=true;
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){
                flag=false;
                break;
            }else{
                flag=true;
            }
        }
        if(flag==true){
            System.out.println(str.charAt(i));
            break;
        }
    }
    }
}
