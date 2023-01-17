public class Stack {
    public static void main(String args[]){
        Sta s=new Sta();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println();
        s.disp();
        System.out.println();
        s.pop();
        System.out.println();
        s.disp();
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

class Sta{
    Node head;
    int count;

    Sta(){
        head=null;
        count=0;
    }

    void push(int data){
        Node node=new Node(data);
        System.out.println("Insering:"+data);
        node.next=head;
        head=node;
        count+=1;
    }

    boolean isempty(Node node){
        return node==null;
    }

    void pop(){
        if(!isempty(head)){
            System.out.println("Deleting "+head.data);
            head=head.next;
            count-=1;
        }
        else{
            System.out.println("Stack empty");
        }
    }

    void disp(){
        System.out.println("Displaying");
        Node trav=head;
        if(!isempty(trav)){
            while(!isempty(trav)){
                System.out.println(trav.data+","+trav.next);
                trav=trav.next;
            }
        }
        else{
            System.out.println("Stack empty");
        }
    }
}