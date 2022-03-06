import java.util.Scanner;

public class Questao3 {
	public static void main(String args[]) { 
	    System.out.println("Questão 3 ");

	    Scanner dado= new Scanner(System.in);

	     System.out.println("Digite o texto:"); 
	     String  texto=dado.nextLine();
	      texto=texto.replace(" ","");


	       double raizquadrada;
	      raizquadrada=Math.sqrt(texto.length());

	    int raiz;
	    
	      raiz=(int) Math.round(raizquadrada);
	    
	      String [][] vetor= new String[raiz][raiz]; 
	    
	        int aux=0;
	    
	      for (int l=0;l<vetor.length;l++){
	        for(int c=0;c<vetor[l].length;c++){
	          if(aux<texto.length()){
	          vetor[l][c]=texto.substring(aux,aux+1);
	              aux++;  
	            }
	          
	        }
	         
	            
	      } 
	          texto="";
	           

	           for (int c=0;c<vetor.length;c++){
	               for(int l=0;l<vetor[c].length;l++){
	                     if(vetor[l][c]!=null){
	                       texto=texto+vetor[l][c]; 
	                     }
	            } 
	             
	                texto=texto+" ";   
	          
	        }

	            System.out.println("\n\n"+texto);
	    
	      }

}
