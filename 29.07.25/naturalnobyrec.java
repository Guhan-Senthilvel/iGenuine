class naturalnobyrec{
    
    static int i=1;
    public static void series(int num){
        if(num<1){ 
            return;
        }
        System.out.println(i);
        i++;
        series(num-1);   
    }
    public static void main(String[] args) {
        int num=5;
        series(num);
    }
}