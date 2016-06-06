package dto;

import java.io.Serializable;

public class GlumacFilm implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idGlumacFilm;
	private int idGlumac;
	private int idFilm;
	
	public int getIdGlumacFilm() {
		return idGlumacFilm;
	}
	public void setIdGlumacFilm(int idGlumacFilm) {
		this.idGlumacFilm = idGlumacFilm;
	}
	public int getIdGlumac() {
		return idGlumac;
	}
	public void setIdGlumac(int idGlumac) {
		this.idGlumac = idGlumac;
	}
	public int getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}
}
