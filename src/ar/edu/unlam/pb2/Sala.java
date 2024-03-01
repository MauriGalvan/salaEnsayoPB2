package ar.edu.unlam.pb2;

public class Sala {
	
	private String nombre;
	private Double precioPorHora;


	public Sala(String nombre, Double precioPorHora) {
		this.nombre = nombre; 
		this.precioPorHora = precioPorHora;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getPrecioPorHora() {
		return precioPorHora;
	}


	public void setPrecioPorHora(Double precioPorHora) {
		this.precioPorHora = precioPorHora;
	}
	
}
