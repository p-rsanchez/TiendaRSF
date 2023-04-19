package rf.com.tienda.servicios;

import java.util.List;

import org.springframework.http.ResponseEntity;

import rf.com.tienda.dominio.Usuario;
import rf.com.tienda.exception.DomainException;

public interface IUsuarioServicio {
	
	public abstract List<Usuario> leerUsuarios();
	public abstract Usuario crearUsuarios(Usuario usuario);
	public abstract ResponseEntity actualizarUsuarios(Usuario usuarioNuevo, Integer id) throws DomainException;
	public abstract ResponseEntity eliminarUsuarios(Integer id);
	
}
