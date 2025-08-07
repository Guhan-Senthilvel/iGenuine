public class countzerobyrec {
    public static void main(String[] args) {
        int n=103200105;
        System.out.print(count(n));
    }
    public static int count(int n){
        if(n==0) return 0;
        int rem=n%10;
        if(rem==0) return 1 + count(n/10);
        else return count(n/10);
    }
}

