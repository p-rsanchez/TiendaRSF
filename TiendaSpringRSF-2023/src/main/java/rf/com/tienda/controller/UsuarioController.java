package rf.com.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rf.com.tienda.dominio.Categoria;
import rf.com.tienda.dominio.Usuario;
import rf.com.tienda.exception.DomainException;
import rf.com.tienda.servicios.IUsuarioServicio;

@RestController
@RequestMapping(path="/usuario")
public class UsuarioController implements IUsuarioController {
	
	@Autowired
	private IUsuarioServicio iUsuarioServicio;
	
	@Override
	@GetMapping(path = "/all")
	public List<Usuario> listaUsuario() {
		return iUsuarioServicio.leerUsuarios();
	}
	
	@Override
	@PostMapping(path = "/add")
	public @ResponseBody String addNewUsuario (@RequestBody Usuario usuario) {
		iUsuarioServicio.crearUsuarios(usuario);
		return "Saved";
	}
	
	@Override
	@PutMapping(path = "/{id}")
	public ResponseEntity<?> updateUsuario(@RequestBody Usuario usuarioNuevo, @PathVariable Integer id) throws DomainException{
		return iUsuarioServicio.actualizarUsuarios(usuarioNuevo, id);
	}
	
	@Override
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteUsuario(@PathVariable Integer id) {
		return iUsuarioServicio.eliminarUsuarios(id);
	}
	
}
