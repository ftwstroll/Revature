package override_equals_method;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee(100, "Alpga");
		
		
		Employee e2=new Employee(101, "Beta");

		
		if(e1.equals(e2)) {
			System.out.println("Both employees have the same id");
		}else {
			System.out.println("The employees have different ids");
		}
		
	}

}
