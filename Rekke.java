package no.hvl.dat100;

public class Rekke {

	public static void main(String[] args) {
		
		String tallStreng = javax.swing.JOptionPane.showInputDialog("Skriv et heltall");
		int n = Integer.parseInt(tallStreng);
		
		for(int i = n - 1; i > 0; i--) {
			n += i;
			}
		
		String visTall = ("Summen er: " + n);
		javax.swing.JOptionPane.showMessageDialog(null, visTall);
		
		}
	}


