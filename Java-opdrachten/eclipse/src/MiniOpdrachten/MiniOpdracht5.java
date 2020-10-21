import java.util.Arrays; 

public class  MiniOpdracht5 {
/* 	REPAREER DE AUTO
Maak twee klassen aan: Monteur en Auto.
De auto heeft booleans voor 4 kapotte onderdelen.
In de constructor bepaal je met behulp van een array aan booleans welke onderdelen kapot zijn en niet.
De toString methode toont je welke onderdelen kapot en niet kapot zijn. Het gaat om de onderdelen.
- boolean motor;
- boolean deur;
- boolean voorruit;
- boolean uitlaat;

De monteur loopt deze booleans af en repareert ze.
Het repareren heeft een prijs: elk onderdeel dat is gerepareerd kost 25 euro extra.
*/ 
	
	public static void main(String[] args){ 
		Auto renault = new Auto(false, false, false, false);
		Monteur jan = new Monteur(); 
		jan.repareren(renault); 
		
		System.out.println("The array is:");
		//for (boolean value : renault) {
			
		}
		
		}
	

	class Monteur{
		void repareren(Auto renault){
			System.out.println("hij doet het");
		}
		
	}
	
	class Auto{ 
		boolean AccuKapot;
		boolean VersnellingsbakKapot;
		boolean MotorKapot;
		boolean StarmotorKapot;
		Auto(boolean accuK, boolean versnellingsbakK,boolean motorK, boolean startmotorK){
			AccuKapot = accuK; 
			VersnellingsbakKapot = versnellingsbakK; 
			MotorKapot = motorK;
			StarmotorKapot = startmotorK;
		} 
		
	}
