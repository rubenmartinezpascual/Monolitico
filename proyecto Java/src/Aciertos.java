/*
 * Clase que escoge un numero y contiene metodos para adivinarlo
 * y guarda el numero que introduces y genera un numero aleatorio
 * @author Asuminver
 * @since 05/03/2016
 * @version inicial
 * @author Rubén Martínez
 * @version 2.0
 */


import java.util.Scanner;
public class Aciertos {
	static int numero = 0;
	static int valor = (int) (500 *Math.random());
	
/* Metodo principal, que ejecuta en bucle los metodos pideNumero() y compara() 
 * mientras que compara() devuelva false, añade un contador y un mensaje que se 
 * mostraran cuando compara() devuelva true.  
 */
	public static void main(String[] args) {
      int cont = 0;
        
        do { numero=pideNumero();
            cont++;
            }
            
         while (!compara(numero,valor));
        System.out.print("Excelente!!! Has acertado , No. de intentos: "+cont );
  }
    
/*Almacena un valor por teclado y se la asigna a la variable global numero,
 * posteriormente la devuelve.
 *@return numero
 */
public static int pideNumero() {
	Scanner sc = new Scanner(System.in);
	System.out.print("\nIntroduce el valor de X: ");
	numero = sc.nextInt();
	return numero;
	  }

/*Metodo que recibe las variables globales numero y valor como parametro,
 * Añade una variable boolean inicializada a false, su valor cambiara
 * a true si numero = valor, en el caso de que numero sea menor o mayor que valor a
 * esa variable boolean se le asignara valor false e indicara con un mensaje por
 * pantalla si numero es mayor que valor o si es menor. Por ultimo devolvera la 
 * variable boolean acierto.
 * @param numero
 * @para valor
 * @return acierto
 * 
 */
public static boolean compara(int numero, int valor){
	boolean acierto = false;
	if (numero == valor)
		{acierto=true;}
	else if (numero > valor)
		{acierto=false;
		System.out.print("Te has pasado");}
	else if (numero < valor)
		{acierto=false;
		System.out.print("Casi cerca...");}
		return acierto;
			}
}

