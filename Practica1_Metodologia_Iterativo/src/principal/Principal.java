package principal;

import utilities.Util;
import java.util.*;


public class Principal {
	public static void main(String [] args){
		start();
	}
	
	private static void start(){
		Util<Double> ut = new Util<Double>();
		Scanner scan = new Scanner(System.in);
		Integer num;
		
		System.out.printf("\nPrograma que calcula iterativamente los n primeros numeros de una serie telescopica\n");
		System.out.printf("¿Cuantos numeros desea calcular de la serie?: ");
		
		num = scan.nextInt();
		scan.close();
		double tim = System.currentTimeMillis();
		
		System.out.printf("\nEl resultado de la suma telescopica de %d numeros es: %.3f \n",num,ut.TelescopicSumIterative(num));	
		System.out.printf("\nY ha tardado %f\n",System.currentTimeMillis() - tim);
	}
}


