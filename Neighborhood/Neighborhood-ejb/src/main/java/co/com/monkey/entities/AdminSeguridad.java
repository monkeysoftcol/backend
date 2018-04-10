/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ccepeda
 */
@Entity
@Table(name = "admin_seguridad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminSeguridad.findAll", query = "SELECT a FROM AdminSeguridad a")
    , @NamedQuery(name = "AdminSeguridad.findBySeguridadId", query = "SELECT a FROM AdminSeguridad a WHERE a.seguridadId = :seguridadId")
    , @NamedQuery(name = "AdminSeguridad.findBySeguridadIdConjunto", query = "SELECT a FROM AdminSeguridad a WHERE a.seguridadIdConjunto = :seguridadIdConjunto")
    , @NamedQuery(name = "AdminSeguridad.findBySeguridadEstado", query = "SELECT a FROM AdminSeguridad a WHERE a.seguridadEstado = :seguridadEstado")
    , @NamedQuery(name = "AdminSeguridad.findBySeguridadEmpresa", query = "SELECT a FROM AdminSeguridad a WHERE a.seguridadEmpresa = :seguridadEmpresa")})
public class AdminSeguridad implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "seguridad_id")
    private BigDecimal seguridadId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "seguridad_id_conjunto")
    private BigInteger seguridadIdConjunto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "seguridad_estado")
    private String seguridadEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "seguridad_empresa")
    private BigInteger seguridadEmpresa;

    public AdminSeguridad() {
    }

    public AdminSeguridad(BigDecimal seguridadId) {
        this.seguridadId = seguridadId;
    }

    public AdminSeguridad(BigDecimal seguridadId, BigInteger seguridadIdConjunto, String seguridadEstado, BigInteger seguridadEmpresa) {
        this.seguridadId = seguridadId;
        this.seguridadIdConjunto = seguridadIdConjunto;
        this.seguridadEstado = seguridadEstado;
        this.seguridadEmpresa = seguridadEmpresa;
    }

    public BigDecimal getSeguridadId() {
        return seguridadId;
    }

    public void setSeguridadId(BigDecimal seguridadId) {
        this.seguridadId = seguridadId;
    }

    public BigInteger getSeguridadIdConjunto() {
        return seguridadIdConjunto;
    }

    public void setSeguridadIdConjunto(BigInteger seguridadIdConjunto) {
        this.seguridadIdConjunto = seguridadIdConjunto;
    }

    public String getSeguridadEstado() {
        return seguridadEstado;
    }

    public void setSeguridadEstado(String seguridadEstado) {
        this.seguridadEstado = seguridadEstado;
    }

    public BigInteger getSeguridadEmpresa() {
        return seguridadEmpresa;
    }

    public void setSeguridadEmpresa(BigInteger seguridadEmpresa) {
        this.seguridadEmpresa = seguridadEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seguridadId != null ? seguridadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminSeguridad)) {
            return false;
        }
        AdminSeguridad other = (AdminSeguridad) object;
        if ((this.seguridadId == null && other.seguridadId != null) || (this.seguridadId != null && !this.seguridadId.equals(other.seguridadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.monkey.entities.AdminSeguridad[ seguridadId=" + seguridadId + " ]";
    }
    
}
