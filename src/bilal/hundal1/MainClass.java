package bilal.hundal1;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("This is main Class");
		String Name="Bilal Hundal";
		if(Name.startsWith("Bil")&& Name.endsWith("dal")) {
			System.out.println("This is Bilal Hundal");
		}else {
			System.out.println("This is Not Bilal");
		}
		NewClass.displayNew();
	}

}
