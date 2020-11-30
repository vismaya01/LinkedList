
public class MyNodes<K> {
	private K key;
	private MyNodes next;
	
	public MyNodes(K key) {
		this.key = key;
		this.next = null;
	}
	
	public MyNodes getNext() {
		return next;
	}
	
	public void setNext(MyNodes next) {
		this.next = next;
	}
}