public class StackNew {
private int[] stack;
    private int top;
    private int maxSize;
    public StackNew(int size){
        stack=new int[size];
        maxSize=size;
        top=-1;
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
        StackNew s=new StackNew(5);
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.push(10);
        s.display();
        System.out.println();
        StackNew s1=new StackNew(5);
        s1.push(1);
        s1.push(3);
        s1.push(5);
        s1.push(7);
        s1.push(2);
        s1.display();
        System.out.println();
        StackNew output=new StackNew(10);
        StackNew output1=new StackNew(10);
       
        
        while(!s.isEmpty() && !s1.isEmpty()){
            int v1=s.pop();
            int v2=s1.pop();
            int sum=v1+v2;
            if(sum%2==0){
                output.push(v1);
                output.push(v2);
            }else{
                output.push(v2);
                output.push(v1);
            }
        }
        
        // output.display();

        // System.out.println();

        while(!output.isEmpty()){
            int p1=output.pop();
            output1.push(p1); 
        }

        output1.display();

    }
}

