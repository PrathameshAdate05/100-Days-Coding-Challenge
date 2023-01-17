import java.util.Scanner;

public class PrathameshAdate_Day1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Character :");
		char s = sc.next().charAt(0);
		
		if(s == 'a' || s == 'e' || s == 'o' || s == 'i' || s == 'u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
	}
}