package rf.com.tienda.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import rf.com.tienda.exception.DomainException;
import rf.com.tienda.util.ErrorMessages;
import rf.com.tienda.util.Validator;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(schema = "RSF_alumno", name = "USUARIO")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id_usuario;
	@Column(nullable = false)
	private String user_nombre;
	@Column(nullable = false)
	private String user_email;
	@Column(nullable = false)
	private String user_pass;
	@Column(nullable = false)
	private int user_tipo;
	@Column
	private String user_dni;
	@Column
	private LocalDate user_fecAlta;
	@Column
	private LocalDate user_fecConfirmacion;
	
	public Usuario() {
		
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUser_nombre() {
		return user_nombre;
	}

	public void setUser_nombre(String user_nombre) throws DomainException {
		if (Validator.cumpleLongitud(user_nombre, 5, 100)) {
			this.user_nombre = user_nombre;
		}else {
			throw new DomainException(ErrorMessages.CATERR_001);
		}
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) throws DomainException {
		if (Validator.isEmailValido(user_email)) {
			this.user_email = user_email;
		}else {
			throw new DomainException(ErrorMessages.USUERR_001);
		}
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) throws DomainException {
		if (Validator.esPasswordValida(user_pass)) {
			this.user_pass = user_pass;
		}else {
			throw new DomainException(ErrorMessages.USUERR_002);
		}
	}

	public int getUser_tipo() {
		return user_tipo;
	}

	public void setUser_tipo(int user_tipo) {
		this.user_tipo = user_tipo;
	}

	public String getUser_dni() {
		return user_dni;
	}

	public void setUser_dni(String user_dni) throws DomainException {
		if (Validator.cumpleDNI(user_dni)) {
			this.user_dni = user_dni;
		}else {
			throw new DomainException(ErrorMessages.USUERR_003);
		}
	}

	public LocalDate getUser_fecAlta() {
		return user_fecAlta;
	}

	public void setUser_fecAlta() {
		this.user_fecAlta = LocalDate.now();
	}

	public LocalDate getUser_fecConfirmacion() {
		return user_fecConfirmacion;
	}

	public void setUser_fecConfirmacion() {
		this.user_fecAlta = LocalDate.now();
	}
	
	
	
}
