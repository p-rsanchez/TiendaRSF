package rf.com.tienda.servicios;

import java.util.List;

import rf.com.tienda.dominio.Categoria;

public interface ICategoriaServicio {
	
	public abstract List<Categoria> leerCategorias();
	public abstract Categoria crearCategoria(Categoria categoria);
	public abstract Categoria actualizarCategoria(Categoria categoria);
	public abstract void eliminarCategoria(Integer id);

}
