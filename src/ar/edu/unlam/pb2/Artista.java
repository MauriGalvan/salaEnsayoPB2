package ar.edu.unlam.pb2;

import java.util.Objects;



public abstract class Artista {
	
	private Integer dni;
	private String nombre;
	
	
	public Artista(Integer dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	


	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artista other = (Artista) obj;
		return Objects.equals(dni, other.dni);
	}

}
