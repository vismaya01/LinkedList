import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {

	@Test
	public void given3NumberWhenLinkedShouldPassedLinkedListTest() {
		MyNodes<Integer> myFirstNode = new MyNodes<Integer>(56);
		MyNodes<Integer> mySecondNode = new MyNodes<Integer>(30);
		MyNodes<Integer> myThirdNode = new MyNodes<Integer>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) &&
						mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}

}
