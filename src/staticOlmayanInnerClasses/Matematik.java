package staticOlmayanInnerClasses;

import java.util.Scanner;

public class Matematik {
	private double PI=Math.PI;
	
	Scanner scan = new Scanner(System.in);
	public class Factoriel{
		public void faktoriyel() {
			
				System.out.print("Bir say� giriniz: ");
				int say� = scan.nextInt();
				scan.nextLine();
				int fac=1;
				for(int i=1;i<=say�;i++) {
					fac*=i;
				}
				System.out.println("Faktoriyel: " + fac);
		}
	}
	public class Asal{
		public boolean asal_M�(int sayi) {
			int i =2;
			while(i<sayi) {
				if(sayi % i == 0) {
					return false;
				}
				i++;	
			}
			return true;
		}
	}
	public class Alan{
		public class Daire{
		  public void DaireAlan(int yar�cap) {
			System.out.println("Dairenin alan�: " + (yar�cap*yar�cap*PI));
		}
	}

	}
}
