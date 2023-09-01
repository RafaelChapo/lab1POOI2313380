import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
    int num;
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca un número para hallar el día de la semana (1,2,3,4,5,6 o 7)");
    System.out.println("1 => Lunes");
    System.out.println("2 => Martes");
    System.out.println("3 => Miercoles");
    System.out.println("4 => Jueves");
    System.out.println("5 => Viernes");
    System.out.println("6 => Sabado");
    System.out.println("7 => Domingo");
    num = s.nextInt();
    
    switch (num){
        case 1: if (num == 1)
            System.out.println("\nLunes");
        break;
        
        case 2: if (num == 2)
            System.out.println("Martes");
        break;
        
        case 3: if (num == 3)
            System.out.println("Miercoles");
        break;
        
        case 4: if (num == 4)
            System.out.println("Jueves");
        break;
        
        case 5: if (num == 5)
            System.out.println("Viernes");
        break;
        
        case 6: if (num == 6)
            System.out.println("Sabado");
        break;
        
        case 7: if (num == 7)
            System.out.println("Domingo");
        break;
        
        default:
         System.out.println("Ingrese un numero válido");
    }
	}
}
