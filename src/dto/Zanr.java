package dto;

import java.io.Serializable;

public class Zanr implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idZanr;
	private String naziv;
	
	public int getIdZanr() {
		return idZanr;
	}
	public void setIdZanr(int idZanr) {
		this.idZanr = idZanr;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
}
