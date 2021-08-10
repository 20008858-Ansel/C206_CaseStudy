
public class C206_CaseStudy {
	
	private static final int OPTION_QUIT = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int option = 0;
		
		while (option != OPTION_QUIT) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
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
		
}

