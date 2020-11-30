
public class MyNodes<K> implements INode<K> {
	private K key;
	private INode next;
	
	public MyNodes(K key) {
		this.key = key;
		this.next = null;
	}
	
	public INode getNext() {
		return next;
	}
	
	public void setNext(INode next) {
		this.next = next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;		
	}
}