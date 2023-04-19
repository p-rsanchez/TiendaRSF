package rf.com.tienda.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import rf.com.tienda.dominio.Producto;

public interface ProductoRepository extends JpaRepository<Producto, String>{

}
