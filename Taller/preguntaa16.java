package Taller;

import java.util.Scanner;

class preguntaa16 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner teclado;
		int Saldo,Deuda,X;
		
		teclado = new Scanner(System.in);
		
		
		System.out.print("ingresar el  saldo : ");
		Saldo = teclado.nextInt();
		System.out.print("ingresar el  deuna : ");
		Deuda = teclado.nextInt();
		
		
		if (Saldo == Deuda) {
			
			System.out.println("no se esta deviendo nada ");
			
		}else {
			if (Saldo > Deuda) {
				
				System.out.println("se acumulado puntos ");
				
			}else {
				X = Deuda-Saldo;
				System.out.println("se queda debiendo: "+X);
			}
		}
		


	}
	
	

}
