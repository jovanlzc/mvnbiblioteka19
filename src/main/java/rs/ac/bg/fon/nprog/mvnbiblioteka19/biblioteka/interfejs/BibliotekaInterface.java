package rs.ac.bg.fon.nprog.mvnbiblioteka19.biblioteka.interfejs;

import java.util.List;

import rs.ac.bg.fon.nprog.mvnbiblioteka19.biblioteka.Autor;
import rs.ac.bg.fon.nprog.mvnbiblioteka19.biblioteka.Knjiga;

public interface BibliotekaInterface {
	
	public void dodajKnjigu(Knjiga k);
	
	public void obrisiKnjigu(Knjiga k);
	
	public List<Knjiga> vratiSveKnjige();
	
	public List<Knjiga> pronadjiKnjigu(Autor autor, String isbn, 
			String naslov, String izdavac);
	
}

