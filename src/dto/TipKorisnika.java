package dto;

import java.io.Serializable;

public class TipKorisnika implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idTipKorisnika;
	private String naziv;
	
	public int getIdTipKorisnika() {
		return idTipKorisnika;
	}
	public void setIdTipKorisnika(int idTipKorisnika) {
		this.idTipKorisnika = idTipKorisnika;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
}
