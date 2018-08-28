package Taller;

import java.util.Scanner;

class pregunta5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado;
		int AX,BX,C,Y;
		
		teclado = new Scanner(System.in);
		System.out.print("introducir primer dato: ");
		AX = teclado.nextInt();
		System.out.print("introducir segundo dato: ");
		BX = teclado.nextInt();
		System.out.print("introducir tercer dato: ");
		C = teclado.nextInt();
		
		Y= (((AX*2)+BX+C)/2);
		
		System.out.println("el area es : "+Y);

	}

}
