package dto;

import java.io.Serializable;

public class Status implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idStatus;
	private String naziv;
	
	public int getIdStatus() {
		return idStatus;
	}
	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
}
