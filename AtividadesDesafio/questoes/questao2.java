import java.util.Scanner;

public class questao2 {
	public static void main(String args[]) { 
	    System.out.println(" Questão 2 "); 

	    Scanner dados= new Scanner(System.in);
	   
	    System.out.println("Digite o tamanho do vetor:");
	    int tamanho= dados.nextInt();
	    
	    int [] vetor= new int[tamanho];

	    System.out.println("\nUsuario agora vai digita os dados do vetor:\n");

	      for(int i =0; i<vetor.length; i++){

	        System.out.println("Digite o numero  de N"+(i+1));
	          vetor[i]=dados.nextInt();
	        
	      }

	    System.out.println("Digite um nummero X inteiro:");
	   
	     int x = dados.nextInt();
	     int aux=tamanho;
	     int quantidade=0;
	        for( int i=0;i<vetor.length; ){
	        	for(aux=0; aux<vetor.length; aux++){
	        		if(i!=aux) {
               if(vetor[i]-vetor[aux]==x)	{	 
                    	   quantidade++;
                 }
	              	} 
            }  
	               i++;
	          
	        }
	    System.out.println("\nQuantos pares de inteiros foram formado com os numeros digitados:"+quantidade);
	    System.out.println("\nFim do progrma.....\n");
	  } 
}
