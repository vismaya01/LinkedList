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
	
	@Test
	public void given3NumberWhenDeleteFirstElementShouldPassLinkedListTest() {
		MyNodes<Integer> myFirstNode = new MyNodes<Integer>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<Integer>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<Integer>(70);
		MyLinkedList myLinkdList = new MyLinkedList();
		myLinkdList.append(myFirstNode);
		myLinkdList.append(mySecondNode);
		myLinkdList.append(myThirdNode);
		myLinkdList.printMyNodes();
		INode result = myLinkdList.pop();
		myLinkdList.printMyNodes();
		Assert.assertEquals(myFirstNode,result);
	}
	
	@Test
	public void given3NumberWhenDeleteLastElementShouldPassLinkedListTest() {
		MyNodes<Integer> myFirstNode = new MyNodes<Integer>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<Integer>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<Integer>(70);
		MyLinkedList myLinkdList = new MyLinkedList();
		myLinkdList.append(myFirstNode);
		myLinkdList.append(mySecondNode);
		myLinkdList.append(myThirdNode);
		myLinkdList.printMyNodes();
		INode result = myLinkdList.popLast();
		myLinkdList.printMyNodes();
		Assert.assertEquals(myThirdNode,result);
	}
	
	@Test
	public void given3NumberWhenSearchElementShouldPassLinkedListTest() {
		MyNodes<Integer> myFirstNode = new MyNodes<Integer>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<Integer>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<Integer>(70);
		MyLinkedList myLinkdList = new MyLinkedList();
		myLinkdList.append(myFirstNode);
		myLinkdList.append(mySecondNode);
		myLinkdList.append(myThirdNode);
		myLinkdList.printMyNodes();
		INode result = myLinkdList.search(mySecondNode);
		Assert.assertEquals(mySecondNode,result);
	}

	@Test
	public void given3NumberWhenInsertingInBetweenShouldPassLinkedListTest() {
		MyNodes<Integer> myFirstNode = new MyNodes<Integer>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<Integer>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<Integer>(40);
		MyNodes<Integer> myFourNode = new MyNodes<Integer>(70);
		MyLinkedList myLinkdList = new MyLinkedList();
		myLinkdList.append(myFirstNode);
		myLinkdList.append(mySecondNode);
		myLinkdList.append(myFourNode);
		INode resultNode = myLinkdList.search(mySecondNode);
		myLinkdList.insert(resultNode,myThirdNode);
		myLinkdList.printMyNodes();
		boolean result = myLinkdList.head.equals(myFirstNode) &&
						myLinkdList.head.getNext().equals(mySecondNode) &&
						myLinkdList.tail.equals(myFourNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumberWhenDeleteElementShouldPassLinkedListTest() {
		MyNodes<Integer> myFirstNode = new MyNodes<Integer>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<Integer>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<Integer>(40);
		MyNodes<Integer> myFourNode = new MyNodes<Integer>(70);
		MyLinkedList myLinkdList = new MyLinkedList();
		myLinkdList.append(myFirstNode);
		myLinkdList.append(mySecondNode);
		myLinkdList.append(myThirdNode);
		myLinkdList.append(myFourNode);
		myLinkdList.printMyNodes();
		myLinkdList.size();
		INode resultNode = myLinkdList.search(myThirdNode);
		INode result = myLinkdList.popBetween(resultNode);
		myLinkdList.printMyNodes();
		myLinkdList.size();
		Assert.assertEquals(myThirdNode,result);
	}
	
	
}
