package rf.com.tienda.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import rf.com.tienda.dominio.Usuario;
import rf.com.tienda.exception.DomainException;
import rf.com.tienda.repository.CategoriaRepository;
import rf.com.tienda.repository.UsuarioRepository;

@Service
public class UsuarioServicio implements IUsuarioServicio{
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> leerUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@Override
	public Usuario crearUsuarios(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public ResponseEntity actualizarUsuarios(Usuario usuarioNuevo, Integer id) throws DomainException {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		if(!usuario.isPresent()) {
			return new ResponseEntity("No existe la cateogoria con ese ID", HttpStatus.NOT_FOUND);
		}
		
		usuario.get().setId_usuario(usuarioNuevo.getId_usuario());
		usuario.get().setUser_nombre(usuarioNuevo.getUser_nombre());
		usuario.get().setUser_email(usuarioNuevo.getUser_email());
		usuario.get().setUser_pass(usuarioNuevo.getUser_pass());
		usuario.get().setUser_tipo(usuarioNuevo.getUser_tipo());
		usuario.get().setUser_dni(usuarioNuevo.getUser_dni());
		usuario.get().setUser_fecAlta();
		usuario.get().setUser_fecConfirmacion();
		usuarioRepository.save(usuario.get());
		return new ResponseEntity("Actualizado", HttpStatus.OK);

		
	}

	@Override
	public ResponseEntity eliminarUsuarios(Integer id) {		
		Optional<Usuario> categoria = usuarioRepository.findById(id);
		if(!categoria.isPresent()) {
			return new ResponseEntity("No existe la cateogoria con ese ID", HttpStatus.NOT_FOUND);
		}
		
		usuarioRepository.deleteById(id);
		return new ResponseEntity("Borrado", HttpStatus.OK);

	}
	
}
