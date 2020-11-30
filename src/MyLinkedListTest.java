import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedToTop() {
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
	
	@Test
	public void given3NumberWhenAppendedLinkedListShouldBeAddedToLast() {
		MyNodes<Integer> myFirstNode = new MyNodes<Integer>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<Integer>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<Integer>(70);
		MyLinkedList myLinkdList = new MyLinkedList();
		myLinkdList.append(myFirstNode);
		myLinkdList.append(mySecondNode);
		myLinkdList.append(myThirdNode);
		myLinkdList.printMyNodes();
		boolean result = myLinkdList.head.equals(myFirstNode) &&
						myLinkdList.head.getNext().equals(mySecondNode) &&
						myLinkdList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumberWhenInsertingSecondInBetweenShouldPassLinkedListTest() {
		MyNodes<Integer> myFirstNode = new MyNodes<Integer>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<Integer>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<Integer>(70);
		MyLinkedList myLinkdList = new MyLinkedList();
		myLinkdList.append(myFirstNode);
		myLinkdList.append(myThirdNode);
		myLinkdList.insert(myFirstNode,mySecondNode);
		myLinkdList.printMyNodes();
		boolean result = myLinkdList.head.equals(myFirstNode) &&
						myLinkdList.head.getNext().equals(mySecondNode) &&
						myLinkdList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

}
