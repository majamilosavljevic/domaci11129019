package domaci_11292019;

public class Dete {

	/*
	 * Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da se
	 * kreira vise objekata klase Dete. Ako se pozove metoda dodajKlikere ili metoda
	 * oduzmiKlikere, broj klikera se azurira. Napraviti metodu koja ce ispisivati
	 * broj klikera i metodu koja ispisuje prosecan broj decjih godina(ako imamo
	 * troje dece, broj prosecnih godina za njih troje; ako imamo dvoje racunamo
	 * prosecne godine za to dvoje) .
	 */

	private String firstName;
	private String lastName;
	private int age;
	private int marbles;

	public Dete(String firstName, String lastName, int age, int marbles) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.marbles = marbles;
	}

	public void addMarbles(int marbles) {
		if (marbles > 0) {
			this.marbles += marbles;
		}
	}

	public void takeMarbles(int marbles) {
		if (marbles > 0) {
			this.marbles -= marbles;
		}
	}

	public int getMarbles() {
		return marbles;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

}
