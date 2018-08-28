package Taller;

import java.util.Scanner;

class pregunta3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado;
		int A,B,C,S;
		
		teclado = new Scanner(System.in);
		System.out.print("introducir primer dato: ");
		A = teclado.nextInt();
		System.out.print("introducir segundo dato: ");
		B = teclado.nextInt();
		System.out.print("introducir tercer dato: ");
		C = teclado.nextInt();
		
		S= (A+B+C)/2;
		
		System.out.println("el area es : "+Math.sqrt(S)*(S-A)*(S-B)*(S-C));

	}

}
