package rf.com.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rf.com.tienda.dominio.Categoria;
import rf.com.tienda.servicios.ICategoriaServicio;

@RestController
@RequestMapping(path="/categoria")
public class CategoriaController {
	@Autowired
	private ICategoriaServicio cDao;
	
	@GetMapping(path = "/all")
	public List<Categoria> listaCategoria() {
		return cDao.leerCategorias();
	}
	
	@PostMapping(path = "/add")
	public @ResponseBody String addNewCategoria (@RequestBody Categoria categoria) {
		cDao.crearCategoria(categoria);
		return "Saved";
	}
	
}
