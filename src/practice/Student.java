package practice;

public class Student {
String year;
int no_of_courses;
double gpa;

	public Student(String year, int no_of_courses, double gpa) {
	super();
	this.year = year;
	this.no_of_courses = no_of_courses;
	this.gpa = gpa;
}

	@Override
	public String toString() {
		return "Student [year=" + year + ", no_of_courses=" + no_of_courses + ", gpa=" + gpa + "]";
	}

	public static void main(String[] args) {
	 
Student s=new Student("fresher",5,8.5);
Student s1=new Student("Sophomore",3,4.5);
Student s2=new Student("junior",4,6.6);
Student s3=new Student("senior",1,9.1);
System.out.println(s+"\n"+s1+"\n"+s2+"\n"+s3);
	}

}
