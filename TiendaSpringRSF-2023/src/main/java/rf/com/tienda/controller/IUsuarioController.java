package rf.com.tienda.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import rf.com.tienda.dominio.Usuario;
import rf.com.tienda.exception.DomainException;

public interface IUsuarioController {
	
	public abstract List<Usuario> listaUsuario();
	public abstract String addNewUsuario(Usuario categoria);
	public abstract ResponseEntity updateUsuario(Usuario cateogiraNueva, Integer id) throws DomainException;
	public abstract ResponseEntity deleteUsuario(Integer id);
	
}
