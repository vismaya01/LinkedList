
public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;		
	}
	
	public void add(INode newNode) {
		if(head == null)
			this.head = newNode;
		if(tail == null) 
			this.tail = newNode;
		else {
			INode temNode = this.head;
			this.head = newNode;
			this.head.setNext(temNode);
		}
	}
	
	public void append(INode newNode) {
		if(head == null) 
			this.head = newNode;
		if(tail == null)
			this.tail=newNode;
		else {
			this.tail.setNext(newNode);
			this.tail=newNode;
		}
	}
	
	public void insert(INode myNode, INode newINode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newINode);
		newINode.setNext(tempNode);
	}
	
	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	public INode popLast() {
		INode tempNode = this.head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}
	
	public INode popBetween(INode myNode) {
		INode tempNode = this.head;
		INode popNode = null;
		while(tempNode.getNext() != null) {
			if(tempNode.getNext().equals(myNode)) {
				INode temp1Node = myNode.getNext();
				tempNode.setNext(temp1Node);
				popNode = myNode;
				break;
			}
			tempNode = tempNode.getNext(); 
		}
		return popNode;
	}
	
	public INode search(INode myNode) {
		INode tempNode = this.head;
		while(tempNode.getNext() != null) {
			if(myNode.getKey().equals(tempNode.getKey()))
				break;
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}
	
	public void size(){
		INode tempNode = this.head;
		Integer count = 0;
		while(tempNode != null) {
			count = count + 1;
			tempNode = tempNode.getNext();
		}
		System.out.println(count);
	}
	
	public void printMyNodes() {
		StringBuilder myNodes = new StringBuilder("My Nodes: ");
		INode tempNode = head;
		while(tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) {
				myNodes.append("->");
			}
			tempNode = tempNode.getNext();
		}
		if(tempNode.equals(tail))
			myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
