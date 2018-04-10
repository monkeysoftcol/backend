/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ccepeda
 */
@Entity
@Table(name = "admin_solicitud_mudanza")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminSolicitudMudanza.findAll", query = "SELECT a FROM AdminSolicitudMudanza a")
    , @NamedQuery(name = "AdminSolicitudMudanza.findByMudanzaId", query = "SELECT a FROM AdminSolicitudMudanza a WHERE a.mudanzaId = :mudanzaId")
    , @NamedQuery(name = "AdminSolicitudMudanza.findByMudanzaIdUsuario", query = "SELECT a FROM AdminSolicitudMudanza a WHERE a.mudanzaIdUsuario = :mudanzaIdUsuario")
    , @NamedQuery(name = "AdminSolicitudMudanza.findByMudanzaIdConjunto", query = "SELECT a FROM AdminSolicitudMudanza a WHERE a.mudanzaIdConjunto = :mudanzaIdConjunto")
    , @NamedQuery(name = "AdminSolicitudMudanza.findByMudanzaEstado", query = "SELECT a FROM AdminSolicitudMudanza a WHERE a.mudanzaEstado = :mudanzaEstado")
    , @NamedQuery(name = "AdminSolicitudMudanza.findByMudanzaFechaSolicitud", query = "SELECT a FROM AdminSolicitudMudanza a WHERE a.mudanzaFechaSolicitud = :mudanzaFechaSolicitud")
    , @NamedQuery(name = "AdminSolicitudMudanza.findByMudanzaFechaMudanza", query = "SELECT a FROM AdminSolicitudMudanza a WHERE a.mudanzaFechaMudanza = :mudanzaFechaMudanza")
    , @NamedQuery(name = "AdminSolicitudMudanza.findByMudanzaIdEmpresa", query = "SELECT a FROM AdminSolicitudMudanza a WHERE a.mudanzaIdEmpresa = :mudanzaIdEmpresa")
    , @NamedQuery(name = "AdminSolicitudMudanza.findByMudanzaObservacion", query = "SELECT a FROM AdminSolicitudMudanza a WHERE a.mudanzaObservacion = :mudanzaObservacion")})
public class AdminSolicitudMudanza implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "mudanza_id")
    private BigDecimal mudanzaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mudanza_id_usuario")
    private BigInteger mudanzaIdUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mudanza_id_conjunto")
    private BigInteger mudanzaIdConjunto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "mudanza_estado")
    private String mudanzaEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mudanza_fecha_solicitud")
    @Temporal(TemporalType.DATE)
    private Date mudanzaFechaSolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mudanza_fecha_mudanza")
    @Temporal(TemporalType.DATE)
    private Date mudanzaFechaMudanza;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mudanza_id_empresa")
    private BigInteger mudanzaIdEmpresa;
    @Size(max = 255)
    @Column(name = "mudanza_observacion")
    private String mudanzaObservacion;

    public AdminSolicitudMudanza() {
    }

    public AdminSolicitudMudanza(BigDecimal mudanzaId) {
        this.mudanzaId = mudanzaId;
    }

    public AdminSolicitudMudanza(BigDecimal mudanzaId, BigInteger mudanzaIdUsuario, BigInteger mudanzaIdConjunto, String mudanzaEstado, Date mudanzaFechaSolicitud, Date mudanzaFechaMudanza, BigInteger mudanzaIdEmpresa) {
        this.mudanzaId = mudanzaId;
        this.mudanzaIdUsuario = mudanzaIdUsuario;
        this.mudanzaIdConjunto = mudanzaIdConjunto;
        this.mudanzaEstado = mudanzaEstado;
        this.mudanzaFechaSolicitud = mudanzaFechaSolicitud;
        this.mudanzaFechaMudanza = mudanzaFechaMudanza;
        this.mudanzaIdEmpresa = mudanzaIdEmpresa;
    }

    public BigDecimal getMudanzaId() {
        return mudanzaId;
    }

    public void setMudanzaId(BigDecimal mudanzaId) {
        this.mudanzaId = mudanzaId;
    }

    public BigInteger getMudanzaIdUsuario() {
        return mudanzaIdUsuario;
    }

    public void setMudanzaIdUsuario(BigInteger mudanzaIdUsuario) {
        this.mudanzaIdUsuario = mudanzaIdUsuario;
    }

    public BigInteger getMudanzaIdConjunto() {
        return mudanzaIdConjunto;
    }

    public void setMudanzaIdConjunto(BigInteger mudanzaIdConjunto) {
        this.mudanzaIdConjunto = mudanzaIdConjunto;
    }

    public String getMudanzaEstado() {
        return mudanzaEstado;
    }

    public void setMudanzaEstado(String mudanzaEstado) {
        this.mudanzaEstado = mudanzaEstado;
    }

    public Date getMudanzaFechaSolicitud() {
        return mudanzaFechaSolicitud;
    }

    public void setMudanzaFechaSolicitud(Date mudanzaFechaSolicitud) {
        this.mudanzaFechaSolicitud = mudanzaFechaSolicitud;
    }

    public Date getMudanzaFechaMudanza() {
        return mudanzaFechaMudanza;
    }

    public void setMudanzaFechaMudanza(Date mudanzaFechaMudanza) {
        this.mudanzaFechaMudanza = mudanzaFechaMudanza;
    }

    public BigInteger getMudanzaIdEmpresa() {
        return mudanzaIdEmpresa;
    }

    public void setMudanzaIdEmpresa(BigInteger mudanzaIdEmpresa) {
        this.mudanzaIdEmpresa = mudanzaIdEmpresa;
    }

    public String getMudanzaObservacion() {
        return mudanzaObservacion;
    }

    public void setMudanzaObservacion(String mudanzaObservacion) {
        this.mudanzaObservacion = mudanzaObservacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mudanzaId != null ? mudanzaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminSolicitudMudanza)) {
            return false;
        }
        AdminSolicitudMudanza other = (AdminSolicitudMudanza) object;
        if ((this.mudanzaId == null && other.mudanzaId != null) || (this.mudanzaId != null && !this.mudanzaId.equals(other.mudanzaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.monkey.entities.AdminSolicitudMudanza[ mudanzaId=" + mudanzaId + " ]";
    }
    
}
