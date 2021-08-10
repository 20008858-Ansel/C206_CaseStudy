
public class C206_CaseStudy {
	
	private static final int OPTION_QUIT = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int option = 0;
		
		while (option != OPTION_QUIT) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
		}
	}
	private static void menu() {
		System.out.println("1. Customer");
		System.out.println("2. Package");
		System.out.println("3. Request for quote");
		System.out.println("4.Quotation");
		System.out.println("5. Appointment");
	}
		
}

