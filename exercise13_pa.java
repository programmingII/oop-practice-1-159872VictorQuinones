//nombre:Victor Manuel Quiñones Pineda 
//fecha: 13/02/2019
//hora: 3:05pm

public class exercise13_pa {  // se define la clase principal 
 
   public static void main(String[] strings) { // se declara la funcion principal que contiene el instanciador main 

        final double width = 5.6; //se establece una variable constante para el ancho por medio de el modificador final 
        final double height = 8.5; //se establece una variable constante para la altura debido a que con final solo se le puede asignar un valor una unica vez 

        double perimeter = 2*(height + width);//se realiza la operacion de perimetro y se guarda en perimeter 
		
        double area = width * height;	//se realiza la operacion para calcular el area y se guarda en area 	
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter); // se imprime en pantalla el mensaje con el resultado de perimeter 

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);// se imprime en pantalla el mensaje de area 
    }
}
