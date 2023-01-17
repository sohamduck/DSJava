class CircularLL {
	public static void main(String args[]) {
		CirLL cl=new CirLL();
		cl.push(4);
		cl.push(3);
		cl.push(2);
		cl.push(1);
		System.out.println();
		cl.disp();
		System.out.println();
		cl.pop(1);
		cl.pop(4);
		cl.pop(5);
		System.out.println();
		cl.disp();
	}
}
class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}
}

class CirLL {
	Node last;
	Node head;
	int count;

	CirLL() {
		last = null;
		head = null;
		count = 0;
	}

	void pop(int data){
		Node trav=last;
		int i;
		if(count==0){
			System.out.println("Empty List");
			return;
		}
		for(i=0;i<count;++i){
			if(trav.next.data==data){
				System.out.println("Deleting "+data);
				count-=1;
				if(trav.next!=last){
					trav.next=trav.next.next;
					//trav.next.next=null;
				}
				else{
					trav.next=last.next;
					last=trav;
				}
				return;
			}
			trav=trav.next;
		}
		if(i==count)
			System.out.println("Element not found");
	}

	void push(int data) {
		Node node = new Node(data);
		System.out.println("Pushing into the linkedlist " + data);
		node.next = last;
		count+=1;
		if (last == null) {
			last = node;
		}
		if(count==1){
			node.next=last;
			last.next=node;
		}
		if(count>1){
			node.next=last.next;
			last.next=node;
		}
	}
	void disp(){
		Node trav=last.next;
		int c=0;
		if(trav!=null){
			while(c!=count){
				System.out.println(trav.data+","+trav.next);
				trav=trav.next;
				c+=1;
			}
		}
		else{
			System.out.println("\nEmpty");
		}
	}
}
