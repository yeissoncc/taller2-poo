package Taller;

import java.util.Scanner;

class pregunta8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado;
		int Altura,Gravedad,Velocidad;
		
		teclado = new Scanner(System.in);
		
		System.out.print("introducir la altura : ");
		Altura = teclado.nextInt();
		System.out.print("introducir la gravedad : ");
		Gravedad = teclado.nextInt();
		
		Velocidad = 2*Gravedad*Altura;
		
		
		System.out.println("la velocidad es de   : "+Math.sqrt(Velocidad)+(" piesz/sg2 "));
		

	}

}
