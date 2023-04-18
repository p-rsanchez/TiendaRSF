package rf.com.tienda.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import rf.com.tienda.exception.DomainException;
import rf.com.tienda.util.ErrorMessages;
import rf.com.tienda.util.Validator;

@Entity
@Table(schema = "RSF_alumno", name = "PRODUCTO")
public class Producto {
	
//decimales = 2
//nullable = false obligatorio null

	@Id
	private String id_producto;
	@Column(nullable = false, columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
	private String pro_descripcion;
	@Column()
	private String pro_desLarga;
	@Column(nullable = false, scale = 2)
	private Double pro_precio;
	@Column()
	@ColumnDefault("INTEGER DEFAULT 0")
	private Integer pro_stock;
	@Column()
	private Date pro_fecRepos;
	@Column()
	private Date pro_fecActi;
	@Column()
	private Date pro_fecDesacti;
	@Column(nullable = false)
	private String pro_uniVenta;
	@Column()
	@ColumnDefault("INTEGER DEFAULT 0")
	private Double pro_cantXUniVenta;
	@Column()
	private String pro_uniUltNivel;
	@Column(nullable = false)
	private Integer id_pais;
	@Column()
	private String pro_usoRecomendado;
	@Column(nullable = false)
	private Integer id_categoria;
	@Column()
	@ColumnDefault("INTEGER DEFAULT 0")
	private Integer pro_stkReservado;
	@Column()
	@ColumnDefault("INTEGER DEFAULT 0")
	private Integer pro_nStkAlto;
	@Column()
	@ColumnDefault("INTEGER DEFAULT 0")
	private Integer pro_nStkBajo;
	@Column()
	@ColumnDefault("A")
	private char pro_stat;

	
	public Producto() {
		
	}


	public String getId_producto() {
		return id_producto;
	}


	public void setId_producto(String id_producto) throws DomainException {
		if(Validator.idProductoValida(id_producto)) {
			this.id_producto = id_producto;
		}else {
			throw new DomainException(ErrorMessages.PROERR_002);
		}
		
	}


	public String getPro_descripcion() {
		return pro_descripcion;
	}


	public void setPro_descripcion(String pro_descripcion) {
		this.pro_descripcion = pro_descripcion;
	}


	public String getPro_desLarga() {
		return pro_desLarga;
	}


	public void setPro_desLarga(String pro_desLarga) {
		this.pro_desLarga = pro_desLarga;
	}


	public Double getPro_precio() {
		return pro_precio;
	}


	public void setPro_precio(Double pro_precio) {
		this.pro_precio = pro_precio;
	}


	public Integer getPro_stock() {
		return pro_stock;
	}


	public void setPro_stock(Integer pro_stock) {
		this.pro_stock = pro_stock;
	}


	public Date getPro_fecRepos() {
		return pro_fecRepos;
	}


	public void setPro_fecRepos(Date pro_fecRepos) {
		this.pro_fecRepos = pro_fecRepos;
	}


	public Date getPro_fecActi() {
		return pro_fecActi;
	}


	public void setPro_fecActi(Date pro_fecActi) {
		this.pro_fecActi = pro_fecActi;
	}


	public Date getPro_fecDesacti() {
		return pro_fecDesacti;
	}


	public void setPro_fecDesacti(Date pro_fecDesacti) {
		this.pro_fecDesacti = pro_fecDesacti;
	}


	public String getPro_uniVenta() {
		return pro_uniVenta;
	}


	public void setPro_uniVenta(String pro_uniVenta) {
		this.pro_uniVenta = pro_uniVenta;
	}


	public Double getPro_cantXUniVenta() {
		return pro_cantXUniVenta;
	}


	public void setPro_cantXUniVenta(Double pro_cantXUniVenta) {
		this.pro_cantXUniVenta = pro_cantXUniVenta;
	}


	public String getPro_uniUltNivel() {
		return pro_uniUltNivel;
	}


	public void setPro_uniUltNivel(String pro_uniUltNivel) {
		this.pro_uniUltNivel = pro_uniUltNivel;
	}


	public Integer getId_pais() {
		return id_pais;
	}


	public void setId_pais(Integer id_pais) {
		this.id_pais = id_pais;
	}


	public String getPro_usoRecomendado() {
		return pro_usoRecomendado;
	}


	public void setPro_usoRecomendado(String pro_usoRecomendado) {
		this.pro_usoRecomendado = pro_usoRecomendado;
	}


	public Integer getId_categoria() {
		return id_categoria;
	}


	public void setId_categoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
	}


	public Integer getPro_stkReservado() {
		return pro_stkReservado;
	}


	public void setPro_stkReservado(Integer pro_stkReservado) {
		this.pro_stkReservado = pro_stkReservado;
	}


	public Integer getPro_nStkAlto() {
		return pro_nStkAlto;
	}


	public void setPro_nStkAlto(Integer pro_nStkAlto) {
		this.pro_nStkAlto = pro_nStkAlto;
	}


	public Integer getPro_nStkBajo() {
		return pro_nStkBajo;
	}


	public void setPro_nStkBajo(Integer pro_nStkBajo) {
		this.pro_nStkBajo = pro_nStkBajo;
	}


	public char getPro_stat() {
		return pro_stat;
	}


	public void setPro_stat(char pro_stat) {
		this.pro_stat = pro_stat;
	}
	
	
	
}
