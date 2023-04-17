//package rf.com.tienda.controlador;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import rf.com.tienda.dominio.Categoria;
//import rf.com.tienda.repositorio.CategoriaRepository;
//
//@Controller
//@RequestMapping(path="/tienda")
//public class CategoriaController {
//	@Autowired
//	private CategoriaRepository categoriaRepository;
//	
//	@PostMapping(path="/categoria")
//	public @ResponseBody String addNewCategoria (@RequestBody Categoria categoria) {
//		categoriaRepository.save(categoria);
//		return "Guardado";
//	}
//	
//	
//}
