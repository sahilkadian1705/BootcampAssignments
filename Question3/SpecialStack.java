package Question3;
import  java.util.*;
public  class SpecialStack {
    int minEle;
    Stack<Integer> s = new Stack<>();

    int getMin()
    {
        if(s.isEmpty())
            return -1;
        return minEle;
    }

    int pop()
    {
        if(s.isEmpty())
            return -1;
        else if(s.peek()>=minEle)
            return s.pop();
        else{
            int ans=minEle;
            minEle=2*minEle-s.peek();
            s.pop();
            return ans;
        }
    }

    void push(int x)
    {
        if(s.isEmpty()){
            s.push(x);
            minEle=x;
        }
        else if(x<=minEle){
            s.push(2*x-minEle);
            minEle=x;
        }
        else
            s.push(x);
    }

    int size(){
        return s.size();
    }

    public static void main(String[] args){
        SpecialStack s=new SpecialStack();
        s.push(2);
        s.push(4);
        s.push(7);
        s.push(1);
        s.push(9);
        s.push(5);
        s.push(8);
        int n=s.size();
        for(int i=0;i<n;i++){
            System.out.println("Popped Element :"+s.pop());
            System.out.println("Current minimum element :"+s.getMin());
        }
    }
}