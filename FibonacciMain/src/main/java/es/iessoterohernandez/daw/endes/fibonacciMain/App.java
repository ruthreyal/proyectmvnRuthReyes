package es.iessoterohernandez.daw.endes.fibonacciMain;

import java.util.Scanner;

import es.iessoterohernandez.daw.endes.fibonacci.Fibonacci;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {        
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Introduce un número mayor que 1: ");
    	int num = sc.nextInt();
    	
        Fibonacci f = new Fibonacci(num);
    		System.out.println(f.fibonacci);
       
    }
}
