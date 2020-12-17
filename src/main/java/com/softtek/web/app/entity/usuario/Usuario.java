package com.softtek.web.app.entity.usuario;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


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
	
	private String usuario;
	
	private String pw;

	@OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)  
	private Rol rol;
	
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

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	
	
	
	
}
