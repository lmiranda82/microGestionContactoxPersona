package mx.com.sodexo.regres.apiweb;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mx.com.sodexo.regres.entidades.Persona;
import mx.com.sodexo.regres.serNegocio.IServicioNegocio;

@RestController
public class GestionContactosXPersonaAPI {
	
	@Autowired
	private IServicioNegocio gestorRegistrosContactosxPersona;
	
	@GetMapping(path="/personas/{id}", produces= MediaType.APPLICATION_JSON_VALUE )
	public Persona get_Persona(@PathVariable long id) {	
		return this.gestorRegistrosContactosxPersona.getPersonaRegistrada(id);
	}
	
	@GetMapping(path="/personas/{id}/contactos", produces= MediaType.APPLICATION_JSON_VALUE )
	public List<Persona> get_ContactosPersona(@PathVariable long id){
		return this.gestorRegistrosContactosxPersona.getContactosPersona(id);
	}
	
	@GetMapping(path="/personas", produces= MediaType.APPLICATION_JSON_VALUE )
	public List<Persona> get_ContactosPersona(){
		return this.gestorRegistrosContactosxPersona.getPersonas();
	}
}

