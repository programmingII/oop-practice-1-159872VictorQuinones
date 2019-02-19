//nombre:Victor Manuel Quiñones Pineda
//fecha:18/02/2019
//hora:10:14pm

import java.util.Scanner;//Me permite importar la libreria para escanear y ingresar del teclado 
public class exercise18_binariomulti {
 public static void main(String[] args)
 {
  long binary1, binary2, multiply = 0; //se definen las variables
  int digit, factor = 1;
  Scanner in = new Scanner(System.in); //Se crea el objeto en el que se almacenaran datos
  System.out.print("Ingresa el primer numero binario: "); //Nos permite ingresar el primer numero
  binary1 = in.nextLong();//Nos guarda el primer numero
  System.out.print("Ingresa el segundo numero binario: "); //Nos permite ingresar el segundo numero
  binary2 = in.nextLong();//Nos guarda el segundo numero
  while (binary2 != 0)
  {
   digit = (int)(binary2 % 10); //Hace la operacion de un entero a binario
   if (digit == 1) 
   {
    binary1 = binary1 * factor;
    multiply = binaryproduct((int) binary1, (int) multiply); //Hace la funcion de multiplicar los enteros y despues los convierte en binarios
   } 
   else
   {
    binary1 = binary1 * factor;
   }
   binary2 = binary2 / 10;
   factor = 10;
  }
  System.out.print("La multiplicacion de los 2 numeros binarios es : " + multiply+"\n"); //Nos da la operacion de mulplicar los numeros binarios
 }
 static int binaryproduct(int binary1, int binary2) 
 {
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  int binary_prod_result = 0;

  while (binary1 != 0 || binary2 != 0) 
  {
   sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
   remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
  if (remainder != 0)
  {
   sum[i++] = remainder;
  }
  --i;
  while (i >= 0) 
  {
   binary_prod_result = binary_prod_result * 10 + sum[i--];
  }
  return binary_prod_result;
 }
 }