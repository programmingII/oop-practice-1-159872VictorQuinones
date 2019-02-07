//Victor Manuel Quiñones Pineda 07/02/2019 12:41pm

 import java.util.Scanner; // libreria para uso de scanner 
 
 public class exercise6_ope {
 
 	public static void main(String[] args) { // funcion principal
  	 Scanner in = new Scanner(System.in);
   
  	System.out.print("Input first number: "); 
  	int num1 = in.nextInt(); //guarda num1 
   
  	System.out.print("Input second number: ");
  	int num2 = in.nextInt(); //guarda num2
   
 
  	System.out.println(num1 + " + " + num2 + " = " + 
  	(num1 + num2));   // realiza la operacion de suma 
   
  	System.out.println(num1 + " - " + num2 + " = " + 
  	(num1 - num2)); // realiza la operacion de resta 
   
  	System.out.println(num1 + " x " + num2 + " = " + 
  	(num1 * num2)); // realiza la operacion de multiplicacion 
   
  	System.out.println(num1 + " / " + num2 + " = " + 
  	(num1 / num2)); // realiza la operacion de division 
 
 	 System.out.println(num1 + " mod " + num2 + " = " + 
  	(num1 % num2));   // realiza el modulo de el num 1 con el num2
 	}
 
	}
