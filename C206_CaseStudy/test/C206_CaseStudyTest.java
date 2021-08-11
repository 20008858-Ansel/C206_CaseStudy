import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Customer cl1;
	private Customer cl2;
	
	private ArrayList <Customer> customerList;

	@Before
	public void setUp() throws Exception {
		cl1 = new Customer("John", "Customer","john@6665","john447@gmail.com","Confirmed");
		cl2 = new Customer("Mary", "Customer", "mary#8865", "mary564@gmail,com","Confirmed");
		customerList = new ArrayList<Customer>();
	}
	
	@Test
	public void testAddCustomer() {
		assertNotNull("Test if there is valid Customer arraylist to add to",customerList);
		C206_CaseStudy.addCustomer(customerList, cl1);
		assertEquals("Test if that Camcorder arraylist size is 1?", 1, customerList.size());
		
		assertSame("Test that Customer is added same as 1st item of the list?", cl1, customerList.get(0));
		
		C206_CaseStudy.addCustomer(customerList, cl2);
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, customerList.size());
	}
	
	@Test
	public void testRetrieveAllCustomer() {
		assertNotNull("Test if there is valid Chromebook arraylist to add to", customerList);
		String allCustomer= C206_CaseStudy.retrieveAllCustomer(customerList);
		String testOutput = "";
		assertEquals("Check that ViewAllCustomerlist", testOutput, allCustomer);
		allCustomer=  C206_CaseStudy.retrieveAllCustomer(customerList);
		testOutput = String.format("%-30s %-30s %-30s %-13s %-30s\n","James","Customer","james@1111","james123@gmail.com","New");
		testOutput += String.format("%-30s %-30s %-30s %-13s %-30s\n","Karry", "Customer","karry@2222", "karry555@gmail.com","New");
		testOutput += String.format("%-30s %-30s %-30s %-13s %-30s\n","Kally", "Customer", "kally@3333", "kally997@gmail.com", "Confirmed");
		testOutput += String.format("%-30s %-30s %-30s %-13s %-30s\n","Cherry", "Customer", "cherry@4444", "cherry111@gmail.com", "Confirmed");
	}

	@After
	public void tearDown() throws Exception {
		cl1 = null;
		cl2 = null;
		customerList = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
		
	}

}
