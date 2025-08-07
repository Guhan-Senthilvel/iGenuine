public class StackJoin {
    private int[] stack;
    private int top;
    private int maxSize;
    public StackJoin(int size){
        stack=new int[size];
        maxSize=size;
        top=-1;
    }
    public int sizeOf(){
        return top+1;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top]=data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return top;
        }
        return stack[top--];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
            
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return top;
        }
        return stack[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top ==  maxSize-1;
    }
    public static void main(String[] args) {
        StackJoin s=new StackJoin(3);
        s.push(2);
        s.push(4);
        s.push(6);
        // s.push(8);
        // s.push(10);
        s.display();
        System.out.println();
        StackJoin s1=new StackJoin(5);
        s1.push(1);
        s1.push(3);
        s1.push(5);
        s1.push(7);
        s1.push(9);
        s1.display();
        System.out.println();
        StackJoin output=new StackJoin(8);
        StackJoin output1=new StackJoin(8);
        
        if(s.sizeOf()>s1.sizeOf()){
            while(s.sizeOf()>s1.sizeOf())
            output.push(s.pop());
        }else{
            while(s.sizeOf()<s1.sizeOf())
            output.push(s1.pop());
        }
        
        while(!s.isEmpty() && !s1.isEmpty()){
            output.push(s.pop());
            output.push(s1.pop());
        }
        
        output.display();

        // System.out.println();
        // while(!output.isEmpty()){
        //     int p1=output.pop();
        //     output1.push(p1); 
        // }

        // output1.display();

    }
}
