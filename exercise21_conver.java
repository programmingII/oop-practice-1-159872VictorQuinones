//nombre:Victor Manuel Quiñones pineda 
//fecha:26/02/19
//hora: 1:25

import java.util.Scanner; // se implementa scanner para poder ingresar desde teclado entradas 
public class exercise21_conver { // se declara la clase principal 
      public static void main(String args[]) // se declara la funcion principal con el cuerpo e instanciador main  
    {
            int dec_num, rem, quot, i=1, j; // se declaran variables 
        int oct_num[] = new int[100]; // se genera el arreglo para oct y se define de tamaño 100
        Scanner scan = new Scanner(System.in); //
		
        System.out.print("Input a Decimal Number: ");// se imprime en pantalla a travez de system.out.print 
        dec_num = scan.nextInt(); // se guarda el termino ingresado a travez de 
		
        quot = dec_num;
		
        while(quot != 0) // se genera un mientras que impone una condicion 
        {
            oct_num[i++] = quot%8; // se desarrolla un proceso para la conversion de un numero decimal a numero sistema ocho 
            quot = quot/8;
        }
		
        System.out.print("Octal number is: "); // se imprime seguido de el numero convertido 
        for(j=i-1; j>0; j--) // se genera un para para especificar algo 
        {
            System.out.print(oct_num[j]);
        }
		System.out.print("\n");// se imprime un salto de linea 
    }
}
