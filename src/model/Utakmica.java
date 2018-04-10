package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the utakmica database table.
 * 
 */
@Entity
@NamedQuery(name="Utakmica.findAll", query="SELECT u FROM Utakmica u")
public class Utakmica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idutakmica;

	private int broj_Igraca;

	@Column(name="broj_igraca_prva_petorka")
	private int brojIgracaPrvaPetorka;

	@Column(name="broj_orimljenih_poena")
	private int brojOrimljenihPoena;

	@Column(name="broj_postignutih_poena")
	private int brojPostignutihPoena;

	@Column(name="broj_unetih_igraca")
	private int brojUnetihIgraca;

	@Temporal(TemporalType.DATE)
	@Column(name="datum_odrzavanja")
	private Date datumOdrzavanja;

	@Column(name="mesto_odrzavanje")
	private String mestoOdrzavanje;

	private byte odigrana;

	@Column(name="protivnick_klub")
	private String protivnickKlub;

	//bi-directional many-to-one association to Igra
	@OneToMany(mappedBy="utakmica")
	private List<Igra> igras;

	public Utakmica() {
	}

	public int getIdutakmica() {
		return this.idutakmica;
	}

	public void setIdutakmica(int idutakmica) {
		this.idutakmica = idutakmica;
	}

	public int getBroj_Igraca() {
		return this.broj_Igraca;
	}

	public void setBroj_Igraca(int broj_Igraca) {
		this.broj_Igraca = broj_Igraca;
	}

	public int getBrojIgracaPrvaPetorka() {
		return this.brojIgracaPrvaPetorka;
	}

	public void setBrojIgracaPrvaPetorka(int brojIgracaPrvaPetorka) {
		this.brojIgracaPrvaPetorka = brojIgracaPrvaPetorka;
	}

	public int getBrojOrimljenihPoena() {
		return this.brojOrimljenihPoena;
	}

	public void setBrojOrimljenihPoena(int brojOrimljenihPoena) {
		this.brojOrimljenihPoena = brojOrimljenihPoena;
	}

	public int getBrojPostignutihPoena() {
		return this.brojPostignutihPoena;
	}

	public void setBrojPostignutihPoena(int brojPostignutihPoena) {
		this.brojPostignutihPoena = brojPostignutihPoena;
	}

	public int getBrojUnetihIgraca() {
		return this.brojUnetihIgraca;
	}

	public void setBrojUnetihIgraca(int brojUnetihIgraca) {
		this.brojUnetihIgraca = brojUnetihIgraca;
	}

	public Date getDatumOdrzavanja() {
		return this.datumOdrzavanja;
	}

	public void setDatumOdrzavanja(Date datumOdrzavanja) {
		this.datumOdrzavanja = datumOdrzavanja;
	}

	public String getMestoOdrzavanje() {
		return this.mestoOdrzavanje;
	}

	public void setMestoOdrzavanje(String mestoOdrzavanje) {
		this.mestoOdrzavanje = mestoOdrzavanje;
	}

	public byte getOdigrana() {
		return this.odigrana;
	}

	public void setOdigrana(byte odigrana) {
		this.odigrana = odigrana;
	}

	public String getProtivnickKlub() {
		return this.protivnickKlub;
	}

	public void setProtivnickKlub(String protivnickKlub) {
		this.protivnickKlub = protivnickKlub;
	}

	public List<Igra> getIgras() {
		return this.igras;
	}

	public void setIgras(List<Igra> igras) {
		this.igras = igras;
	}

	public Igra addIgra(Igra igra) {
		getIgras().add(igra);
		igra.setUtakmica(this);

		return igra;
	}

	public Igra removeIgra(Igra igra) {
		getIgras().remove(igra);
		igra.setUtakmica(null);

		return igra;
	}

}