package Taller;

import java.util.Scanner;

class pregunta9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado;
		int Hora,Minutos,Segundos, Dias;
		
		teclado = new Scanner(System.in);
		
		
		System.out.print("ingresar horas a cambiar : ");
		Hora = teclado.nextInt();
		
		Minutos = Hora*60;
		
		Segundos = Minutos*60;
		
		Dias = Hora/24;
		
		System.out.println("las horas ingresadas son: "+Hora+" Horas"+" los minutos son : "+Minutos+" Minutos"+" en segundos es : "+Segundos+"sg");
		System.out.println("los dias  son: "+Dias+" dia");

	}

}
