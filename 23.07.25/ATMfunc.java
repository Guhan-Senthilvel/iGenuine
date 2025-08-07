import java.util.*;
public class ATMfunc {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Insert your card :\n1)Yes\n2)No");
        int n=in.nextInt();
        int balance=10000;
        if(n==1){
            System.out.println("Enter your pin : ");
            int pin=2000;
            boolean ver=false;
            for(int i=2;i>=0;i--){
                int p=in.nextInt();
                if(pin==p){
                    ver=true;
                    System.out.println("Pin is verified");
                    break;
                }else{
                    System.out.println("Wrong pin. Attemps left : "+i);
                }
            }
            if(ver==true){
                boolean flag=false;
                while(flag==false){
                    
                    System.out.println("1)Balance\n2)Withdraw\n3)Deposit\n4)Pin Change\n5)Exit");
                    int a=in.nextInt();
                    if(a==1){
                        System.out.println("Your balance is Rs. "+balance+"/-");
                    }else if(a==2){
                        System.out.println("Enter your withdrawl amount : ");
                        int w=in.nextInt();
                        if(w>balance){
                            System.out.println("Low Balance");
                        }else{
                            balance-=w;
                            System.out.println("Rs. "+w+" is debited");
                        }
                    }else if(a==3){
                        System.out.println("Enter your deposit amount : ");
                        int d=in.nextInt();
                        if(d>50000){
                            System.out.println("Deposit Limit Exceeded");
                        }else{
                            balance+=d;
                            System.out.println("Rs. "+d+" is credited");
                        }
                    }else if(a==4){
                        System.out.println("Enter your pin : ");
                        int t=in.nextInt();
                        if(pin==t){
                            System.out.println("Enter your new pin : ");
                            int z=in.nextInt();
                            pin=z;
                        }else{
                            System.out.println("Wrong Pin. Try Again");
                        }
                    }else if(a==5){
                        System.out.println("Thank You. Visit Again");
                        flag=true;
                    }else{
                        System.out.println("Invalid Input");
                    }
                }
            }else{
                System.out.println("Your card is blocked");
            }   
        }else{
            System.out.println("Thank You");
        } 
        in.close();
    }
}
