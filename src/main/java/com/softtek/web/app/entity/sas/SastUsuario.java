package com.softtek.web.app.entity.sas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.softtek.web.app.dto.sas.SastUsuarioDTO;

@Entity
@Table(name = "SAST_USUARIO")
public class SastUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_USUARIO")
	private Long cveUsuario;

	@Column(name = "DES_CONTRASENIA")
	private String desContrasenia;

	@Temporal(TemporalType.DATE)
	@Column(name = "FEC_ACTUALIZACION_CONTRA")
	private Date fecActualizacionContra;

	@Column(name = "NOM_USUARIO")
	private String nomUsuario;

	@Column(name = "IND_INV_COMP")
	private Integer indInvComp;

	/*
	 * @ManyToOne(fetch = FetchType.LAZY, optional = false)
	 * 
	 * @JoinColumn(name = "CVE_ROL", referencedColumnName = "CVE_ROL", nullable =
	 * false) private SascRol sascRol;
	 */
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "CVE_PERSONA", referencedColumnName = "CVE_PERSONA", nullable = false)
	private SastPersona sastPersona;

	/*
	 * @OneToMany(mappedBy = "sastUsuario", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.LAZY) private List<SastDelUsuario> sastDelUsuarios;
	 */

	/*
	 * @OneToMany(mappedBy = "sastUsuario", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.LAZY) private List<SastHistEstusu> sastHistEstusus;
	 */

	public SastUsuario(SastUsuarioDTO sastUsuarioDTO,SastPersona sastPersona) {
		super();
		this.cveUsuario = sastUsuarioDTO.getCveUsuario();
		this.desContrasenia = sastUsuarioDTO.getDesContrasenia();
		this.fecActualizacionContra = sastUsuarioDTO.getFecActualizacionContra();
		this.nomUsuario = sastUsuarioDTO.getNomUsuario();
		this.indInvComp = sastUsuarioDTO.getIndInvComp();
		// this.sascRol = sastUsuarioDTO.getSascRol();
		this.sastPersona = sastPersona;
		// this.sastHistEstusus = sastUsuarioDTO.getSastHistEstusus();
	}

	public SastUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCveUsuario() {
		return this.cveUsuario;
	}

	public void setCveUsuario(Long cveUsuario) {
		this.cveUsuario = cveUsuario;
	}

	public String getDesContrasenia() {
		return this.desContrasenia;
	}

	public void setDesContrasenia(String desContrasenia) {
		this.desContrasenia = desContrasenia;
	}

	public Date getFecActualizacionContra() {
		return this.fecActualizacionContra;
	}

	public void setFecActualizacionContra(Date fecActualizacionContra) {
		this.fecActualizacionContra = fecActualizacionContra;
	}

	public String getNomUsuario() {
		return this.nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	/*
	 * public SascRol getSascRol() { return this.sascRol; }
	 */

	/*
	 * public void setSascRol(SascRol sascRol) { this.sascRol = sascRol; }
	 */

	public SastPersona getSastPersona() {
		return this.sastPersona;
	}

	public void setSastPersona(SastPersona sastPersona) {
		this.sastPersona = sastPersona;
	}

	/*
	 * public List<SastDelUsuario> getSastDelUsuarios() { return
	 * this.sastDelUsuarios; }
	 * 
	 * public void setSastDelUsuarios(List<SastDelUsuario> sastDelUsuarios) {
	 * this.sastDelUsuarios = sastDelUsuarios; }
	 * 
	 * public List<SastHistEstusu> getSastHistEstusus() { return
	 * this.sastHistEstusus; }
	 * 
	 * public void setSastHistEstusus(List<SastHistEstusu> sastHistEstusus) {
	 * this.sastHistEstusus = sastHistEstusus; }
	 */

	public Integer getIndInvComp() {
		return this.indInvComp;
	}

	public void setIndInvComp(Integer indInvComp) {
		this.indInvComp = indInvComp;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof SastUsuario))
			return false;
		SastUsuario other = (SastUsuario) obj;
		if ((this.cveUsuario == null && other.cveUsuario != null)
				|| (this.cveUsuario != null && !this.cveUsuario.equals(other.cveUsuario)))
			return false;
		return true;
	}

	public int hashCode() {
		int hash = 0;
		hash += (this.cveUsuario != null) ? this.cveUsuario.hashCode() : 0;
		return hash;
	}
}
