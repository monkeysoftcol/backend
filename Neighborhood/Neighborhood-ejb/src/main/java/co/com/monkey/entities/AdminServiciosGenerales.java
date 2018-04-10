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
@Table(name = "admin_servicios_generales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminServiciosGenerales.findAll", query = "SELECT a FROM AdminServiciosGenerales a")
    , @NamedQuery(name = "AdminServiciosGenerales.findByServigeneralesId", query = "SELECT a FROM AdminServiciosGenerales a WHERE a.servigeneralesId = :servigeneralesId")
    , @NamedQuery(name = "AdminServiciosGenerales.findByServigeneralesIdConjunto", query = "SELECT a FROM AdminServiciosGenerales a WHERE a.servigeneralesIdConjunto = :servigeneralesIdConjunto")
    , @NamedQuery(name = "AdminServiciosGenerales.findByServigeneralesEstado", query = "SELECT a FROM AdminServiciosGenerales a WHERE a.servigeneralesEstado = :servigeneralesEstado")
    , @NamedQuery(name = "AdminServiciosGenerales.findByServigeneralesEmpresa", query = "SELECT a FROM AdminServiciosGenerales a WHERE a.servigeneralesEmpresa = :servigeneralesEmpresa")})
public class AdminServiciosGenerales implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "servigenerales_id")
    private BigDecimal servigeneralesId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "servigenerales_id_conjunto")
    private BigInteger servigeneralesIdConjunto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "servigenerales_estado")
    private String servigeneralesEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "servigenerales_empresa")
    private BigInteger servigeneralesEmpresa;

    public AdminServiciosGenerales() {
    }

    public AdminServiciosGenerales(BigDecimal servigeneralesId) {
        this.servigeneralesId = servigeneralesId;
    }

    public AdminServiciosGenerales(BigDecimal servigeneralesId, BigInteger servigeneralesIdConjunto, String servigeneralesEstado, BigInteger servigeneralesEmpresa) {
        this.servigeneralesId = servigeneralesId;
        this.servigeneralesIdConjunto = servigeneralesIdConjunto;
        this.servigeneralesEstado = servigeneralesEstado;
        this.servigeneralesEmpresa = servigeneralesEmpresa;
    }

    public BigDecimal getServigeneralesId() {
        return servigeneralesId;
    }

    public void setServigeneralesId(BigDecimal servigeneralesId) {
        this.servigeneralesId = servigeneralesId;
    }

    public BigInteger getServigeneralesIdConjunto() {
        return servigeneralesIdConjunto;
    }

    public void setServigeneralesIdConjunto(BigInteger servigeneralesIdConjunto) {
        this.servigeneralesIdConjunto = servigeneralesIdConjunto;
    }

    public String getServigeneralesEstado() {
        return servigeneralesEstado;
    }

    public void setServigeneralesEstado(String servigeneralesEstado) {
        this.servigeneralesEstado = servigeneralesEstado;
    }

    public BigInteger getServigeneralesEmpresa() {
        return servigeneralesEmpresa;
    }

    public void setServigeneralesEmpresa(BigInteger servigeneralesEmpresa) {
        this.servigeneralesEmpresa = servigeneralesEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (servigeneralesId != null ? servigeneralesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminServiciosGenerales)) {
            return false;
        }
        AdminServiciosGenerales other = (AdminServiciosGenerales) object;
        if ((this.servigeneralesId == null && other.servigeneralesId != null) || (this.servigeneralesId != null && !this.servigeneralesId.equals(other.servigeneralesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.monkey.entities.AdminServiciosGenerales[ servigeneralesId=" + servigeneralesId + " ]";
    }
    
}
