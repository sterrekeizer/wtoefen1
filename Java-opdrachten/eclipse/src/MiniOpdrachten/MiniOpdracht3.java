
public class MiniOpdracht3 {
		// TEL HET ARRAY OP
		//Berekend de som van alle array elementen.
		//Voorbeeld: voor een gegeven array {1, 2, 3, 4} wordt de som hiervan: 1 + 2 + 3 + 4 = 10
		//Tip: Gebruik een for-loop.
	public static void main(String[] args){
		int[] getallen; //declareren array
		getallen = new int[] { 1,2,3,4,5}; //toekennen
		int sum =0;
		
		for (int i = 0; i < getallen.length; i++) {
			System.out.println("Element at index " + i + " : "+ getallen[i]);
			sum = sum + getallen[i];
		}
	System.out.println("De som van de array is: " + sum);		
	}
}
