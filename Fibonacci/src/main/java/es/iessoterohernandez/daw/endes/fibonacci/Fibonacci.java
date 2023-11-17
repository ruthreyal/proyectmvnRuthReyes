package es.iessoterohernandez.daw.endes.fibonacci;

/**
 * Hello world!
 *
 */
public class Fibonacci 
{
	public String fibonacci;
    	
	public Fibonacci (int n) {
            int n1 = 0;
            int n2 = 1;
            int aux;
            int limite = n;
            fibonacci= n1+" "+n2;


            while (n2 + n1 < limite) {
                aux = n1;
                n1 = n2;
                n2 = aux + n1;

                fibonacci=fibonacci+" "+n2;
                
            }
      }

	
}

