package Taller;

import java.util.Scanner;

class preguntaa14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado;
		int Numero,X;
		
		teclado = new Scanner(System.in);
		
		
		System.out.print("ingresar el numero : ");
		Numero = teclado.nextInt();
		
		if (Numero >100) {
			
			X = Numero+20;
			System.out.println("el numero se  ah  multiplicado: "+X);
			
		}else {
			if (Numero == 100) {
				 
				X = Numero+1;
				System.out.println("el numero se  ah  multiplicado: "+X);
			}else {
				if (Numero<100) {
					
					X= Numero - 20;
					System.out.println("el numero se  ah  multiplicado: "+X);
				}
					
			}
			
		}

	}

}
