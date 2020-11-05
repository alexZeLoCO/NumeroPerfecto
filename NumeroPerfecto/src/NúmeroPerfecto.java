import java.util.Scanner;		//SCANNER
public class NúmeroPerfecto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//TECLADO
		int n = teclado.nextInt();		//ALMACENA NÚMERO EN N
		int i = 1;		//INICIALIZA I (POSIBLE DIVISOR)
		int suma =0;		//INICIALIZA SUMATORIO
		while (i<=n/2) {		//MIENTRAS LA I SEA MENOR O IGUAL A LA MITAD DE N
			if (n%i==0) {		//SI I ES DIVISOR
				suma = suma + i;		//SUMAR
			}
			i++;		//SUMAR UNO A LA I
		}	
		if (suma==n) {		//SI LA SUMA ES IGUAL AL NUMERO INICIAL
			System.out.printf("El número %d es perfecto.",n);		//OUTPUT
		} else {		//SI NO 
			System.out.printf("El número %d no es perfecto.",n);		//OUTPUT
		}

	}

}
