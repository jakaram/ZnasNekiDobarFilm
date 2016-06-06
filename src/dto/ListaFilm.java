package dto;

import java.io.Serializable;

public class ListaFilm implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idListaFilm;
	private int idListaOmiljenihFilmova;
	private int idKorisnik;
	
	public int getIdListaFilm() {
		return idListaFilm;
	}
	public void setIdListaFilm(int idListaFilm) {
		this.idListaFilm = idListaFilm;
	}
	public int getIdListaOmiljenihFilmova() {
		return idListaOmiljenihFilmova;
	}
	public void setIdListaOmiljenihFilmova(int idListaOmiljenihFilmova) {
		this.idListaOmiljenihFilmova = idListaOmiljenihFilmova;
	}
	public int getIdKorisnik() {
		return idKorisnik;
	}
	public void setIdKorisnik(int idKorisnik) {
		this.idKorisnik = idKorisnik;
	}
}
