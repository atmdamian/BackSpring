package com.softtek.web.app.entity.producto;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "productos")
@NamedQueries(value = { @NamedQuery(name = "find_all_productos", query = "SELECT p FROM Producto p") })
public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	@Id
	@Column(name="producto_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="nombre_imagen")
	private String nombreImagen;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private String precio;

	private String descripcion;
	
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

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	public String getNombreImagen() {
		return nombreImagen;
	}

	public void setNombreImagen(String nombreImagen) {
		this.nombreImagen = nombreImagen;
	}

	
}
