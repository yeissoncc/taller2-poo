package Taller;

import java.util.Scanner;

class preguntaa17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char carácter;
		
		
		System.out.print("ingresa un dato: ");
        carácter = new Scanner(System.in).nextLine().charAt(0);

        if (Character.isDigit(carácter)) {
            System.out.println("Es un número");
        } else if (Character.isLetter(carácter)) {
            System.out.println("Es una letra");
        }

	}
	
	
	

}
