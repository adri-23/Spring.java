package generation.mx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoSpring {

	// la diagonal es cuando nuestra pagina no esta en nada
	// entonces le decimos q ejecute el metodo y que nos refrese 
	// una cadena
	//el  metodo es para obtener la informacion
	@RequestMapping(path ="/", method = RequestMethod.GET)
	public String holaMundo(@RequestParam(name = "nombre",defaultValue ="defecto") String nombre) {
		return "Hola mundo con Spring Java" + nombre;
	}
}
