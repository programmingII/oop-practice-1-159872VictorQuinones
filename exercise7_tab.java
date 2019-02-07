// nombre:Victor Manuel Quiñones Pineda 
// dia:07/02/2019
// hora:1:04pm

 import java.util.Scanner; // libreria para el uso de scannear las entradas de consola por el usuario 
 
 public class exercise7_tab { // declaracion de la clase 
 
 	public static void main(String[] args) {  // funcion principal  
  	 Scanner in = new Scanner(System.in); 
   
  	System.out.print("Input a number: "); // te pide que ingreses un numero 
  	 int num1 = in.nextInt(); //guarda el num que ingresaste 
   
 	 for (int i=0; i< 10; i++){ // en el arreglo for da la condicion i=0 o, i menor que 10 avanzar 1 
   	  System.out.println(num1 + " x " + (i+1) + " = " + 
     	     (num1 * (i+1))); // realiza la operacion del num y lo multiplica x1 avanza 1 y entra en el for nuevamente 
			      // verifica si es menor a 10, si lo es vuelve a multiplicar y asi sucesivamente 
  	}                     // llegara hasta multiplicar hasta 10 puesto que es donde se acaba el for 
       }
      }
