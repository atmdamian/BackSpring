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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SASC_ESTATUS")
public class SastEstatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_ESTATUS")
	private Long cveEstatus;

	@Column(name = "IND_ACTIVO")
	private Integer indActivo;

	@Column(name = "NOM_ESTATUS")
	private String nomEstatus;

	/*
	 * @ManyToOne(fetch = FetchType.LAZY, optional = false)
	 * 
	 * @JoinColumn(name = "CVE_TIPO_ESTATUS", referencedColumnName =
	 * "CVE_TIPO_ESTATUS", nullable = false) private SascTipoestatus
	 * sascTipoestatus;
	 * 
	 * @OneToMany(mappedBy = "sastEstatus", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.LAZY) private List<SastHistEstant> sastHistEstants;
	 * 
	 * @OneToMany(mappedBy = "sastEstatus", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.LAZY) private List<SastHistEstcpd> sastHistEstcpds;
	 * 
	 * @OneToMany(mappedBy = "sastEstatus", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.LAZY) private List<SastHistEstdoc> sastHistEstdocs;
	 * 
	 * @OneToMany(mappedBy = "sastEstatus", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.LAZY) private List<SastHistEstexp> sastHistEstexps;
	 * 
	 * @OneToMany(mappedBy = "sastEstatus", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.LAZY) private List<SastHistEstper> sastHistEstpers;
	 * 
	 * @OneToMany(mappedBy = "sastEstatus", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.LAZY) private List<SastHistEstrep> sastHistEstreps;
	 * 
	 * @OneToMany(mappedBy = "sastEstatus", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.LAZY) private List<SastHistEstsol> sastHistEstsols;
	 * 
	 * @OneToMany(mappedBy = "sastEstatus", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.LAZY) private List<SastHistEstusu> sastHistEstusus;
	 * 
	 * @OneToMany(mappedBy = "sastEstatus", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.LAZY) private List<SastHistEstConv> sastHistEstConvs;
	 * 
	 * @OneToMany(mappedBy = "sastEstatus", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.LAZY) private List<SastHistEstCfdi> sastHistEstCfdis;
	 * 
	 * @OneToMany(mappedBy = "sastEstatus", cascade = {CascadeType.ALL}, fetch =
	 * FetchType.LAZY) private List<SastHistEstSin> sastHistEstSin;
	 */

	public SastEstatus() {
	}

	public SastEstatus(Long cveEstatus) {
		this();
		this.cveEstatus = cveEstatus;
	}

	public Long getCveEstatus() {
		return this.cveEstatus;
	}

	public void setCveEstatus(Long cveEstatus) {
		this.cveEstatus = cveEstatus;
	}

	public Integer getIndActivo() {
		return this.indActivo;
	}

	public void setIndActivo(Integer indActivo) {
		this.indActivo = indActivo;
	}

	public String getNomEstatus() {
		return this.nomEstatus;
	}

	public void setNomEstatus(String nomEstatus) {
		this.nomEstatus = nomEstatus;
	}

	/*
	 * public SascTipoestatus getSascTipoestatus() { return this.sascTipoestatus; }
	 * 
	 * public void setSascTipoestatus(SascTipoestatus sascTipoestatus) {
	 * this.sascTipoestatus = sascTipoestatus; }
	 * 
	 * public List<SastHistEstant> getSastHistEstants() { return
	 * this.sastHistEstants; }
	 * 
	 * public void setSastHistEstants(List<SastHistEstant> sastHistEstants) {
	 * this.sastHistEstants = sastHistEstants; }
	 * 
	 * public List<SastHistEstcpd> getSastHistEstcpds() { return
	 * this.sastHistEstcpds; }
	 * 
	 * public void setSastHistEstcpds(List<SastHistEstcpd> sastHistEstcpds) {
	 * this.sastHistEstcpds = sastHistEstcpds; }
	 * 
	 * public List<SastHistEstdoc> getSastHistEstdocs() { return
	 * this.sastHistEstdocs; }
	 * 
	 * public void setSastHistEstdocs(List<SastHistEstdoc> sastHistEstdocs) {
	 * this.sastHistEstdocs = sastHistEstdocs; }
	 * 
	 * public List<SastHistEstexp> getSastHistEstexps() { return
	 * this.sastHistEstexps; }
	 * 
	 * public void setSastHistEstexps(List<SastHistEstexp> sastHistEstexps) {
	 * this.sastHistEstexps = sastHistEstexps; }
	 * 
	 * public List<SastHistEstper> getSastHistEstpers() { return
	 * this.sastHistEstpers; }
	 * 
	 * public void setSastHistEstpers(List<SastHistEstper> sastHistEstpers) {
	 * this.sastHistEstpers = sastHistEstpers; }
	 * 
	 * public List<SastHistEstrep> getSastHistEstreps() { return
	 * this.sastHistEstreps; }
	 * 
	 * public void setSastHistEstreps(List<SastHistEstrep> sastHistEstreps) {
	 * this.sastHistEstreps = sastHistEstreps; }
	 * 
	 * public List<SastHistEstsol> getSastHistEstsols() { return
	 * this.sastHistEstsols; }
	 * 
	 * public void setSastHistEstsols(List<SastHistEstsol> sastHistEstsols) {
	 * this.sastHistEstsols = sastHistEstsols; }
	 * 
	 * public List<SastHistEstusu> getSastHistEstusus() { return
	 * this.sastHistEstusus; }
	 * 
	 * public void setSastHistEstusus(List<SastHistEstusu> sastHistEstusus) {
	 * this.sastHistEstusus = sastHistEstusus; }
	 * 
	 * public List<SastHistEstConv> getSastHistEstConvs() { return
	 * this.sastHistEstConvs; }
	 * 
	 * public void setSastHistEstConvs(List<SastHistEstConv> sastHistEstConvs) {
	 * this.sastHistEstConvs = sastHistEstConvs; }
	 * 
	 * public List<SastHistEstCfdi> getSastHistEstCfdis() { return
	 * this.sastHistEstCfdis; }
	 * 
	 * public void setSastHistEstCfdis(List<SastHistEstCfdi> sastHistEstCfdis) {
	 * this.sastHistEstCfdis = sastHistEstCfdis; }
	 * 
	 * public List<SastHistEstSin> getSastHistEstSin() { return this.sastHistEstSin;
	 * }
	 * 
	 * public void setSastHistEstSin(List<SastHistEstSin> sastHistEstSin) {
	 * this.sastHistEstSin = sastHistEstSin; }
	 */

	public boolean equals(Object obj) {
		if (!(obj instanceof SastEstatus))
			return false;
		SastEstatus other = (SastEstatus) obj;
		if ((this.cveEstatus == null && other.cveEstatus != null)
				|| (this.cveEstatus != null && !this.cveEstatus.equals(other.cveEstatus)))
			return false;
		return true;
	}

	public int hashCode() {
		int hash = 0;
		hash += (this.cveEstatus != null) ? this.cveEstatus.hashCode() : 0;
		return hash;
	}
}
