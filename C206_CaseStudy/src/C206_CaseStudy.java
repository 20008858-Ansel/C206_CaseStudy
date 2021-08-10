import java.util.ArrayList;

public class C206_CaseStudy {
	
	private static final int OPTION_QUIT = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
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
	}
	//================================= Option 3 Delete =============================================
}

