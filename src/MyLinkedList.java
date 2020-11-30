
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
	
	public void printMyNodes() {
		StringBuilder myNodes = new StringBuilder("My Nodes: ");
		INode tempNode = head;
		while(tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
