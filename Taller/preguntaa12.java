package Taller;

import java.util.Scanner;

class preguntaa12 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		

		Scanner teclado;
		int A,B,C,D,X,Cat;
		
		teclado = new Scanner(System.in);
		
		
		System.out.print("ingresar el numero A : ");
		A = teclado.nextInt();
		System.out.print("ingresar el numero B : ");
		B = teclado.nextInt();
		System.out.print("ingresar el numero C : ");
		C = teclado.nextInt();
		System.out.print("ingresar el numero D : ");
		D = teclado.nextInt();
		System.out.print("ingresar el numero X : ");
		X = teclado.nextInt();
		
		if ( X > 0) {
			
			Cat = ((A+B)*(C+D));
			
			System.out.println("el numero se  ah  multiplicado: "+Cat);
				
		}else {
			if ( X == 0) {
				
				Cat = ((A+B)/(C+D));
				System.out.println("el numero  se ah divividido: "+Cat);
					
			}else {
				if ( X < 0) {
					Cat = ((A+B)-(C+D));
					System.out.println("el numero se restado: "+Cat);
						
				}
					
			}
				
		}

	}

}
