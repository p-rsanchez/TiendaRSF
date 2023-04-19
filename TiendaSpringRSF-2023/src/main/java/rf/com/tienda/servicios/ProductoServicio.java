package rf.com.tienda.servicios;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import rf.com.tienda.dominio.Categoria;
import rf.com.tienda.dominio.Producto;
import rf.com.tienda.exception.DomainException;
import rf.com.tienda.repository.ProductoRepository;

@Service
public class ProductoServicio implements IProductoServicio{

	@Autowired
	ProductoRepository productoRepository;
	
	@Override
	public List<Producto> leerProductos(){
		return productoRepository.findAll();
	}
	
	@Override
	public Producto crearProducto(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public ResponseEntity actualizarProducto(Producto productoNuevo, String id) throws DomainException, ParseException {
		Optional<Producto> producto = productoRepository.findById(id);
		if(!producto.isPresent()) {
			return new ResponseEntity("No existe la cateogoria con ese ID", HttpStatus.NOT_FOUND);
		}
		
		producto.get().setId_categoria(productoNuevo.getId_categoria());
		producto.get().setId_producto(productoNuevo.getId_producto());
		producto.get().setPro_descripcion(productoNuevo.getPro_descripcion());
		producto.get().setPro_desLarga(productoNuevo.getPro_desLarga());
		producto.get().setPro_stock(productoNuevo.getPro_stock());
		producto.get().setPro_fecRepos(productoNuevo.getPro_fecRepos());
		producto.get().setPro_fecActi(productoNuevo.getPro_fecActi());
		producto.get().setPro_fecDesacti(productoNuevo.getPro_fecDesacti());
		producto.get().setPro_uniVenta(productoNuevo.getPro_uniVenta());
		producto.get().setPro_cantXUniVenta(productoNuevo.getPro_cantXUniVenta());
		producto.get().setPro_uniUltNivel(productoNuevo.getPro_uniUltNivel());
		producto.get().setId_pais(productoNuevo.getId_pais());
		producto.get().setPro_usoRecomendado(productoNuevo.getPro_usoRecomendado());
		producto.get().setPro_stkReservado(productoNuevo.getPro_stkReservado());
		producto.get().setPro_nStkAlto(productoNuevo.getPro_nStkAlto());
		producto.get().setPro_nStkBajo(productoNuevo.getPro_nStkBajo());
		producto.get().setPro_stat(productoNuevo.getPro_stat());
		productoRepository.save(producto.get());
		return new ResponseEntity("Actualizado", HttpStatus.OK);

	}

	@Override
	public ResponseEntity eliminarProducto(String id) {		
		Optional<Producto> producto = productoRepository.findById(id);
		if(!producto.isPresent()) {
			return new ResponseEntity("No existe la cateogoria con ese ID", HttpStatus.NOT_FOUND);
		}
		
		productoRepository.deleteById(id);
		return new ResponseEntity("Borrado", HttpStatus.OK);

	}
	
}
