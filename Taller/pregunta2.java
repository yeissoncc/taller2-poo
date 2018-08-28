package Taller;

import java.util.Scanner;

class pregunta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		int A,B,C,D,R;
		
		teclado = new Scanner(System.in);
		System.out.print("introducir primer dato: ");
		A = teclado.nextInt();
		System.out.print("introducir segundo dato: ");
		B = teclado.nextInt();
		System.out.print("introducir tercer dato: ");
		C = teclado.nextInt();
		System.out.print("introducir cuarto dato: ");
		D = teclado.nextInt();
		
		R=(((A+B)/C)*D);
		
		System.out.println("el  ecuador es "+R);
		

	}

}
