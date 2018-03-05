import java.util.Random;

public class LZespolona {
	
	public int rzeczywista;
	public int urojona;
	
	public LZespolona(int a,int b) {
		
		rzeczywista = a;
		urojona = b;
		
	}
	public LZespolona() {                  
		Random rand = new Random();     //wykorzystanie metody z klasy Random
		rzeczywista = rand.nextInt(6); //losowanie liczb ca³kowitych od 0 do 5
		urojona = rand.nextInt(6);
	}
	
public double modul() {

	int a = this.rzeczywista*this.rzeczywista;
    int b = this.urojona*this.urojona;
    return Math.sqrt(a+b);                 //pierwiastkowanie z biblioteki Math
	
}

public LZespolona dodawanie(LZespolona z) {
	LZespolona wynik = new LZespolona();
	wynik.rzeczywista = this.rzeczywista + z.rzeczywista;
	wynik.urojona = this.urojona + z.urojona;
	
	return wynik;
	
}

public LZespolona odejmowanie(LZespolona z) {
	LZespolona wynik = new LZespolona();
	wynik.rzeczywista = this.rzeczywista - z.rzeczywista;
	wynik.urojona = this.urojona - z.urojona;
	
	return wynik;
}


public LZespolona mnozenie(LZespolona z) {
	LZespolona wynik = new LZespolona();
	wynik.rzeczywista = this.rzeczywista * z.rzeczywista;
	wynik.urojona = this.urojona * z.urojona;
	
	return wynik;
}

public void wyswietl() {
	if(this.urojona < 0) {
		System.out.println("Liczba zespolona to: " + this.rzeczywista + this.urojona + "i");
	}
	else
	System.out.println("Liczba zespolona to: " + this.rzeczywista + "+" + this.urojona +"i" );
} 

public void sprzezenie(){
     this.urojona = (-1*this.urojona);
}
        public static void main(String[] args) {
		// TODO Auto-generated method stub
LZespolona raz = new LZespolona();
LZespolona dwa = new LZespolona();
LZespolona wynik = new LZespolona (0,0);
wynik = raz.dodawanie(dwa);
//raz.wyswietl();
//dwa.wyswietl();
//wynik.wyswietl();
wynik = raz.odejmowanie(dwa);
//wynik.wyswietl();
wynik = raz.mnozenie(dwa);
//wynik.wyswietl();
raz.modul();
//wynik.wyswietl();
raz.sprzezenie();
//wynik.wyswietl();
        	
LZespolona [] tablica = new LZespolona [3];
for (int i = 0; i < 3; i++) {
	tablica[i] = new LZespolona();
}
tablica[1].wyswietl();
        	
	}

}
