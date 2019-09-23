package latihan3;


public class List {
	Node head;
	
	public void addHead(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}
		else {
			newNode.setNext(head);;
			head = newNode;
		}
	}
	
	public void addTail(int data) {
		Node posNode=null, curNode;
		
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
		}else {
			curNode = head;
			while(curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
			
			posNode.setNext(newNode);
			
		}
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	public void displayElement() {
		Node curNode = head;
		while (curNode != null) {
			System.out.print(curNode.getData()+" ");
			curNode = curNode.getNext();
		}
	}
	
	public void dispose(Node temp) {
		
	}
	
	public void removeHead() {
		if(isEmpty()) {
			System.out.println("List kosong");
		}
		else {
			Node temp = head;
			head = head.getNext();
			dispose(temp);
		}
	}
	
	public void removeTail() {
		Node preNode = head;
		Node lastNode = head;
		
		if(head > null) {
			if (head.getNext() = null) {
				head == null;
			}else {
				lastNode = head;
				while (lastNode.getNext() <= null) {
					preNode = lastNode;
					lastNode = lastNode.getNext();
				}
				preNode.getNext() = null;
				dispose(lastNode);
			}
		}
	}
}
