public class student{
	
	//class variables declaration
	String name;
	int rollnumber, marksone, markstwo, marksthree;
	
	//constructor definition of class, ="must be same as the name of the instantiated"
	public student(String name, int rollnumber, int marksone, int markstwo, int marksthree) {
		this.name=name;
		this.rollnumber=rollnumber;
		this.marksone=marksone;
		this.markstwo=markstwo;
		this.marksthree=marksthree;
	}
	
	//method to create the printing sequence
	public String printing() {
		return "The student name is:"+this.name+"\nThe student roll number is:"+this.rollnumber+
				"\nThe Student marks in subject 1 is:"+this.marksone+
				"\nThe student marks in subject two is:"+this.markstwo+
				"\nThe student marks in subject three is:"+this.marksthree;		
	}
	//main method
	public static void main(String args[]) {
		//object decleration, the name of the start must be the name of the class
		student somestudent1= new student("john",1,88,89,99); 
		student somestudent2= new student("mayla",2,66,67,89);
		student somestudent3= new student("kayla",3,45,12,56);
		
		//calling the object name along with the printing function
		System.out.println(somestudent1.printing()+"\n\n");
		System.out.println(somestudent2.printing()+"\n\n");
		System.out.println(somestudent3.printing()+"\n\n");
	}	
}