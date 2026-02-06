public class LL {

    Node head;
    private int size;
  public class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
        
    }
   } 

   public void insertFirst(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    size++;
    return;
   }

   public void traverse(){
    if(head==null){
      System.out.println("list is empty");
      return;
    }

    Node currNode = head;
    while(currNode!=null){
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
   }
   System.out.print("null\n");

   }

   public void insertbetween(int idx , int data ){
 

       if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }

        Node node = new Node(data); 

        if(idx==0){
          node.next = head;
          head = node;
          size++;
          return;
        }

        Node currnode = head;
        for(int i=0;i<idx-1;i++){
          currnode = currnode.next;
        }
        node.next = currnode.next;
        currnode.next = node;
        size++;

    }

   

   public static void main(String[] args) {
    LL list = new LL();
    list.insertFirst(6);
    list.insertFirst(5);
    list.insertFirst(3);
    list.insertFirst(2);
    list.insertFirst(1);
    list.traverse();
    list.insertbetween(3,4);
    list.traverse();
   }

}
