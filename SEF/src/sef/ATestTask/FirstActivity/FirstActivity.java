package sef.ATestTask.FirstActivity;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class FirstActivity {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();

		list.add(new Employee("Jonh", "Smith", 30, 1, "manager", "Z", 100));
		list.add(new Employee("Mark", "Smith", 34, 2, "manager", "Z", 200));
		list.add(new Employee("Boris", "Simpson", 45, 3, "manager", "Z", 300));
		list.add(new Employee("Jonh", "Grey", 23, 4, "manager", "Z", 100));
		list.add(new Employee("Edvin", "Karlson", 49, 5, "director", "Z", 1000));
		list.add(new Employee("Jonh", "brown", 63, 6, "driver", "Z", 500));

		for (Employee emp: list) {
			System.out.println(emp.getempId(),emp.getFirstName(),emp.setSecondName(),emp.getAge(), emp.getjobTitle(),emp.getcompanyName(),emp.getsalary());
		}

		}
	static void bubbleSort(ArrayList<Employee> employees) {
		int n = employees.size();
		int temp = 0;
		for(int i=0; i < n; i++){
			for(int j=1; j < (n-i); j++){
				if(employees[j-1] > employees[j]){
					//swap elements
					temp = employees[j-1];
					employees[j-1] = employees[j];
					employees[j] = temp;
				}
				System.out.println(emp.getempId(),emp.getFirstName(),emp.setSecondName(),emp.getAge(), emp.getjobTitle(),emp.getcompanyName(),emp.getsalary()););


			public static void main(String arg[]){

				Person = new Person();

				//Access an object's member method to invoke a behavior
				System.out.println(him.introduce());
				System.out.println(her.introduce());

				// Access and Set the object's attribute using it's setter and getter
				him.setName("John");
				String name = him.getName();
				System.out.println(name);

				//This will cause the object pointed by 'her' to be garbage collected
				//since there are no more remaining references to that object
				her = null;
		//TODO 1 Create collection of employee (more than 5)
		//		System.out.println() result

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		//TODO 3 create instance of the Person ->
		// than make them Student
		// than make them Employee
		//		System.out.println() result

		//TODO 4 Create method for total change employee information
		// for example some employee change his work


	}

	
	
}
