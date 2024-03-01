package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
public class test {

	@Test
	public void queSePuedaAgregarUnaSalaDeTeatro() throws SalaNoEncontrada {
		Estudio estudio = new Estudio("Estudio UNLaM");

		String nombreSala = "Sala 1";
		Sala salaTeatro = new SalaTeatro(nombreSala, 2.2);
		estudio.agregarSala(salaTeatro);
		
		Sala salaEsperada = estudio.buscarSala("Sala 1");
				
		assertEquals(salaEsperada, salaTeatro);

	}
	
	@Test
	public void queSePuedaAgregarUnaSalaDeBanda() throws SalaNoEncontrada {
		Estudio estudio = new Estudio("Estudio UNLaM");

		String nombreSala = "Sala 2";
		Sala salaBanda = new SalaBanda(nombreSala,200.0);
		estudio.agregarSala(salaBanda);
		
		Sala salaEsperada = estudio.buscarSala(nombreSala);
				
		assertEquals(salaEsperada, salaBanda);
	}
	
	@Test
	public void queSePuedaDarDeAltaUnActor() throws ArtistaNoEncontrado {
		Estudio estudio = new Estudio("Estudio UNLaM");
		
		Integer dni = 123;
		Artista actor = new Actor(dni, "Pedro");
		estudio.agregarArtista(actor);
		
		Artista actorEsperado = estudio.buscarArtista(dni);
		
		assertEquals(actorEsperado, actor);
		
	}
	
	@Test
	public void queSePuedaDarDeAltaUnMusico() throws ArtistaNoEncontrado {
		Estudio estudio = new Estudio("Estudio UNLaM");
		
		
		Integer dni = 1234;
		Artista musico = new Musico(dni, "Juan");
		estudio.agregarArtista(musico);
		
		Artista musicoEsperado = estudio.buscarArtista(dni);
		
		assertEquals(musicoEsperado, musico);
		
	}
	
	//salas son iguales cuando tienen el mismo nombre, 2 artistas son iguales cuando tienen el mismo dni
	
	@Test
	public void queNoSePuedaAgregarUnaSalaDuplicada() {
		Estudio estudio = new Estudio("Estudio UNLaM");
		
		Sala salaTeatro1 = new SalaTeatro("sala 1", 2.2);
		Sala salaTeatro2 = new SalaTeatro("sala 1", 2.2);
		
		estudio.agregarSala(salaTeatro1);
		estudio.agregarSala(salaTeatro2);
		
		assertEquals((Integer) 1, estudio.getCantidadSalas());
		
	}
	


	 
	@Test
	public void queNoSePuedaAgregarUnaArtistaDuplicado() {
		Estudio estudio = new Estudio("Estudio Unlam");
		
		Artista musico = new Musico(1, "Juan");
		Artista musico2 = new Musico(1, "Juan");
		
		estudio.agregarArtista(musico);
		estudio.agregarArtista(musico2);
		assertEquals((Integer) 1, estudio.getCantidadArtistas());
		
	}
	
	@Test
	public void queRegistreUnAlquiler() throws AlquilerNoRegistrado, ArtistaNoEncontrado, SalaNoEncontrada {

		Estudio estudio = new Estudio("Estudio UNLaM");

		Sala salaTeatro = new SalaTeatro("Sala 1",200.1);
		estudio.agregarSala(salaTeatro);
		
		Artista actor = new Actor(123, "Pedro");
		estudio.agregarArtista(actor);

		
		Integer idAlquiler = estudio.alquilarSala(actor, salaTeatro, 3d);
		
		Integer valorEsperado = 1;
		
		assertEquals(valorEsperado, idAlquiler);


	}
	
	@Test (expected=ArtistaNoEncontrado.class)
	public void queAlIntentarAlquilarUnaSalaLanceUnaExceptionArtistaNoEncontrado() throws ArtistaNoEncontrado, SalaNoEncontrada {
		Estudio estudio = new Estudio("Estudio UNLaM");
		
		Sala salaTeatro = new SalaTeatro("Sala 1",200.0);
		estudio.agregarSala(salaTeatro);
		
		Artista actor = new Actor(123, "Pedro");
		
		Integer cantEsperado = 1;
		Integer alquiler = estudio.alquilarSala(actor, salaTeatro,100.1);
		
		assertEquals(cantEsperado, alquiler);
	
		
	}
	
	@Test (expected  = SalaNoEncontrada.class)
	public void queSeIntentarAlquilarUnaSalaLanceUnaExceptionSalaNoEncontrada() throws ArtistaNoEncontrado, SalaNoEncontrada {

		
		Estudio estudio = new Estudio("Estudio UNLaM");
		Sala salaTeatro = new SalaTeatro("Sala 1",200.0);
		
		
		Artista actor = new Actor(123, "Pedro");
		estudio.agregarArtista(actor);
		
		Integer cantEsperado = 1;
		Integer alquiler = estudio.alquilarSala(actor, salaTeatro,100.1);
		
		assertEquals(cantEsperado, alquiler);

	}
	@Test
	public void QueSePuedaObtenerTodosLosAlquileresOrdenadosDeFormaDescendenteParaUnArtistaAPartirDeSuDni() 
	{
		Estudio estudio = new Estudio("Estudio UNLaM");
		Sala salaTeatro = new SalaTeatro("Sala 1",200.0);
		estudio.agregarSala(salaTeatro);
			
		Artista actor = new Actor(1, "Pedro");
		estudio.agregarArtista(actor);
		Artista actor2 = new Actor(4, "Pedro");
		estudio.agregarArtista(actor);
		Artista actor3= new Actor(3, "Pedro");
		estudio.agregarArtista(actor);
	
		
		
	}


	
//	@Test
//	public void queAlIntentarAlquilarUnaSalaEnUsoLanceUnaExceptionSalaEnUsoException()
//	{
//		
//	}
//	@Test
//	public void queDespuesDeLaDevolucionDeUnaSalaOtroArtistaPuedaAlquilarla()
//	{
//		
//	}
//	
	@Test
	public void queAlIntentarAlquilarUnaSalaDeBandaAUnActorLanceUnaExcepcionArtistaIncorrectoException() throws ArtistaNoEncontrado, SalaNoEncontrada, ArtistaIncorrectoException {
		Estudio estudio = new Estudio("Estudio UNLaM");
		
		Sala salaTeatro = new SalaBanda("Sala 1",200.0);
		estudio.agregarSala(salaTeatro);
		
		Artista actor = new Actor(123, "Pedro");
		estudio.agregarArtista(actor);
			
		Integer cantEsperado = 0;
		Integer alquiler = estudio.alquilarSala(actor, salaTeatro,100.1);
		
		assertEquals(cantEsperado, alquiler);
	}
	
	
	
	

}
