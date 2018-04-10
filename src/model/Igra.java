package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the igra database table.
 * 
 */
@Entity
@NamedQuery(name="Igra.findAll", query="SELECT i FROM Igra i")
public class Igra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int brojPoena;

	private byte prvaPetorka;

	//bi-directional many-to-one association to Igrac
	@ManyToOne
	@JoinColumn(name="idigraca")
	private Igrac igrac;

	//bi-directional many-to-one association to Utakmica
	@ManyToOne
	@JoinColumn(name="idutakmice")
	private Utakmica utakmica;

	public Igra() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBrojPoena() {
		return this.brojPoena;
	}

	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}

	public byte getPrvaPetorka() {
		return this.prvaPetorka;
	}

	public void setPrvaPetorka(byte prvaPetorka) {
		this.prvaPetorka = prvaPetorka;
	}

	public Igrac getIgrac() {
		return this.igrac;
	}

	public void setIgrac(Igrac igrac) {
		this.igrac = igrac;
	}

	public Utakmica getUtakmica() {
		return this.utakmica;
	}

	public void setUtakmica(Utakmica utakmica) {
		this.utakmica = utakmica;
	}

}