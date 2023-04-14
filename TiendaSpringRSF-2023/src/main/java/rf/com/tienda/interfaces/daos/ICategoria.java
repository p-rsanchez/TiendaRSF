package rf.com.tienda.interfaces.daos;

import java.util.List;

import rf.com.tienda.dominio.Categoria;

public interface ICategoria {
	public Categoria getRegistro(int num);
	public List<Categoria> lista(Categoria c);
	public boolean guardar(Categoria c);
}
