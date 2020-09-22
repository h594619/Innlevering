package no.hvl.dat100;

public class Trinnskatt {

	public static void main(String[] args) {

	
		String tallStreng = javax.swing.JOptionPane.showInputDialog("Skriv lønn");
		int brutto = Integer.parseInt(tallStreng);
		double nettoLonn = 0.0;
		double bruttoD = (double) brutto;
		double rekning;
		
		if (brutto <= 164100) {
			nettoLonn = bruttoD;
		}
		else if (brutto >= 164101 && brutto <= 230950){
			rekning = bruttoD - ((bruttoD * 0.93)/100);
			nettoLonn = rekning;
		}
		else if (brutto >= 230951 && brutto <= 580650){
			rekning = bruttoD - ((bruttoD * 2.14)/100);
			nettoLonn = rekning;
		}
		else if (brutto >= 580651 && brutto <= 934050){
			rekning = bruttoD - ((bruttoD * 11.52)/100);
			nettoLonn = rekning;
		}
		else if (brutto >= 934051){
			rekning = bruttoD - ((bruttoD * 14.52)/100);
			nettoLonn = rekning;
		}
		String lonn = ("Nettolønna er: " + nettoLonn + "kr.");
		javax.swing.JOptionPane.showMessageDialog(null, lonn);
	}

}
