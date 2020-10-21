import java.util.Arrays;
import java.util.Scanner; 
import java.util.Random;


public class MiniOpdracht6 {
/* 
ZET DE LETTERS OP VOLGORDE
Als gebruiker mag ik een String invoeren. Dit doe ik via de Scanner.
De String wordt getoond.
Daarna worden alle letters uit de String getoond in alfabetische volgorde.
*/
	
	   public static void main(String[] args){
		  Scanner invoeren = new Scanner(System.in); //maken scanner
		  System.out.println("Vul letters in");
		  
		  String invoerLetters = invoeren.nextLine(); //lezen invoer letters
		  
		  System.out.println("De letters zijn: " + invoerLetters);
		  char volgorde[]=invoerLetters.toCharArray();
		  Arrays.sort(volgorde);
		  System.out.println("En dan nu op alfabetische volgorde: " + new String(volgorde));
	   }
}

