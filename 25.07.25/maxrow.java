public class maxrow {
     public static void main(String[] args) {
        int a[][]={{1,2,3},{7,8,9},{5,8,9}};
        int max=0;
        int ans=-1;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j]; 
            }
            if(sum>max){
                max=sum;
                ans=i;
            } 
        }
        System.out.println(ans);
    }
}
