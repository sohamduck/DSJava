public class SingularLL {
    public static void main(String args[]){
        LL l=new LL();
        l.push(0);
        l.push(1);
        l.push(2);
        l.push(3);
        System.out.println();
        l.disp();
        l.insert(4,2);
        System.out.println();
        l.disp();
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

class LL{
    Node head;
    LL(){
        head=null;
    }

    void push(int data){
        Node node=new Node(data);
        System.out.println("Inserting "+data);
        node.next=head;
        head=node;
    }

    void insert(int data,int pos){
        Node trav=head;
        for(int i=0;i<pos;++i){
            trav=trav.next;
            if(trav==null){
                System.out.println("Cant enter at location "+pos);
                break;
            }
        }
        System.out.println("Entering "+data+" at position "+pos);
        Node node=new Node(data);
        node.data=data;
        node.next=trav.next;
        trav.next=node;
    }
    void disp(){
        Node trav=head;
        System.out.println("Displaying");
        if(trav!=null){
            while(trav!=null){
                System.out.println(trav.data+","+trav.next);
                trav=trav.next;
            }
        }
        else{
            System.out.println("LL empty");
        }
    }
}