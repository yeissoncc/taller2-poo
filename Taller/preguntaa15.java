package Taller;

import java.util.Scanner;

class preguntaa15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		int A,B,C;
		
		teclado = new Scanner(System.in);
		
		
		System.out.print("ingresar el numero A : ");
		A = teclado.nextInt();
		System.out.print("ingresar el numero B : ");
		B = teclado.nextInt();
		System.out.print("ingresar el numero C : ");
		C = teclado.nextInt();
		
		
		if(A>B) {
			
			System.out.println("el numero se  ah  es mayor A ");
			
		}else {
			
			if(A>B) {
				
				System.out.println("el numero se  ah  es mayor B ");
				
			}else{
				System.out.println("el numero se  ah  es mayor C ");
			}
		}
		
	}

}
