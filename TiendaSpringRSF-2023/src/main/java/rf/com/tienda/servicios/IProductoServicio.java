package rf.com.tienda.servicios;

import java.text.ParseException;
import java.util.List;

import org.springframework.http.ResponseEntity;

import rf.com.tienda.dominio.Producto;
import rf.com.tienda.exception.DomainException;

public interface IProductoServicio {

	public abstract List<Producto> leerProductos();
	public abstract Producto crearProducto(Producto producto);
	public abstract ResponseEntity actualizarProducto(Producto productoNuevo, String id) throws DomainException, ParseException;
	public abstract ResponseEntity eliminarProducto(String id);
}
