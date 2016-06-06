package dto;

import java.io.Serializable;

public class Galerija implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idGalerija;
	private String naziv;
	private int idKorisnik;
	
	public int getIdGalerija() {
		return idGalerija;
	}
	public void setIdGalerija(int idGalerija) {
		this.idGalerija = idGalerija;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getIdKorisnik() {
		return idKorisnik;
	}
	public void setIdKorisnik(int idKorisnik) {
		this.idKorisnik = idKorisnik;
	}
}
