package com.softtek.web.app.entity.sas;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SAST_HIST_ESTUSU")
public class SastHistEstusu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_HIST_ESTUSU")
	private Long cveHistEstusu;

	@Temporal(TemporalType.DATE)
	@Column(name = "FEC_ACTUALIZACION")
	private Date fecActualizacion;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "CVE_ESTATUS", referencedColumnName = "CVE_ESTATUS", nullable = false)
	private SastEstatus sastEstatus;

	/*
	 * @ManyToOne(fetch = FetchType.LAZY, optional = false)
	 * 
	 * @JoinColumn(name = "CVE_USUARIO", referencedColumnName = "CVE_USUARIO",
	 * nullable = false) private SastUsuario sastUsuario;
	 */

	public Long getCveHistEstusu() {
		return this.cveHistEstusu;
	}

	public void setCveHistEstusu(Long cveHistEstusu) {
		this.cveHistEstusu = cveHistEstusu;
	}

	public Date getFecActualizacion() {
		return this.fecActualizacion;
	}

	public void setFecActualizacion(Date fecActualizacion) {
		this.fecActualizacion = fecActualizacion;
	}

	public SastEstatus getSastEstatus() {
		return this.sastEstatus;
	}

	public void setSastEstatus(SastEstatus sastEstatus) {
		this.sastEstatus = sastEstatus;
	}

	/*
	 * public SastUsuario getSastUsuario() { return this.sastUsuario; }
	 * 
	 * public void setSastUsuario(SastUsuario sastUsuario) { this.sastUsuario =
	 * sastUsuario; }
	 */

	public boolean equals(Object obj) {
		if (!(obj instanceof SastHistEstusu))
			return false;
		SastHistEstusu other = (SastHistEstusu) obj;
		if ((this.cveHistEstusu == null && other.cveHistEstusu != null)
				|| (this.cveHistEstusu != null && !this.cveHistEstusu.equals(other.cveHistEstusu)))
			return false;
		return true;
	}

	public int hashCode() {
		int hash = 0;
		hash += (this.cveHistEstusu != null) ? this.cveHistEstusu.hashCode() : 0;
		return hash;
	}
}
