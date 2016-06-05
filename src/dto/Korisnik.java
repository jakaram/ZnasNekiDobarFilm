package dto;

import java.io.Serializable;

public class Korisnik implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idKorisnik;
	private String ime;
	private String prezime;
	private String jmb;
	private String email;
	private String slika;
	private String korisnickoIme;
	private String lozinka;
	private int idTipKorisnika;
	
	public int getIdKorisnik() {
		return idKorisnik;
	}
	public void setIdKorisnik(int idKorisnik) {
		this.idKorisnik = idKorisnik;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getJmb() {
		return jmb;
	}
	public void setJmb(String jmb) {
		this.jmb = jmb;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSlika() {
		return slika;
	}
	public void setSlika(String slika) {
		this.slika = slika;
	}
	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}
	public String getLozinka() {
		return lozinka;
	}
	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}
	public int getIdTipKorisnika() {
		return idTipKorisnika;
	}
	public void setIdTipKorisnika(int idTipKorisnika) {
		this.idTipKorisnika = idTipKorisnika;
	}
}
