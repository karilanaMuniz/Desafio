import java.util.Scanner;

public class questao1 {
	public static void main(String args[]) { 
	    Scanner sc= new Scanner(System.in);
	    
	    System.out.println("Questão 1 "); 
	    int [] arr= new int [5];
	        System.out.println("Digite 5 numeros inteiros:\n ");
	    
	  for(int i=0; i<5;i++){
	    System.out.println("\nDigite "+(i+1)+"º numeros:\n ");
	   arr[i]=sc.nextInt();

	      }

	      System.out.println("Lista de numeros digitados:");
	    for(int i=0; i<5;i++){
	   System.out.println("Numero:"+arr[i]);
	       }
	    double soma=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
	      
	    double mediana= (soma/5); 
	  
	          mediana=Math.round(mediana); 
	    System.out.println("Mediana dos numero digitados: "+mediana);   
	       }
}
