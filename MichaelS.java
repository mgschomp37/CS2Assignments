//Michael Schomp
import java.util.*;
import java.io.*;
class MichaelS{
	public static void main(String[] args){
		Name name = new Name();
	}

}
class User{
	private name = new Name();
	private static long id;
	private String password;

	public User(){
		name = "Smith, John, M";
		password = "default1";
	}

	public User(Name n){
		name = n;
	}

	public User(Name n, String p){
		name = n;
		password = p;
	}

	public void setId(){
		id = 0000000;
	}

	public void getId(){
		return id;
	}

	public void setPassword(){
		password = p;
	}

	public void getPassword(){
		return password;
	}



	public boolean changePassword(String oldPass, String newPass, String newPass2){
		if (oldPass == password){
			if (newPass == newPass2){

			}
		}
	}
	public boolean checkPassword(){
		int count = 0;
		 for (int i = 0; i< p.length; i++){
		 	if (p.length < 8){
		 		throw new MyException(0);
		 	}
		 	else return true;

		 	if(Character.isDigit(p.charAt())){
		 		count++;
		 	}
		 	if (count < 2)
		 		throw new MyException(1);
		 	else return true;

		 	if (p.isUpperCase())
		 		return true;
		 	else throw new MyException(2);

		 	
		 }
	}

	public String toString(){
		return "User ID: "+ getId() + "\nName:" + getName();
	}

	public boolean equals(){
		if (this.name == n.Name() && this.password == p.getPassword() && this.id == i.getId())
			return true;
		else return false;
	}



}

class Student extends User{
	public Student(Name n, String p){
		super(n,p);
		
	}

	public double computeGpa(double[] grades){
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < i.length; i++){
			sum = sum + grades[i];
			avg = (sum / grades.length);
		}
		return avg;

	}

	public String toString(){
		return super.toString() + 
	}

	public boolean equals(){
		if()
	}
}

class Faculty extends User{
	private int position;

	public Faculty(Name n, String p, String pos){
		super (n,p);
		 position = convertPosition(pos);
	}
	public String generateEmail(String){
		String email;
		if (Name.getLast().length >= 6){
			email =n.getlast().substring(0,6) + n.getFirst().substring(0,1) + "@newpaltz.edu";
		}
		else{
			email = n   .getLast() + n.getFirst(0,1) + "@newpaltz.edu";
		}
		return email; 
	}

	public int convertPosition(String p){
		if (p = "dean")
			return 0;
		if (p = "chair")
			return 1;
		if (p = "professor")
			return 2;
		if (p = "secretary")
			return 3;
		if (p = "teaching assistant")
			return 4;
		else 
			return -1;
	}

	public void setPosition(){
		position = p;
	}
	public void getPosition(){
		return position;
	}

	public String toString(){
		return super.toString() + "\nPosition: " + getPosition() + "\nEmail" + getEmail();
	}

	public boolean equals(){
		if (super.equals(Name) && super.equals(p) && this.position == n.getPosition())
			return true;
		else return false;
	}
}

class Graduate extends Student{
	double examGrade = 0;
	int attempts = 0;
	boolean ableToGraduate = false;

	public Graduate(Name n, String p){
		super(n,p);
	}

	public String updateExamGrade(double g){
		if (g > examGrade){
			examGrade = g;
			attempts++;
		}
		else attempts++;

		calculateAbleToGraduate();

		if (ableToGraduate == true){
			return "This student is able to graduate";
		}
		else
			return "This student is ot able to graduate";
		
	}

	public calculateAbleToGraduate(){	
		if(attempts <= 2 && examGrade >= 80)
			ableToGraduate = true;
		return ableToGraduate; 

	}

	public void setExamGrade(){
		examGrade = g;
	}

	public void getExamGrade(){
		return examGrade;
	}

	public void setAttempts(){
		attempts = a;
	}

	public void getAttempts(){
		return attempts;
	}

	public void setAbleToGraduate(){
		ableToGraduate = atg;
	}

	public void getAbleToGraduate(){
		return ableToGraduate;
	}

	public String toString(){
		return super.toString() + "\nExam Grade: " + getExamGrade() + "with" + getAttempts() + "attempts";
	}

	public boolean equals(){
		if(super.equals(n) && super.equals(p) && this.examGrade == n.getExamGrade() && this.attempts == n.getAttempts() && this.ableToGraduate == n.getAbleToGraduate())
			return true:
		else return false;
	}
}

class Undergraduate extends Student{
	private String year;

	public Undergraduate(Name n, String p, String y){

	}

	public String checkYear(){
		if (y != "Freshman" || "Sophomore" || "Junior" || "Senior")
			return ("UNKNOWN");
	}

	public void setYear(){
		year  = y;
	}

	public void getYear(){
		return year;
	}

	public String toString(){
		return Student.toString() + "\n Year " + getYear()
	}

	public boolean equals()
		if (super.equals(n)){

		}
}

class Name{
	private String first;
	private String last;
	private String midInit;
	
	public Name()
		this("John", "Smith", "M")
	public Name(String f, String l, String m){
		first =f;
		last = l;
		midInit = m;
	}

	public void setFirst(){
		first = f;
	}

	public void getFirst(){
		return first;
	}

	public void setLast(){
		last = l;
	}

	public void getLast(){
		return last;
	}

	public void setMidInit(){
		midInit = m;
	}

	public void getMidInit(){
		return midInit;
	}

	public String toString(){
		return "Name: "+ getLast()+","+ getFirst()+"," + getMidInit();
	}

	public boolean equals(){
		if (this.first.equals(Name.getFirst())  && this.last.equals(Name.getLast() ) && this.midInit == Name.getMidInit())
	}		return true;
		else return false;
}

class MyException extends Exception{
	public MyException (int code){
		super();
	}

	public String convert(int c){
		switch(c){
			case 0: return "Must be at least 8 characters";
			case 1: return "Must have at least 1 capital letter";
			case 2: return "Must have at least 2 numbers";
		}
	}

}




