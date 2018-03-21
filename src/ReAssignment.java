/*
  	ISYS 320
  	Name(s): Timothy James
  	Date:  March 20, 2018
*/

/*
 	Your predicted values for variables a, b, and c
	a => 6....correct a=a+1 --> a=5+1 --> a=6
	b => 9....correct b=b-1 --> b=10-1 --> b=9
	c => 15....correct c=c+a --> c=10+5 --> c=15
 
 	After testing the statements in the main method, indicate above if your predictions were correct.
*/

public class ReAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		int c = b;
		System.out.println(a + 1);  	//question 10
		System.out.println(b - 1);		//question 10
		System.out.println(c + a);		//question 10
		System.out.println(c % a + 4);	//question 11
	}

}
