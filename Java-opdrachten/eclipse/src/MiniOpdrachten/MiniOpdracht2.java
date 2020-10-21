
public class MiniOpdracht2 {
	// HOEVEEL E'S?
		//Tel het aantal keer dat de letter "e" in een gegeven string voorkomt.
		//Voorbeeld: "regenen" heeft 3 keer de letter "e".
		//Tip!: gebruik de methode charAt(int index) icm een for-loop.
	
	public static void main(String[] args){
		String naam = "Sterre Keizer";
		// int check = naam.length(); = 13
		// System.out.println(check);
		int counter = 0; 
		
		for (int i=0; i <= naam.length() -1; i++) { // -1 omdat index start op 0
			if (naam.charAt(i) == 'e'){
				counter++;
	
			} 
		}
	System.out.println(naam + " heeft " + counter + " keer de e in haar naam");	
	}
	
}