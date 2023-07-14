class twoStacks
{
    int arr[];
    int size;
    int top1, top2;
    twoStacks()
    {
        size = 100; 
        arr = new int[100]; 
        top1 = -1; 
        top2 = size;
    }
    public static void main(String[] args) {
        twoStacks ob = new twoStacks();
        ob.push1(3);
        ob.push2(4);
        System.out.print(ob.pop1() + " ");
        System.out.print(ob.pop2() + " ");
        System.out.print(ob.pop1());
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
        top1++;
        arr[top1] = x;
        
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
       top2--;
       arr[top2] = x;
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(top1 == -1)
        return -1;
        
        int t = arr[top1];
        arr[top1--] = 0;
        return t;
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(top2 == size)
        return -1;
        
        int t = arr[top2];
        arr[top2++] = 0;
        return t;
    }
}
