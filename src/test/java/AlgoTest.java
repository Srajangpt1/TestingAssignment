/**
 * 
 */
package test.java;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

import com.sun.javafx.geom.Vec2d;

import main.java.SortAlgos;
import main.java.SortDemoData;

/**
 * @author srajangupta
 *
 */
public class AlgoTest {

	SortDemoData testSeq1 = new SortDemoData();
	SortDemoData answer = new SortDemoData();
	
	@Test 
	// random array for covering every node
	public void testCase1BubbleSort() {
		
		testSeq1.initializeArray("8 3 7 9 5"); 
		answer.initializeArray("3 5 7 8 9");
		testSeq1.runAlgo(0);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);
		
		}
	//array with one element for 1 edge covenrge.
	/*@Test
	public void testCase2BubbleSort() {
		
		testSeq1.initializeArray("3"); 
		answer.initializeArray("3");
		testSeq1.runAlgo(0);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		//assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		//assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		//assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		//assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);
		}*/
	
	//empty array condition
	@Test (expected = java.util.NoSuchElementException.class)
	public void testCase6BubbleSort() {
		
		testSeq1.initializeArray(""); 
		answer.initializeArray("");
		testSeq1.runAlgo(0);
		assertTrue(testSeq1.myArray.length == answer.myArray.length);
		//assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		//assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		//assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		//assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);
		
		}
	
	//Sorted array for condition coverege of false if condition
	@Test
	public void testCase3BubbleSort() {
		
		testSeq1.initializeArray("1 2 3 4"); 
		answer.initializeArray("1 2 3 4");
		testSeq1.runAlgo(0);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		//assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);
		
		}
	
	//negative array
	/*@Test
	public void testCase4BubbleSort() {
		
		testSeq1.initializeArray("-2 1 0 -3"); 
		answer.initializeArray("-3 -2 0 1");
		testSeq1.runAlgo(0);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		//assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);
		
		}*/
	@Test
	//condition coverege array for the second for loop
	public void testCase5BubbleSort() {
		
		testSeq1.initializeArray("2 1"); 
		answer.initializeArray("1 2");
		testSeq1.runAlgo(0);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		//assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		//assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		//assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);
		
		}
	
	@Test
	public void testCase1selectionSort() {
		testSeq1.initializeArray("1 2"); 
		answer.initializeArray("1 2");
		testSeq1.runAlgo(1);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
	}
	@Test
	public void testCase2selectionSort() {
		testSeq1.initializeArray("2 1 7 4"); 
		answer.initializeArray("1 2 4 7");
		testSeq1.runAlgo(1);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
	}
	@Test
	public void testCase3selectionSort() {
		testSeq1.initializeArray("1"); 
		answer.initializeArray("1");
		testSeq1.runAlgo(1);
		//assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		//assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		//assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray.length == answer.myArray.length);
	}
	
	@Test
	public void testCase1insertionSort() {
		testSeq1.initializeArray("1"); 
		answer.initializeArray("1");
		testSeq1.runAlgo(2);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		//assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		//assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray.length == answer.myArray.length);
	}
	
	@Test
	public void testCase2insertionSort() {
		testSeq1.initializeArray("4 6 2 1 5"); 
		answer.initializeArray("1 2 4 5 6");
		testSeq1.runAlgo(2);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);
		
	}
	@Test (expected = java.util.NoSuchElementException.class)
	public void testCase3insertionSort() {
		testSeq1.initializeArray(""); 
		answer.initializeArray("");
		testSeq1.runAlgo(2);
		/*assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);*/
		assertTrue(testSeq1.myArray.length == answer.myArray.length);
	}
	@Test
	public void testCase1mergeSort() {
		testSeq1.initializeArray("3 4 7 2"); 
		answer.initializeArray("2 3 4 7");
		testSeq1.runAlgo(3);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		//assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);*/
		//assertTrue(testSeq1.myArray.length == answer.myArray.length);
	}
	
	@Test
	public void testCase2mergeSort() {
		testSeq1.initializeArray("4 2"); 
		answer.initializeArray("2 4");
		testSeq1.runAlgo(3);
		//assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		//assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		//assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);*/
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		//assertTrue(testSeq1.myArray.length == answer.myArray.length);
	}
	@Test
	public void testCase3mergeSort() {
		testSeq1.initializeArray("4 2 9 7 3"); 
		answer.initializeArray("2 3 4 7 9");
		testSeq1.runAlgo(3);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);
		//assertTrue(testSeq1.myArray.length == answer.myArray.length);
	}
	
	@Test
	public void testCase1quickSort() {
		testSeq1.initializeArray("4 2 9 7 3"); 
		answer.initializeArray("2 3 4 7 9");
		testSeq1.runAlgo(4);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);
		//assertTrue(testSeq1.myArray.length == answer.myArray.length);
	}
	
	@Test
	public void testCase2quickSort() {
		testSeq1.initializeArray("4 2 0 1"); 
		answer.initializeArray("0 1 2 4");
		testSeq1.runAlgo(4);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		//assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);
		//assertTrue(testSeq1.myArray.length == answer.myArray.length);
	}
	
	@Test
	public void testCase3quickSort() {
		testSeq1.initializeArray("4 2 5 6 7 8"); 
		answer.initializeArray("2 4 5 6 7 8");
		testSeq1.runAlgo(4);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);
		assertTrue(testSeq1.myArray[5].key == answer.myArray[5].key);
		
	}
	@Test
	public void testCase1heapSort() {
		testSeq1.initializeArray("4 2 5 6 7 8"); 
		answer.initializeArray("2 4 5 6 7 8");
		testSeq1.runAlgo(5);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);
		assertTrue(testSeq1.myArray[5].key == answer.myArray[5].key);
		
	}
	
	@Test
	public void testCaseDefault() {
		testSeq1.initializeArray("4 2 5 6 7 8"); 
		answer.initializeArray("2 4 5 6 7 8");
		testSeq1.runAlgo(10);
		assertTrue(testSeq1.myArray[0].key == answer.myArray[0].key);
		assertTrue(testSeq1.myArray[1].key == answer.myArray[1].key);
		assertTrue(testSeq1.myArray[2].key == answer.myArray[2].key);
		assertTrue(testSeq1.myArray[3].key == answer.myArray[3].key);
		assertTrue(testSeq1.myArray[4].key == answer.myArray[4].key);
		assertTrue(testSeq1.myArray[5].key == answer.myArray[5].key);
		
	}
	

}
