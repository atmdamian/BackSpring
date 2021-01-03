package com.softtek.web.app.entity.usuario;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuarios")
@NamedQueries(value = { @NamedQuery(name = "find_all_usuarios", query = "SELECT NEW com.softtek.web.app.entity.usuario.Usuario(us.id, us.nombre,us.apellido,us.usuario,us.contraseña, us.fechaNacimiento, us.fechaCreacion, d, c) FROM Usuario us JOIN us.domicilio d JOIN us.contacto c"),
		@NamedQuery(name = "find_all_usuario_domicilio", query = "SELECT us FROM Usuario us JOIN us.domicilio d WHERE d.pais ='Mexico'"),
		@NamedQuery(name = "find_by_usuario", query = "SELECT us FROM Usuario us WHERE us.usuario = :usuario ") })
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	@Id
	@Column(name = "usuario_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nombre;

	private String apellido;

	private String usuario;

	@Column(name = "contrasenia")
	private String contraseña;

	@Column(name = "fecha_nacimiento")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	@Column(name = "fecha_creacion")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;

	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "rol_id", referencedColumnName = "rol_id")
	private Rol rol;

	@ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	@JoinColumn(name = "id_domicilio", referencedColumnName = "id_domicilio")
	private Domicilio domicilio;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_contacto", referencedColumnName = "id_contacto")
	private Contacto contacto;
	
	

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(Integer id, String nombre, String apellido, String usuario, String contraseña, Date fechaNacimiento,
			Date fechaCreacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaCreacion = fechaCreacion;
	}

	
	

	public Usuario(Integer id, String nombre, String apellido, String usuario, String contraseña, Date fechaNacimiento,
			Date fechaCreacion, Domicilio domicilio, Contacto contacto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaCreacion = fechaCreacion;
		this.domicilio = domicilio;
		this.contacto = contacto;
	}

	@PrePersist
	public void prePersist() {
		this.fechaCreacion = new Date();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

}
