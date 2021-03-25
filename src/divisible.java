import java.util.*;
public class divisible{
public static void main(String args[])
{	 
	int numero1,numero2;
	Scanner reader = new Scanner (System.in);
	
	
	
	System.out.println("Introduce un número");
	numero1 = reader.nextInt();
	 
	System.out.println("Introduce el número por el cual quieres saber si es divisible");
	numero2 = reader.nextInt();

	if (numero1%numero2 == 0){
		  System.out.println(numero1+ " es divisible por " +numero2);
}else{
		  System.out.println(numero1+ " NO es divisible por " +numero2);
}
}
}