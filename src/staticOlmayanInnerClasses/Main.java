package staticOlmayanInnerClasses;

public class Main {

	public static void main(String[] args) {
		Matematik.Factoriel faktoriyel = new Matematik().new Factoriel();
		faktoriyel.faktoriyel();
		Matematik.Asal asal = new Matematik().new Asal();
		System.out.println(asal.asal_Mý(55));
		Matematik.Alan.Daire alan = new Matematik().new Alan().new Daire();
		alan.DaireAlan(2);
		

	}

}
