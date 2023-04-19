package rf.com.tienda.controller;

import java.text.ParseException;
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
import rf.com.tienda.dominio.Producto;
import rf.com.tienda.exception.DomainException;
import rf.com.tienda.servicios.IProductoServicio;

@RestController
@RequestMapping(path="/producto")
public class ProductoController implements IProductoController {

	@Autowired
	private IProductoServicio iProductoServicio;
	
	@Override
	@GetMapping(path = "/all")
	public List<Producto> listaProducto() {
		return iProductoServicio.leerProductos();
	}
	
	@Override
	@PostMapping(path = "/add")
	public @ResponseBody String addNewProducto (@RequestBody Producto producto) {
		iProductoServicio.crearProducto(producto);
		return "Saved";
	}
	
	@Override
	@PutMapping(path = "/{id}")
	public ResponseEntity<?> updateProducto(@RequestBody Producto productoNuevo, @PathVariable String id) throws DomainException, ParseException{
		return iProductoServicio.actualizarProducto(productoNuevo, id);
	}
	
	@Override
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteProducto(@PathVariable String id) {
		return iProductoServicio.eliminarProducto(id);
	}

}
