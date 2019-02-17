//nombre: victor manuel quiñones pineda 
//fecha:13/02/2019
//hora:2:34pm

import java.util.Scanner; // la declaracion import indica que el programa utiliza la clase scanner 
public class exercise12_prom { // el cual hace que se pueda leer datos tecleados 
 
 public static void main(String[] args) { //se declara la funcion principal el cual contiene el instanciador main
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input first number: "); //pide el primer numero  
  int num1 = in.nextInt(); // guarda el numero en la variable num1
   
  System.out.print("Input second number: "); //pide el segundo numero 
  int num2 = in.nextInt(); // guarda el numero en la variable num2
   
  System.out.print("Input third number: "); // pide el tercer numero 
  int num3 = in.nextInt(); //guarda el numero en la variable num3
   
  System.out.print("Input fourth number: "); //pide el cuarto numero 
  int num4 = in.nextInt(); //guarda el numero en la variable num4
  
  System.out.print("Enter fifth number: "); //pide el quinto numero 
  int num5 = in.nextInt(); //guarda el numero en la variable num5 
   
   
  System.out.println("Average of five numbers is: " +  
   (num1 + num2 + num3 + num4 + num5) / 5); // se imprime en pantalla el promedio de los 5 numeros 
 }
}
