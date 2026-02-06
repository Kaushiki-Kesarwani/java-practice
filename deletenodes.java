import java.util.*;
public class deletenodes {
    public static void main(String args[]){
        LinkedList<Integer>list = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers:");

        while(true){
            int num = sc.nextInt();
            if(num==-1){
                break;
            }
            list.add(num);
        }
        
       
        Iterator<Integer>it = list.iterator();
        while(it.hasNext()){
            if(it.next()>25){
                it.remove();
            }
        }

System.out.println(list);
    }
}
