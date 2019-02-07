//Victor Manuel Quiñones Pineda 07/02/19 12:17pm

 import java.util.Scanner; // libreria para utilizar scanner 
 
 public class exercise5_multi{  // se declara la clase 
static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
	
	
	System.out.print("input first number: "); //pide el primer numero 
	int num1 = in.nextInt(); //se guarda el num 

	System.out.print("input second number: "); //pide el segundo num
	int num2 = in.nextInt(); // se guarda el num 

	System.out.println(num1 + " x " + num2 + " = " + num1 * num2); // se realiza la operacion
	}


	}