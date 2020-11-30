import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void given3NumberWhenLinkedListShouldBeAddedToTop() {
		MyNodes<Integer> myFirstNode = new MyNodes<Integer>(70);
		MyNodes<Integer> mySecondNode = new MyNodes<Integer>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<Integer>(56);
		MyLinkedList myLinkdList = new MyLinkedList();
		myLinkdList.add(myFirstNode);
		myLinkdList.add(mySecondNode);
		myLinkdList.add(myThirdNode);
		myLinkdList.printMyNodes();
		boolean result = myLinkdList.head.equals(myThirdNode) &&
						myLinkdList.head.getNext().equals(mySecondNode) &&
						myLinkdList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}

}
