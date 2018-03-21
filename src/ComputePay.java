/*
  	ISYS 320
  	Name(s): Timothy James
  	Date: March 20, 2018
*/

public class ComputePay {
	public static void main(String[] args) {
		int TotalHours = (4 + 5 + 8 + 4);
		double HourlySalary = 8.75; 		
		
		System.out.println("My total hours worked: " + TotalHours + " hours");
		System.out.println("My hourly salary: " + "$" + HourlySalary + " per hour");
		System.out.println("My total pay: " + "$" + TotalHours * HourlySalary);
		
	}
}