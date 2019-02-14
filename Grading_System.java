import java.util.Scanner;
public class Grading_System {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte Score;
		String name;
		
		for(int i = 1; i <=100; i++) {
			
			System.out.println("enter your Name");
			name = input.next();
			
			System.out.println("Enter your score");
			Score = input.nextByte();
			
			if(Score >= 90 && Score <= 100) {
				System.out.println("Your Name is:"+ name +" And your Grade is: A+");
				
			}
			else if(Score >= 70 && Score <= 89){ 
				System.out.println("Your Name is:"+ name +" And your Grade is: A-");
				
			}
			else if(Score >= 60 && Score <= 69){ 
				System.out.println("Your Name is:"+ name +" And your Grade is: B+");
				
			}
			else if(Score >= 50 && Score <= 59){ 
				System.out.println("Your Name is:"+ name +" And your Grade is: B");
				
			}
			else if(Score >= 40 && Score <= 49){ 
				System.out.println("Your Name is:"+ name +" And your Grade is: C"); 
				
			}
			else if(Score >= 30 && Score <= 39){ 
				System.out.println("Your Name is:"+ name +" And your Grade is: D");
			}
			else {
				System.out.println("Your Name is:"+ name +" And your Grade is: F");
			}
				
		}	
	}
  }
