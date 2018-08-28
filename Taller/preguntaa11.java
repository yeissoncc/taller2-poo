package Taller;

import java.util.Scanner;

class preguntaa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner teclado;
		int A,B,C,D;
		
		teclado = new Scanner(System.in);
		
		
		System.out.print("ingresar el numero A : ");
		A = teclado.nextInt();
		System.out.print("ingresar el numero B : ");
		B = teclado.nextInt();
		System.out.print("ingresar el numero C : ");
		C = teclado.nextInt();
		System.out.print("ingresar el numero D : ");
		D = teclado.nextInt();
		
		if ((A/B) == (C/D)) {
			System.out.println("SI");
			
			
		}else {
			System.out.println("NO");
			
		}
		
		
		
		

	}

}
