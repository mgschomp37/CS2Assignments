//Michael Schomp
import java.util.*;
import java.io.*;
class MichaelS{
	public static void main (String [] args)throws IOException{
		//declare variables for new file as well as file reader and buffered reader
		File post = new File("B.txt");
		FileReader inFile = new FileReader(post);
		BufferedReader br = new BufferedReader(inFile);
		System.out.println(Calculator(inFile)); // calculator for the file
		
		


	}

	public static int Calculator(BufferedReader br, char c)throws IOException{
		Stack<Character> stck = new Stack<Character>();
		int numberOne;
		int numberTwo;
		char operator = ' ';

		//for loop to check for numbers and operators
		for (int i = 0; i < br.length(); i++){
			if(br.charAt(i).isDigit()){

				br.read();
				numberOne = stck.push();
				numberTwo = stck.push();
				
			}
			else stck.push();

			while(stck.size() == 3 && br.charAt(i)!= $){
			(Character)operator = stck.pop();
				numberTwo = stck.pop();
				numberOne = stck.pop();
			}

		}

		//switch statement for the operators
		switch(operator){
			case '+':
			stck.push(numberTwo + numberOne);
			break;

			case'-':
			stck.push(numberTwo - numberOne);
			break;

			case'*':
			stck.push(numberTwo * numberOne);
			break;

			case'/':
			stck.push(numberTwo / numberOne);
			break;

			case'^': //exponent
			stck.push((int)Math.pow(numberTwo, numberOne));
			break;

			case '@'://negation
			stck.push(numberTwo *= -1);
			break; 

			case'#'://square root
			stck.push((int)Math.sqrt(numberTwo));
			break;


		}
	}

}
