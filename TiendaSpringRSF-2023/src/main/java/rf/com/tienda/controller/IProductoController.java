package rf.com.tienda.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.http.ResponseEntity;

import rf.com.tienda.dominio.Producto;
import rf.com.tienda.exception.DomainException;

public interface IProductoController {
	
	public abstract List<Producto> listaProducto();
	public abstract String addNewProducto(Producto producto);
	public abstract ResponseEntity updateProducto(Producto productoNuevo, String id) throws DomainException, ParseException;
	public abstract ResponseEntity deleteProducto(String id);
	
}
