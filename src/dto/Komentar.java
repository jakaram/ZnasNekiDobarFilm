package dto;

import java.io.Serializable;
import java.util.Date;

public class Komentar implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idKomentar;
	private String vrijednost;
	private Date datum;
	private int idKorisnik;
	private int idFilm;
	private int idStatus;
	
	public int getIdKomentar() {
		return idKomentar;
	}
	public void setIdKomentar(int idKomentar) {
		this.idKomentar = idKomentar;
	}
	public String getVrijednost() {
		return vrijednost;
	}
	public void setVrijednost(String vrijednost) {
		this.vrijednost = vrijednost;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
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
	public int getIdStatus() {
		return idStatus;
	}
	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}
}
