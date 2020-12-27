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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.softtek.web.app.enums.Pais;


@Entity
@Table(name = "usuarios")
@NamedQueries(value = {
		@NamedQuery(name="find_all_usuarios", query = "SELECT us FROM Usuario us"),
		@NamedQuery(name="find_by_usuario", query = "SELECT us FROM Usuario us WHERE us.usuario = :usuario ")
})
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nombre;
	
	private String apellido;
	
	private String usuario;
	
	private Pais pais;
	
	@Column(name = "fecha_nacimiento")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	private String pw;
	
	@Column(name = "fecha_creacion")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;

	//@OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)  
	//private Rol rol;
	
	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "usuario")
	//private Resultado resultado;
	
	//@OneToMany(mappedBy = "usuario")
	//private List<Correo> correos = new ArrayList<>();

	
	
	/*public List<Correo> getCorreos() {
		return correos;
	}

	public void addCorreos(Correo correo) {
		this.correos.add(correo);
	}

	public void removeCorreos(Correo correo) {
		this.correos.remove(correo);
	
	}*/

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

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	/*public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}*/

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
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

	
	
	
	
}
