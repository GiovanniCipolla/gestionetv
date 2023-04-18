package it.gestionetv.model;

public class Televisore {
	private Long idTelevisore;
	private String marca;
	private String modello;
	private Integer prezzo;
	private Integer numeroPollici;
	private String codice;
	
	public Televisore() {
		
	}

	public Televisore(String marca, String modello) {
		super();
		this.marca = marca;
		this.modello = modello;
	}

	public Televisore(String marca, String modello, Integer prezzo, Integer numeroPollici, String codice) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.numeroPollici = numeroPollici;
		this.codice = codice;
	}

	public Televisore(Long idTelevisore, String marca, String modello, Integer prezzo, Integer numeroPollici,
			String codice) {
		super();
		this.idTelevisore = idTelevisore;
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.numeroPollici = numeroPollici;
		this.codice = codice;
	}

	public Long getIdTelevisore() {
		return idTelevisore;
	}

	public void setIdTelevisore(Long idTelevisore) {
		this.idTelevisore = idTelevisore;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public Integer getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Integer prezzo) {
		this.prezzo = prezzo;
	}

	public Integer getNumeroPollici() {
		return numeroPollici;
	}

	public void setNumeroPollici(Integer numeroPollici) {
		this.numeroPollici = numeroPollici;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	
	
}