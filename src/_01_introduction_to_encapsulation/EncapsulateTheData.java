package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	public static void main(String[] args) {
		
	}
	
	public float getDegreesTurned(){
		return degreesTurned;
	}
	
	public void setDegreesTurned(float value) {
		if(value<0) {
			degreesTurned = 0;
		}
		else if(value%360!=0||value==0) {
			degreesTurned = value%360;
		}
		else {
			degreesTurned = 360;
		}
	}
	
	public String getNomenclature(){
		return nomenclature;
	}
	
	public void setNomenclature(String value) {
		if(value.isEmpty()) {
			nomenclature = " ";
		}
		else {
			nomenclature = value;
		}
	}
	
	public int getItemsReceived(){
		return itemsReceived;
	}
	
	public void setItemsReceived(int value) {
		if(value<0) {
			itemsReceived = 0;
		}
		else {
			itemsReceived = value;
		}
	}
	
	public Object getMemberObj(){
		return memberObj;
	}
	
	public void setMemberObj(Object value) {
		if(value.getClass() == String.class) {
			memberObj = new Object();
		}
		else {
			memberObj = value;
		}
	}
	
	@Test
	public void testGettersAndSetters() {
		setDegreesTurned(0);
		setItemsReceived(0);
		Object test = new Object();
		setMemberObj(test);
		setNomenclature("Test");
		
		assertEquals(0, getDegreesTurned());
		assertEquals(0, getItemsReceived());
		assertEquals(test, getMemberObj());
		assertEquals("Test", getNomenclature());

		assertEquals(0, degreesTurned);
		assertEquals(0, itemsReceived);
		assertEquals(test, memberObj);
		assertEquals("Test", nomenclature);
		
		
		setItemsReceived(-1);
		assertEquals(0, getItemsReceived());
		
		setDegreesTurned(-10);
		assertEquals(0, getDegreesTurned());
		setDegreesTurned(720);
		assertEquals(360, getDegreesTurned());
		
		setMemberObj("Test");
		assertNotEquals("Test", getMemberObj());
		
		
		setNomenclature("");
		assertEquals(" ", getNomenclature());
	}
}
