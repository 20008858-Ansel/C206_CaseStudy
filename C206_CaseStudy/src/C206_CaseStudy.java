import java.util.ArrayList;

public class C206_CaseStudy {
	
	private static final int OPTION_QUIT = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		customerList.add(new Customer("James","Customer","james@1111","james123@gmail.com","New"));
		customerList.add(new Customer("Karry", "Customer","karry@2222", "karry555@gmail.com","New"));
		customerList.add(new Customer("Kally", "Customer", "kally@3333", "kally997@gmail.com", "Confirmed"));
		customerList.add(new Customer("Cherry", "Customer", "cherry@4444", "cherry111@gmail.com", "Confirmed"));
		
		int option = 0;
		
		while (option != OPTION_QUIT) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			if (option ==1) {
				C206_CaseStudy.setHeader("VIEW");
				System.out.println("1. Customer");
				System.out.println("2. Package");
				System.out.println("3. Request for Quote");
				System.out.println("4.Quotation");
				System.out.println("5. Appointment");
				
				int viewoption = Helper.readInt("Enter option to view > ");
				
				if (viewoption == 1) {
					C206_CaseStudy.viewAllCustomer(customerList);
				
				}else if(viewoption == 2) {
					
				
				}else if(viewoption == 3) {
					
				
				}else if(viewoption == 4) {
					
				
				}else if(viewoption == 5) {
					
				
				}else {
					System.out.println("Invalid option");
				}
			}else if(option == 2) {
				C206_CaseStudy.setHeader("ADD");
				System.out.println("1. Customer");
				System.out.println("2. Package");
				System.out.println("3. Request for Quote");
				System.out.println("4.Quotation");
				System.out.println("5. Appointment");
				
				int addoption = Helper.readInt("Enter option to add > ");
				
				if(addoption == 1) {
					Customer cl = inputCustomer();
					C206_CaseStudy.addCustomer(customerList, cl);
				}
			}else if(option == 3) {
				
			}
		}
	}
	private static void menu() {
		C206_CaseStudy.setHeader("Renovation Ace");
		System.out.println("1. View");
		System.out.println("2. Add");
		System.out.println("3. Delete");
		System.out.println("4. Quit");
	}
	
	private static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	//================================= Option 1 View ===============================================
	public static String retrieveAllCustomer(ArrayList<Customer> customerList) {
		String output = "";
		
		for (int i =0; i < customerList.size(); i++) {
			output += String.format("%-30s %-30s %-30s %-30s %-30s\n", customerList.get(i).getName(),customerList.get(i).getRole(), customerList.get(i).getEmail(),customerList.get(i).getPassword(),customerList.get(i).getStatus());
		}
		return output;
	}
	public static void viewAllCustomer(ArrayList<Customer> customerList) {
		C206_CaseStudy.setHeader("Customer List");
		String output = String.format("%-30s %-30s %-30s %-30s %-30s\n", "Name", "Role", "Email", "Password", "Status");
		output += retrieveAllCustomer(customerList);
		System.out.println(output);
	}
	
	//================================= Option 2 Add ================================================
	public static Customer inputCustomer() {
		String name = Helper.readString("Enter name > ");
		String role = Helper.readString("Enter role > ");
		String email = Helper.readString("Enter email > ");
		String password = Helper.readString("Enter password > ");
		String status = Helper.readString("Enter status > ");
		
		Customer cl = new Customer(name, role, email, password, status);
		return cl;
	}
	
	public static void addCustomer(ArrayList<Customer>customerList, Customer cl) {
		customerList.add(cl);
		System.out.println("Customer Added!");
	}
	
	//================================= Option 3 Delete =============================================
		public static void deleteCustomer(ArrayList<Customer> customerList, String name) {
			for(int i = 0; i < customerList.size(); i++) {
				String deletename = customerList.get(i).getName();
				if (name.equalsIgnoreCase(deletename)) {
					System.out.println("User "+ name + " deleted sucessfully!");
					break;
				}else {
					System.out.println("Invalid name entered!");
					
				}
			}
		}
}

