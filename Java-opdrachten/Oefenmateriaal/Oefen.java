class Main{
    public static void main(String[] args){
        System.out.println("Sterregestart");
        System.out.println("We beginnen");
        int getal; 
        String woord;
        Beker mok1;
        new Beker (); //maken daadwerkelijke beker
        Beker mok2 = new Beker();
        mok2.kleur = "groen";
        mok2.inhoud = 66; 
        System.out.println(mok2.kleur);
        mok2.drinken();
        mok2.kopen("Hema");
        Koffiezetapparaat kz = new Koffiezetapparaat();
        kz.koffiezetten(mok2);
        kz.bekertjeGeven().drinken();

// returntype geen void is DAN mag je de aanroep van een methode VERVANGEN door dat wat hij returned;
// parameter
// returntype
// parameter ref type
// returntype ref type
// field aan te roepen

// Zelf oefen
        Auto twingo = new Auto();
        twingo.Kleur = "rood";
        twingo.benoemenkleur();

    }

}

class Koffiezetapparaat{
    void koffiezetten(Beker beker){
        System.out.println("hij doet het" + beker.kleur);
    }
    Beker bekertjeGeven(){
        Beker bekertje = new Beker();
        bekertje.kleur = "paars";
        return bekertje;
    }
}

class Beker {
    String kleur; 
    int inhoud; 
    void drinken(){
        System.out.println("de beker wordt leeggedronken");
    }
    void kopen(String winkel){ //parameter
        System.out.println("Ik ga een mok kopen bij de " + winkel);
        System.out.println("De kleur van de mok is " + kleur);

    }
    int inhoudbenoemen(){ // Je gaat iets terugroepen
        System.out.println("Ik ben inhoud aan het benoemen");
        return 6;
    }

}

class Auto {
    String Merk; 
    String Kleur; 
    int Snelheid; 

    void benoemenkleur(){ 
        System.out.println("De auto heeft de kleur: " + Kleur);
    }

}
