import java.util.Scanner;

public class Queue {
    private int[] queue;
    private int front,rear,maxSize;

    public Queue(int maxSize){
        this.maxSize=maxSize;
        queue=new int[maxSize];
        rear=-1;
        front=-1;

    }
    public boolean isFull(){
        return rear==maxSize-1;
    }
    public boolean isEmpty(){
        return front==-1 && rear==-1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if(front==-1){
            front=0;
        }
        queue[++rear]=data;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int value=queue[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }else{
            front++;
        }
        return value;
    }
    public int sizeOf() {
        return rear + 1;
    }
    public int poll(){
        return dequeue();
    }
    public int element(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Queue in=new Queue(5);
       
        for(int i=0;i<5;i++){
            int input=s.nextInt();
            in.enqueue(input);
        }
        in.display();
        Queue in1=new Queue(5);
        for(int i=0;i<5;i++){
            int input=s.nextInt();
            in1.enqueue(input);
        }
        in1.display();
        int k=s.nextInt();

        Queue res=new Queue(in.sizeOf()+in1.sizeOf());
        // checkprime
        // while(!in.isEmpty() && !in1.isEmpty()){
        //     int sum=in.dequeue()+in1.dequeue();
        //     int count=0;
        //     if(sum==0 || sum==1){
        //         count++;
        //     }
        //     for(int i=2;i<Math.sqrt(sum);i++){
        //         if(sum%i==0){
        //             count++;
        //         }
        //     }
        //     if(count==0){
        //         res.enqueue(sum);
        //     }
        // }

        //checkEvenorOdd
        // while(!in.isEmpty() || !in1.isEmpty()){
        //     if(!in.isEmpty() && !in1.isEmpty()){
        //         int temp=in.dequeue();
        //         if(temp%2==0){
        //             res.enqueue(temp+in1.dequeue());
        //         }else{
        //             res.enqueue(temp-in1.dequeue());
        //         }
        //     }if(in.isEmpty() && !in1.isEmpty()){
        //         res.enqueue(in1.dequeue());
        //     }if(!in.isEmpty() && in1.isEmpty()){
        //         res.enqueue(in.dequeue());
        //     }
        // }

        //twosum
        while(!in.isEmpty() && !in1.isEmpty()){
            int v1=in.dequeue();
            int v2=in1.dequeue();
            if(v1+v2==k){
                res.enqueue(v1);
                res.enqueue(v2);
            }
        }
        res.display();
    }
}
