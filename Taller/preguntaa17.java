package Taller;

import java.util.Scanner;

class preguntaa17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char car�cter;
		
		
		System.out.print("ingresa un dato: ");
        car�cter = new Scanner(System.in).nextLine().charAt(0);

        if (Character.isDigit(car�cter)) {
            System.out.println("Es un n�mero");
        } else if (Character.isLetter(car�cter)) {
            System.out.println("Es una letra");
        }

	}
	
	
	

}
