package fikt.inki.oop.z01;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String[] args) {
		List<String> gradovi = new ArrayList<>();
		
		gradovi.add("Kavadarci");
		gradovi.add("Bitola");
		gradovi.add("Skopje");
		gradovi.add("Strumica");
		gradovi.add("Ohrid");
		
		System.out.println("Elementite na listata se: " + gradovi);
	}
}


