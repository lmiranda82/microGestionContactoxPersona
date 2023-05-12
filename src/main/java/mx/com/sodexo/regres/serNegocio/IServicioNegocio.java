package mx.com.sodexo.regres.serNegocio;

import java.util.List;

import mx.com.sodexo.regres.entidades.Persona;

public interface IServicioNegocio {

	public Persona getPersonaRegistrada(long id);
	public List<Persona> getContactosPersona(long id);
	public List<Persona> getPersonas();

}
