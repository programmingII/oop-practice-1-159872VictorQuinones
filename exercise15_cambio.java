//nombre:Victor Manuel Quiñones Pineda 
//fecha:17/02/2019
//hora:9:06pm 

public class exercise15_cambio  { //se define la clase principal y se establece publica
 
 public static void main(String[] args) {//se declara la funcion principal con el instaciador main es estatico y publico
     
   int a, b, temp; //se define las variables y constantes 
   a = 15; // se realiza asigncion a a 
   b = 27; // se realiza asignacion a b 
   System.out.println("Before swapping : a, b = "+a+", "+ + b); //se realiza impresion en pantalla 
   temp = a; //a la variable temp se le asigna el valor de a 
   a = b; //a a se le asigna b
   b = temp; // a b se le asigna temp   
  System.out.println("After swapping : a, b = "+a+", "+ + b); //se realiza la impresion en pantalla con la inversion de los valores de a y b
 }
 }
