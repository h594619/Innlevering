package no.hvl.dat100;

public class KarakterSjekk {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			String tallStreng = javax.swing.JOptionPane.showInputDialog("Skriv poengsum");
			int poeng = Integer.parseInt(tallStreng);
			String karakter;
			
			if (poeng <= 100 && poeng >= 90) {
				karakter = "A";
			}
			else if (poeng <= 89 && poeng >= 80) {
				karakter = "B";
			}
			else if (poeng <= 79 && poeng >= 60) {
				karakter = "C";
			}
			else if (poeng <= 59 && poeng >= 50) {
				karakter = "D";
			}
			else if (poeng <= 49 && poeng >= 40) {
				karakter = "E";
			}
			else if (poeng <= 39 && poeng >= 0) {
				karakter = "F";
			}
			else {
				karakter = "Poengsum ikkje gyldig, skriv poengsum på nytt";
				i--;
			}
			javax.swing.JOptionPane.showMessageDialog(null, karakter);
		}
		
	}
}
