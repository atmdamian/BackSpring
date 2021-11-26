package com.softtek.web.app.entity.sas;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SASC_ROL")
public class SascRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_ROL")
	private Long cveRol;

	@Column(name = "IND_ACTIVO")
	private Integer indActivo;

	@Column(name = "NOM_ROL")
	private String nomRol;

	@Column(name = "DES_CVE_ROL")
	private String desCveRol;

	@Column(name = "DES_ABREVIATURA")
	private String desAbreviatura;

	/*
	 * @JoinTable(name = "SAST_MENU_ROL", joinColumns = {@JoinColumn(name =
	 * "CVE_ROL", referencedColumnName = "CVE_ROL")}, inverseJoinColumns =
	 * {@JoinColumn(name = "CVE_MENU", referencedColumnName = "CVE_MENU")})
	 * 
	 * @ManyToMany(fetch = FetchType.LAZY) private List<SascMenu> sascMenus;
	 */

	// @OneToMany(mappedBy = "sascRol", cascade = {CascadeType.ALL}, fetch =
	// FetchType.LAZY)
	// private List<SastUsuario> sastUsuarios;

	public Long getCveRol() {
		return this.cveRol;
	}

	public void setCveRol(Long cveRol) {
		this.cveRol = cveRol;
	}

	public Integer getIndActivo() {
		return this.indActivo;
	}

	public void setIndActivo(Integer indActivo) {
		this.indActivo = indActivo;
	}

	public String getNomRol() {
		return this.nomRol;
	}

	public void setNomRol(String nomRol) {
		this.nomRol = nomRol;
	}

	/*
	 * public List<SascMenu> getSascMenus() { return this.sascMenus; }
	 * 
	 * public void setSascMenus(List<SascMenu> sascMenus) { this.sascMenus =
	 * sascMenus; }
	 */

	/*
	 * public List<SastUsuario> getSastUsuarios() { return this.sastUsuarios; }
	 */

	public boolean equals(Object obj) {
		if (!(obj instanceof SascRol))
			return false;
		SascRol other = (SascRol) obj;
		if ((this.cveRol == null && other.cveRol != null) || (this.cveRol != null && !this.cveRol.equals(other.cveRol)))
			return false;
		return true;
	}

	public String getDesCveRol() {
		return this.desCveRol;
	}

	public void setDesCveRol(String desCveRol) {
		this.desCveRol = desCveRol;
	}

	/*
	 * public void setSastUsuarios(List<SastUsuario> sastUsuarios) {
	 * this.sastUsuarios = sastUsuarios; }
	 */

	public String getDesAbreviatura() {
		return this.desAbreviatura;
	}

	public void setDesAbreviatura(String desAbreviatura) {
		this.desAbreviatura = desAbreviatura;
	}

	public int hashCode() {
		int hash = 0;
		hash += (this.cveRol != null) ? this.cveRol.hashCode() : 0;
		return hash;
	}
}
