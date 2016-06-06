package dto;

import java.io.Serializable;

public class Ocjena implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idOcjena;
	private double vrijednost;
	private int idKorisnik;
	private int idFilm;
	
	public int getIdOcjena() {
		return idOcjena;
	}
	public void setIdOcjena(int idOcjena) {
		this.idOcjena = idOcjena;
	}
	public double getVrijednost() {
		return vrijednost;
	}
	public void setVrijednost(double vrijednost) {
		this.vrijednost = vrijednost;
	}
	public int getIdKorisnik() {
		return idKorisnik;
	}
	public void setIdKorisnik(int idKorisnik) {
		this.idKorisnik = idKorisnik;
	}
	public int getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}
}
