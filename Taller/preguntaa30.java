package Taller;

import java.util.Scanner;

class preguntaa30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		int Dato;
		teclado = new Scanner(System.in);
		System.out.print("introducir primer dato: ");
		Dato = teclado.nextInt();
		int matriz[][] = new int[8][8];
		// TODO Auto-generated method stub
		for (int x=0; x < matriz.length; x++) {
			 System.out.println (" ");
			  for (int y=0; y < matriz[x].length; y++) {
				  
			    System.out.print (" "+matriz[x][y]);
			  }
			}
		
		

	}

}
