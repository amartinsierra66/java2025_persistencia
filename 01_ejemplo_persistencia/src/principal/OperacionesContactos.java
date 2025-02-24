package principal;

import java.util.Optional;

import model.Contacto;
import service.ContactosService;

public class OperacionesContactos {

	public static void main(String[] args) {
		ContactosService service=new ContactosService();
		/*Contacto contacto=service.buscarContacto(5);
		System.out.println("Nombre: "+contacto.getNombre());
		System.out.println("Email: "+contacto.getEmail());
		System.out.println("Edad: "+contacto.getEdad());*/
		//alta de un nuevo contacto
		/*Contacto contacto=new Contacto(0, "contacto jpa", "jpa@gmail.com", 44);
		service.altaContacto(contacto);
		System.out.println("Contacto añadido!!");*/
		//recuperar todos
		/*List<Contacto> contactos=service.recuperarTodos();
		contactos.forEach(c->System.out.println(c.getNombre()));*/
		//recuperar por email
		/*Optional<Contacto> contacto=service.buscarContactoEmail("email26@gmail.com");
		contacto.ifPresentOrElse(c->System.out.println(c.getNombre()), 
								 ()->System.out.println("Contacto no existente"));
		*/
		//eliminar por nombre
		service.eliminarContacto("nuevo");
		

	}

}
