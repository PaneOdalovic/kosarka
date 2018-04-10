package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the igrac database table.
 * 
 */
@Entity
@NamedQuery(name="Igrac.findAll", query="SELECT i FROM Igrac i")
public class Igrac implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idigrac;

	@Column(name="broj_dresa")
	private int brojDresa;

	@Temporal(TemporalType.DATE)
	@Column(name="datum_otpustanja")
	private Date datumOtpustanja;

	@Temporal(TemporalType.DATE)
	@Column(name="datum_rodjenja")
	private Date datumRodjenja;

	@Temporal(TemporalType.DATE)
	@Column(name="datum_zaposljavanja")
	private Date datumZaposljavanja;

	@Column(name="ime_igraca")
	private String imeIgraca;

	@Column(name="prezime_igraca")
	private String prezimeIgraca;

	//bi-directional many-to-one association to Igra
	@OneToMany(mappedBy="igrac")
	private List<Igra> igras;

	public Igrac() {
	}

	public int getIdigrac() {
		return this.idigrac;
	}

	public void setIdigrac(int idigrac) {
		this.idigrac = idigrac;
	}

	public int getBrojDresa() {
		return this.brojDresa;
	}

	public void setBrojDresa(int brojDresa) {
		this.brojDresa = brojDresa;
	}

	public Date getDatumOtpustanja() {
		return this.datumOtpustanja;
	}

	public void setDatumOtpustanja(Date datumOtpustanja) {
		this.datumOtpustanja = datumOtpustanja;
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

	public String getImeIgraca() {
		return this.imeIgraca;
	}

	public void setImeIgraca(String imeIgraca) {
		this.imeIgraca = imeIgraca;
	}

	public String getPrezimeIgraca() {
		return this.prezimeIgraca;
	}

	public void setPrezimeIgraca(String prezimeIgraca) {
		this.prezimeIgraca = prezimeIgraca;
	}

	public List<Igra> getIgras() {
		return this.igras;
	}

	public void setIgras(List<Igra> igras) {
		this.igras = igras;
	}

	public Igra addIgra(Igra igra) {
		getIgras().add(igra);
		igra.setIgrac(this);

		return igra;
	}

	public Igra removeIgra(Igra igra) {
		getIgras().remove(igra);
		igra.setIgrac(null);

		return igra;
	}

}