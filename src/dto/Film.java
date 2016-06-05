package dto;

import java.io.Serializable;
import java.util.Date;

public class Film implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idFilm;
	private String naziv;
	private Date datumObjavljivanja;
	private String kratakSadrzaj;
	private String youtubeLink;
	private String videoFajl;
	private String vrijemeTrajanja;
	private double ocjena;
	
	public int getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Date getDatumObjavljivanja() {
		return datumObjavljivanja;
	}
	public void setDatumObjavljivanja(Date datumObjavljivanja) {
		this.datumObjavljivanja = datumObjavljivanja;
	}
	public String getKratakSadrzaj() {
		return kratakSadrzaj;
	}
	public void setKratakSadrzaj(String kratakSadrzaj) {
		this.kratakSadrzaj = kratakSadrzaj;
	}
	public String getYoutubeLink() {
		return youtubeLink;
	}
	public void setYoutubeLink(String youtubeLink) {
		this.youtubeLink = youtubeLink;
	}
	public String getVideoFajl() {
		return videoFajl;
	}
	public void setVideoFajl(String videoFajl) {
		this.videoFajl = videoFajl;
	}
	public String getVrijemeTrajanja() {
		return vrijemeTrajanja;
	}
	public void setVrijemeTrajanja(String vrijemeTrajanja) {
		this.vrijemeTrajanja = vrijemeTrajanja;
	}
	public double getOcjena() {
		return ocjena;
	}
	public void setOcjena(double ocjena) {
		this.ocjena = ocjena;
	}
}
