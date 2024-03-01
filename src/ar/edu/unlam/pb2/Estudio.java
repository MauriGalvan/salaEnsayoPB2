package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Estudio {
	
	private String nombre;
	private Set<Sala> salas; 
	private Set<Artista> artistas;
	private Set<Alquiler> alquileres;

	
	public Estudio(String string) {
		this.nombre = string;
		this.salas = new HashSet<Sala>();
		this.artistas = new HashSet<Artista>();
		this.alquileres = new HashSet<Alquiler>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarSala(Sala sala)  {
		salas.add(sala);
		
	}
	s
    
	

	public Sala buscarSala(String nombreSala) throws SalaNoEncontrada {
		for (Sala sala : salas) 
			if(sala.getNombre().equals(nombreSala))
				return sala;
		
		throw new SalaNoEncontrada();
	}

	public void agregarArtista(Artista artista) {
		artistas.add(artista);
		
	}

	public Artista buscarArtista(Integer dni) throws ArtistaNoEncontrado {
		for (Artista artista : artistas) 
			if(artista.getDni().equals(dni))
				return artista;
		
		throw new ArtistaNoEncontrado();
	}
	


	public Integer alquilarSala(Artista actor, Sala sala, Double horas) throws ArtistaNoEncontrado, SalaNoEncontrada {
		Artista artista = buscarArtista(actor.getDni());
		Sala salon = buscarSala(sala.getNombre());
		Double hora = horas;
		Integer nroAlquiler = generarNroAlquiler();

		//Alquiler alquiler = new Alquiler(nroAlquiler, )
		//alquileres.add(alquiler);	
		return nroAlquiler;
	
		
	}



		

		

	private Integer generarNroAlquiler() {
		
		return alquileres.size()+1;
	}

	public Integer getCantidadArtistas() {
		// TODO Auto-generated method stub
		return artistas.size();
	}

	public Integer getCantidadSalas() {
		// TODO Auto-generated method stub
		return salas.size();
	}

	public void agregarAlquiler(Alquiler alquiler)  {
	
		alquileres.add(alquiler);
		
	}


	public Object getCantidadAlquilerAlquilados() {
		// TODO Auto-generated method stub
		return alquileres.size();
	}

	
	
		
	
	
	
	
}
