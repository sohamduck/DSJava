public class Queue {
    public static void main(String args[]){
        Qu q=new Qu();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        System.out.println();
        q.disp();
        System.out.println();
        q.pop();
        System.out.println();
        q.disp();
        System.out.println();
        q.pop();
        System.out.println();
        q.disp();
    }
}
class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class Qu{
    Node head;
    Node last;
    int count;
    Qu(){
        head=null;
        last=null;
        count=0;
    }
    void push(int data){
        Node node=new Node(data);
        System.out.println("Inserting "+data);
        count+=1;
        if(head==null){
            head=node;
            last=node;
        }
        else{
            last.next=node;
            last=node;
        }
    }
    void pop(){
        if(head==null){
            System.out.println("Cant delete as empty\n");
            return;
        }
        else{
            System.out.println("Deleting "+head.data);
            count-=1;
            head=head.next;
        }
    }
    void disp(){
        Node trav=head;
        System.out.println("Displaying contents:");
        if(trav!=null){
            while(trav!=null){
                System.out.println(trav.data+","+trav.next);
                trav=trav.next;
            }
        }
        else{
            System.out.println("Empty Queue");
        }
    }
}