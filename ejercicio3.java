import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
    int numA, numB;
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Ingresa numero A: ");
    numA = s.nextInt();
    
    System.out.println("Ingresa numero B: ");
    numB = s.nextInt();
    
    if(numA > 0 && numB > 0){
        System.out.println("true");
    }
	}
}
