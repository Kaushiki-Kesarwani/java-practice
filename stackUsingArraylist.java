import java.util.*;
public class stackUsingArraylist {
    static class Stack{
        ArrayList<Integer>stack = new ArrayList<>();

        public boolean isEmpty(){
           return stack.size() == 0;
        }

        //push
        public void add(int data){
            stack.add(data);
        }

        //pop
        public int remove(){
            if(isEmpty()){
                return -1;
            }
            int top = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return top;
        }

        //peek
        public int peek(){
             if(isEmpty()){
                return -1;
            }
             int top = stack.get(stack.size()-1);
            return top;
        }

    }

    public static void main(String [] args){
       Stack stack = new Stack();
        stack.add(2);
        stack.add(4);
        stack.add(6);
        stack.add(8);
        stack.add(10);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.remove();
         
        }
                   System.out.println(stack.peek());
    }
}
