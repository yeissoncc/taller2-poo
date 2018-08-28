package Taller;

import java.util.Scanner;

class preguntaa27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner teclado=new Scanner(System.in);
        
        int Numero,Resultado;
        
        
		for (int i = 1; i <= 5; ++i) {
			
			 System.out.print("ingrese "+i+" numero: :");
		        Numero = teclado.nextInt();
		        Resultado = Numero+Numero;		
		        System.out.println("ingrese "+Resultado);
		}
		
		
		


	}

}
