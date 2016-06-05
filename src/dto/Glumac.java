package dto;

import java.io.Serializable;

public class Glumac implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idGlumac;
	private String naziv;
	
	public int getIdGlumac() {
		return idGlumac;
	}
	public void setIdGlumac(int idGlumac) {
		this.idGlumac = idGlumac;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
}
