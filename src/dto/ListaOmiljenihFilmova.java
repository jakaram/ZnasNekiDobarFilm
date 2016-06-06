package dto;

import java.io.Serializable;

public class ListaOmiljenihFilmova implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idListaOmiljenihFilmova;
	private String naziv;
	private int idKorisnik;
	
	public int getIdListaOmiljenihFilmova() {
		return idListaOmiljenihFilmova;
	}
	public void setIdListaOmiljenihFilmova(int idListaOmiljenihFilmova) {
		this.idListaOmiljenihFilmova = idListaOmiljenihFilmova;
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
