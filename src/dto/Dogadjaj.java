package dto;

import java.io.Serializable;
import java.util.Date;

public class Dogadjaj implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idDogadjaj;
	private Date datumObjave;
	private Date datumOdrzavanja;
	private String naziv;
	private String lokacija;
	private int idKorisnik;
	
	public int getIdDogadjaj() {
		return idDogadjaj;
	}
	public void setIdDogadjaj(int idDogadjaj) {
		this.idDogadjaj = idDogadjaj;
	}
	public Date getDatumObjave() {
		return datumObjave;
	}
	public void setDatumObjave(Date datumObjave) {
		this.datumObjave = datumObjave;
	}
	public Date getDatumOdrzavanja() {
		return datumOdrzavanja;
	}
	public void setDatumOdrzavanja(Date datumOdrzavanja) {
		this.datumOdrzavanja = datumOdrzavanja;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getLokacija() {
		return lokacija;
	}
	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}
	public int getIdKorisnik() {
		return idKorisnik;
	}
	public void setIdKorisnik(int idKorisnik) {
		this.idKorisnik = idKorisnik;
	}
}
