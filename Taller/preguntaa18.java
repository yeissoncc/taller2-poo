package Taller;

import java.util.Scanner;


class preguntaa18 {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
        String Nombre;
        
        int Sueldo,Horas,Pago,Extra,PagoEX;
        
        
        System.out.print("Ingrese el nombre:");
        Nombre = teclado.next();
        System.out.print("sueldo por sueldo:");
        Sueldo = teclado.nextInt();
        System.out.print("sueldo por hora:");
        Horas = teclado.nextInt();
        
        if (Horas<=40) {
        	
        	Pago= (Horas*Sueldo);
        	
        	 System.out.println("el nombre del empreado: "+Nombre+" el pago por horas trabajadas son: "+Pago);
        	
        }else {
        	System.out.print("pago por oras extra:");
            PagoEX = teclado.nextInt();
        	Extra = (Horas-40);
        	Pago = ((40*Sueldo)+(Extra*PagoEX));
        	
        	System.out.println("el nombre del empreado: "+Nombre+" el pago por horas trabajadas son: "+Pago);
        	
        }
        	
        	
      
	}

}
