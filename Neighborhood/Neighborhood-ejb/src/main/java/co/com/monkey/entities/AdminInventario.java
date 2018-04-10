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
@Table(name = "admin_inventario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminInventario.findAll", query = "SELECT a FROM AdminInventario a")
    , @NamedQuery(name = "AdminInventario.findByInventarioId", query = "SELECT a FROM AdminInventario a WHERE a.inventarioId = :inventarioId")
    , @NamedQuery(name = "AdminInventario.findByInventarioIdConjunto", query = "SELECT a FROM AdminInventario a WHERE a.inventarioIdConjunto = :inventarioIdConjunto")
    , @NamedQuery(name = "AdminInventario.findByInventarioEstado", query = "SELECT a FROM AdminInventario a WHERE a.inventarioEstado = :inventarioEstado")
    , @NamedQuery(name = "AdminInventario.findByInventarioFechaRegistro", query = "SELECT a FROM AdminInventario a WHERE a.inventarioFechaRegistro = :inventarioFechaRegistro")
    , @NamedQuery(name = "AdminInventario.findByInventarioObservacion", query = "SELECT a FROM AdminInventario a WHERE a.inventarioObservacion = :inventarioObservacion")})
public class AdminInventario implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "inventario_id")
    private BigDecimal inventarioId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "inventario_id_conjunto")
    private BigInteger inventarioIdConjunto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "inventario_estado")
    private String inventarioEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "inventario_fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date inventarioFechaRegistro;
    @Size(max = 255)
    @Column(name = "inventario_observacion")
    private String inventarioObservacion;

    public AdminInventario() {
    }

    public AdminInventario(BigDecimal inventarioId) {
        this.inventarioId = inventarioId;
    }

    public AdminInventario(BigDecimal inventarioId, BigInteger inventarioIdConjunto, String inventarioEstado, Date inventarioFechaRegistro) {
        this.inventarioId = inventarioId;
        this.inventarioIdConjunto = inventarioIdConjunto;
        this.inventarioEstado = inventarioEstado;
        this.inventarioFechaRegistro = inventarioFechaRegistro;
    }

    public BigDecimal getInventarioId() {
        return inventarioId;
    }

    public void setInventarioId(BigDecimal inventarioId) {
        this.inventarioId = inventarioId;
    }

    public BigInteger getInventarioIdConjunto() {
        return inventarioIdConjunto;
    }

    public void setInventarioIdConjunto(BigInteger inventarioIdConjunto) {
        this.inventarioIdConjunto = inventarioIdConjunto;
    }

    public String getInventarioEstado() {
        return inventarioEstado;
    }

    public void setInventarioEstado(String inventarioEstado) {
        this.inventarioEstado = inventarioEstado;
    }

    public Date getInventarioFechaRegistro() {
        return inventarioFechaRegistro;
    }

    public void setInventarioFechaRegistro(Date inventarioFechaRegistro) {
        this.inventarioFechaRegistro = inventarioFechaRegistro;
    }

    public String getInventarioObservacion() {
        return inventarioObservacion;
    }

    public void setInventarioObservacion(String inventarioObservacion) {
        this.inventarioObservacion = inventarioObservacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventarioId != null ? inventarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminInventario)) {
            return false;
        }
        AdminInventario other = (AdminInventario) object;
        if ((this.inventarioId == null && other.inventarioId != null) || (this.inventarioId != null && !this.inventarioId.equals(other.inventarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.monkey.entities.AdminInventario[ inventarioId=" + inventarioId + " ]";
    }
    
}
