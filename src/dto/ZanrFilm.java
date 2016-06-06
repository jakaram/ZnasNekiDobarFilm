package dto;

import java.io.Serializable;

public class ZanrFilm implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idZanrFilm;
	private int idZanr;
	private int idFilm;
	
	public int getIdZanrFilm() {
		return idZanrFilm;
	}
	public void setIdZanrFilm(int idZanrFilm) {
		this.idZanrFilm = idZanrFilm;
	}
	public int getIdZanr() {
		return idZanr;
	}
	public void setIdZanr(int idZanr) {
		this.idZanr = idZanr;
	}
	public int getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}
	
}
