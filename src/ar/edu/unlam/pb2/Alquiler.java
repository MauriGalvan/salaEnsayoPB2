package ar.edu.unlam.pb2;

public class Alquiler {
	
	private Integer nroAlquiler;
	private Artista artista;
	private Sala sala;
	private Double horas;
	private Boolean activo;
	
	
	
	public Alquiler(Integer nroAlquiler, Artista artista, Sala sala, Double horas) {
		this.nroAlquiler = nroAlquiler;
		this.artista = artista;
		this.sala = sala;
		this.horas = horas;
		this.activo = true;
	}
	
	public Alquiler() {
		// TODO Auto-generated constructor stub
	}

	public Integer getNroAlquiler() {
		return nroAlquiler;
	}

	public void setNroAlquiler(Integer nroAlquiler) {
		this.nroAlquiler = nroAlquiler;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Double getHoras() {
		return horas;
	}

	public void setHoras(Double horas) {
		this.horas = horas;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Boolean isActivo() {
		return activo;
	}

	
	
	
	

}
