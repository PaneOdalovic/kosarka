package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the korisnik database table.
 * 
 */
@Entity
@NamedQuery(name="Korisnik.findAll", query="SELECT k FROM Korisnik k")
public class Korisnik implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String username;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="datum_rodjenja")
	private Date datumRodjenja;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="datum_zaposljavanja")
	private Date datumZaposljavanja;

	private String ime;

	private String password;

	private String prezime;

	private String uloga;

	public Korisnik() {
	}

	public String getUsername() {
		return this.username;
	}
	
	public boolean getJeMenadzer(){
		if(uloga.equalsIgnoreCase("menadzer")){
			return true;
		}
		return false;
	}
	
	public boolean getJeTrener(){
		if(uloga.equalsIgnoreCase("trener")){
			return true;
		}
		return false;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getDatumRodjenja() {
		return this.datumRodjenja;
	}

	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public Date getDatumZaposljavanja() {
		return this.datumZaposljavanja;
	}

	public void setDatumZaposljavanja(Date datumZaposljavanja) {
		this.datumZaposljavanja = datumZaposljavanja;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrezime() {
		return this.prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getUloga() {
		return this.uloga;
	}

	public void setUloga(String uloga) {
		this.uloga = uloga;
	}

}