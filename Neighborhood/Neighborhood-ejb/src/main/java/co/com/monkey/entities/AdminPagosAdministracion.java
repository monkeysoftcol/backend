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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "admin_pagos_administracion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminPagosAdministracion.findAll", query = "SELECT a FROM AdminPagosAdministracion a")
    , @NamedQuery(name = "AdminPagosAdministracion.findByPagoAdminId", query = "SELECT a FROM AdminPagosAdministracion a WHERE a.pagoAdminId = :pagoAdminId")
    , @NamedQuery(name = "AdminPagosAdministracion.findByPagoAdminIdUsuario", query = "SELECT a FROM AdminPagosAdministracion a WHERE a.pagoAdminIdUsuario = :pagoAdminIdUsuario")
    , @NamedQuery(name = "AdminPagosAdministracion.findByPagoAdminIdConjunto", query = "SELECT a FROM AdminPagosAdministracion a WHERE a.pagoAdminIdConjunto = :pagoAdminIdConjunto")
    , @NamedQuery(name = "AdminPagosAdministracion.findByPagoAdminEstado", query = "SELECT a FROM AdminPagosAdministracion a WHERE a.pagoAdminEstado = :pagoAdminEstado")
    , @NamedQuery(name = "AdminPagosAdministracion.findByPagoAdminFecha", query = "SELECT a FROM AdminPagosAdministracion a WHERE a.pagoAdminFecha = :pagoAdminFecha")})
public class AdminPagosAdministracion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_admin_id")
    private BigDecimal pagoAdminId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_admin_id_usuario")
    private BigInteger pagoAdminIdUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_admin_id_conjunto")
    private BigInteger pagoAdminIdConjunto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "pago_admin_estado")
    private String pagoAdminEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_admin_fecha")
    @Temporal(TemporalType.DATE)
    private Date pagoAdminFecha;
    @JoinColumn(name = "pago_admin_valor", referencedColumnName = "valor_id")
    @ManyToOne(optional = false)
    private PaValor pagoAdminValor;

    public AdminPagosAdministracion() {
    }

    public AdminPagosAdministracion(BigDecimal pagoAdminId) {
        this.pagoAdminId = pagoAdminId;
    }

    public AdminPagosAdministracion(BigDecimal pagoAdminId, BigInteger pagoAdminIdUsuario, BigInteger pagoAdminIdConjunto, String pagoAdminEstado, Date pagoAdminFecha) {
        this.pagoAdminId = pagoAdminId;
        this.pagoAdminIdUsuario = pagoAdminIdUsuario;
        this.pagoAdminIdConjunto = pagoAdminIdConjunto;
        this.pagoAdminEstado = pagoAdminEstado;
        this.pagoAdminFecha = pagoAdminFecha;
    }

    public BigDecimal getPagoAdminId() {
        return pagoAdminId;
    }

    public void setPagoAdminId(BigDecimal pagoAdminId) {
        this.pagoAdminId = pagoAdminId;
    }

    public BigInteger getPagoAdminIdUsuario() {
        return pagoAdminIdUsuario;
    }

    public void setPagoAdminIdUsuario(BigInteger pagoAdminIdUsuario) {
        this.pagoAdminIdUsuario = pagoAdminIdUsuario;
    }

    public BigInteger getPagoAdminIdConjunto() {
        return pagoAdminIdConjunto;
    }

    public void setPagoAdminIdConjunto(BigInteger pagoAdminIdConjunto) {
        this.pagoAdminIdConjunto = pagoAdminIdConjunto;
    }

    public String getPagoAdminEstado() {
        return pagoAdminEstado;
    }

    public void setPagoAdminEstado(String pagoAdminEstado) {
        this.pagoAdminEstado = pagoAdminEstado;
    }

    public Date getPagoAdminFecha() {
        return pagoAdminFecha;
    }

    public void setPagoAdminFecha(Date pagoAdminFecha) {
        this.pagoAdminFecha = pagoAdminFecha;
    }

    public PaValor getPagoAdminValor() {
        return pagoAdminValor;
    }

    public void setPagoAdminValor(PaValor pagoAdminValor) {
        this.pagoAdminValor = pagoAdminValor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagoAdminId != null ? pagoAdminId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminPagosAdministracion)) {
            return false;
        }
        AdminPagosAdministracion other = (AdminPagosAdministracion) object;
        if ((this.pagoAdminId == null && other.pagoAdminId != null) || (this.pagoAdminId != null && !this.pagoAdminId.equals(other.pagoAdminId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.monkey.entities.AdminPagosAdministracion[ pagoAdminId=" + pagoAdminId + " ]";
    }
    
}
