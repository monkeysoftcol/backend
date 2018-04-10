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
@Table(name = "admin_pqr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminPqr.findAll", query = "SELECT a FROM AdminPqr a")
    , @NamedQuery(name = "AdminPqr.findByPqrId", query = "SELECT a FROM AdminPqr a WHERE a.pqrId = :pqrId")
    , @NamedQuery(name = "AdminPqr.findByPqrEstado", query = "SELECT a FROM AdminPqr a WHERE a.pqrEstado = :pqrEstado")
    , @NamedQuery(name = "AdminPqr.findByPqrFechaRegistro", query = "SELECT a FROM AdminPqr a WHERE a.pqrFechaRegistro = :pqrFechaRegistro")
    , @NamedQuery(name = "AdminPqr.findByPqrDetalle", query = "SELECT a FROM AdminPqr a WHERE a.pqrDetalle = :pqrDetalle")
    , @NamedQuery(name = "AdminPqr.findByPqrIdUsuario", query = "SELECT a FROM AdminPqr a WHERE a.pqrIdUsuario = :pqrIdUsuario")
    , @NamedQuery(name = "AdminPqr.findByPqrIdConjunto", query = "SELECT a FROM AdminPqr a WHERE a.pqrIdConjunto = :pqrIdConjunto")
    , @NamedQuery(name = "AdminPqr.findByPqrFechaSolucion", query = "SELECT a FROM AdminPqr a WHERE a.pqrFechaSolucion = :pqrFechaSolucion")})
public class AdminPqr implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pqr_id")
    private BigDecimal pqrId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "pqr_estado")
    private String pqrEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pqr_fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date pqrFechaRegistro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "pqr_detalle")
    private String pqrDetalle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pqr_id_usuario")
    private BigInteger pqrIdUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pqr_id_conjunto")
    private BigInteger pqrIdConjunto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pqr_fecha_solucion")
    @Temporal(TemporalType.DATE)
    private Date pqrFechaSolucion;

    public AdminPqr() {
    }

    public AdminPqr(BigDecimal pqrId) {
        this.pqrId = pqrId;
    }

    public AdminPqr(BigDecimal pqrId, String pqrEstado, Date pqrFechaRegistro, String pqrDetalle, BigInteger pqrIdUsuario, BigInteger pqrIdConjunto, Date pqrFechaSolucion) {
        this.pqrId = pqrId;
        this.pqrEstado = pqrEstado;
        this.pqrFechaRegistro = pqrFechaRegistro;
        this.pqrDetalle = pqrDetalle;
        this.pqrIdUsuario = pqrIdUsuario;
        this.pqrIdConjunto = pqrIdConjunto;
        this.pqrFechaSolucion = pqrFechaSolucion;
    }

    public BigDecimal getPqrId() {
        return pqrId;
    }

    public void setPqrId(BigDecimal pqrId) {
        this.pqrId = pqrId;
    }

    public String getPqrEstado() {
        return pqrEstado;
    }

    public void setPqrEstado(String pqrEstado) {
        this.pqrEstado = pqrEstado;
    }

    public Date getPqrFechaRegistro() {
        return pqrFechaRegistro;
    }

    public void setPqrFechaRegistro(Date pqrFechaRegistro) {
        this.pqrFechaRegistro = pqrFechaRegistro;
    }

    public String getPqrDetalle() {
        return pqrDetalle;
    }

    public void setPqrDetalle(String pqrDetalle) {
        this.pqrDetalle = pqrDetalle;
    }

    public BigInteger getPqrIdUsuario() {
        return pqrIdUsuario;
    }

    public void setPqrIdUsuario(BigInteger pqrIdUsuario) {
        this.pqrIdUsuario = pqrIdUsuario;
    }

    public BigInteger getPqrIdConjunto() {
        return pqrIdConjunto;
    }

    public void setPqrIdConjunto(BigInteger pqrIdConjunto) {
        this.pqrIdConjunto = pqrIdConjunto;
    }

    public Date getPqrFechaSolucion() {
        return pqrFechaSolucion;
    }

    public void setPqrFechaSolucion(Date pqrFechaSolucion) {
        this.pqrFechaSolucion = pqrFechaSolucion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pqrId != null ? pqrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminPqr)) {
            return false;
        }
        AdminPqr other = (AdminPqr) object;
        if ((this.pqrId == null && other.pqrId != null) || (this.pqrId != null && !this.pqrId.equals(other.pqrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.monkey.entities.AdminPqr[ pqrId=" + pqrId + " ]";
    }
    
}
