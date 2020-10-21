import java.util.Arrays;
import java.util.Scanner; 
import java.util.Random;

public class MiniOpdracht7 {
/* TIJD VOOR LINGO!
Werk het basisprincipe van Lingo uit.
Maak in de code een vast woord aan. Bijvoorbeeld fiets.
Het programma geeft dan aan dat het woord 5 letters heeft door 5 streepjes _ _ _ _ _
Via de scanner kan ik het woord proberen te raden.
Als je op enter klikt dan verschijnt een uitslag-code in een alert.
0 = fout
1 = juiste letter foute plaats (Geel in Lingo)
2 = juiste letter juiste plaats (Paars in Lingo)
Friet geeft dus 20111
Frans geeft dus 20002

 */
	
	public static void main(String[] args){
		
		// Maak woord aan en 5 streepjes
		String woord = "fiets"; 
		char woordRaden[]=woord.toCharArray(); 
		for (int i=0; i<woordRaden.length; i++) {
			System.out.print(woordRaden[i] = '-');
		}
		
		// Maak scanner aan
		Scanner invoeren = new Scanner(System.in); 
		System.out.printf("%n"); //Enter?!
		System.out.println("Raad het woord hieronder:");
		String invoerWoord = invoeren.nextLine(); //Lezen invoer scanner 
		char invoerGok[]=invoerWoord.toCharArray(); 
		
		
		 // Loop voor checken
		
		
		//System.out.println(Result);
		
		for (int i=0; i<woordRaden.length; i++) {
			
			if (Result==0) { 
				System.out.print("Je hebt het woord geraden");
			}
			else if (Result<0) { 
				System.out.print("0");
				
			}
			else if (Result>0) {
				System.out.print("2");
			}
		
			
		
		} 
	}


	
}


}
	
		
		  
          
	}
	
	




