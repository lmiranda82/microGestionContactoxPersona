package mx.com.sodexo.regres.serNegocio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mx.com.sodexo.regres.entidades.Persona;

@Service
public class ServicioNegocio implements IServicioNegocio {

	private List<Persona> listaContactos = new ArrayList<Persona>();

	@Override
	public Persona getPersonaRegistrada(long id) {
		
		Persona personaTest;
		if (id == 1) {
			personaTest = new Persona("Juan", "Pineda", "Blanco", "test@gmail.com", "Scrum Master", 0, 0);
		}else {
			personaTest = new Persona("Luis", "Vazquez", "Romo", "test2@gmail.com", "Product Owner", 1, 0);
		}
		return personaTest;
	}

	@Override
	public List<Persona> getContactosPersona(long id) {
		
		//List<Persona> listaContactos = new ArrayList<Persona>();
		
		if (id == 1) {
			listaContactos.add(new Persona("Jose", "Lopez", "Sanchez", "a@a.com", "developer", 0, 0));
			listaContactos.add(new Persona("Juan", "Lopez", "Sanchez", "a@a.com", "developer", 0, 0));
		}else {
			listaContactos.add(new Persona("Laura", "Lopez", "Sanchez", "a@a.com", "developer", 0, 0));
			listaContactos.add(new Persona("Lorenzo", "Lopez", "Sanchez", "a@a.com", "developer", 0, 0));

		}
		return listaContactos;
	}

	@Override
	public List<Persona> getPersonas() {
		
		listaContactos.add(new Persona("Jose", "Lopez", "Sanchez", "a@a.com", "developer", 0, 0));
		listaContactos.add(new Persona("Juan", "Lopez", "Sanchez", "a@a.com", "developer", 0, 0));
		listaContactos.add(new Persona("Laura", "Lopez", "Sanchez", "a@a.com", "developer", 0, 0));
		listaContactos.add(new Persona("Lorenzo", "Lopez", "Sanchez", "a@a.com", "developer", 0, 0));
		listaContactos.add(new Persona("Juan", "Pineda", "Blanco", "test@gmail.com", "Scrum Master", 0, 0));
		//personaTest = new Persona("Luis", "Vazquez", "Romo", "test2@gmail.com", "Product Owner", 1, 0);

		return listaContactos;
	}

}
