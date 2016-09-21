package principal;

import java.util.Scanner;
		

public class Calculadora {

	private static Scanner sc;
	public static void main(String[] args) {
		  int x,y;
		  sc = new Scanner(System.in);
		  String operacion;
		  System.out.println("Numero 1:");
		  x=Integer.parseInt(sc.nextLine());
		  System.out.println("Numero 2:");
		  y=Integer.parseInt(sc.nextLine());
		 
		  System.out.println("Operacion:");
	        operacion=sc.nextLine();
	        switch(operacion){
	            case "sumar":
	                System.out.println("Suma: "+sumar(x,y));
	                break;}
	         
	}
		    
	public static int sumar(int a, int b){
		int s=a+b;
		return s;
	}
	
	
 }



