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
@Table(name = "admin_pagos_parqueadero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminPagosParqueadero.findAll", query = "SELECT a FROM AdminPagosParqueadero a")
    , @NamedQuery(name = "AdminPagosParqueadero.findByPagoParqueId", query = "SELECT a FROM AdminPagosParqueadero a WHERE a.pagoParqueId = :pagoParqueId")
    , @NamedQuery(name = "AdminPagosParqueadero.findByPagoParqueIdUsuario", query = "SELECT a FROM AdminPagosParqueadero a WHERE a.pagoParqueIdUsuario = :pagoParqueIdUsuario")
    , @NamedQuery(name = "AdminPagosParqueadero.findByPagoParqueNumeroParqueadero", query = "SELECT a FROM AdminPagosParqueadero a WHERE a.pagoParqueNumeroParqueadero = :pagoParqueNumeroParqueadero")
    , @NamedQuery(name = "AdminPagosParqueadero.findByPagoParqueIdConjunto", query = "SELECT a FROM AdminPagosParqueadero a WHERE a.pagoParqueIdConjunto = :pagoParqueIdConjunto")
    , @NamedQuery(name = "AdminPagosParqueadero.findByPagoParqueEstado", query = "SELECT a FROM AdminPagosParqueadero a WHERE a.pagoParqueEstado = :pagoParqueEstado")
    , @NamedQuery(name = "AdminPagosParqueadero.findByPagoParqueFecha", query = "SELECT a FROM AdminPagosParqueadero a WHERE a.pagoParqueFecha = :pagoParqueFecha")})
public class AdminPagosParqueadero implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_parque_id")
    private BigDecimal pagoParqueId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_parque_id_usuario")
    private BigInteger pagoParqueIdUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_parque_numero_parqueadero")
    private BigInteger pagoParqueNumeroParqueadero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_parque_id_conjunto")
    private BigInteger pagoParqueIdConjunto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "pago_parque_estado")
    private String pagoParqueEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_parque_fecha")
    @Temporal(TemporalType.DATE)
    private Date pagoParqueFecha;
    @JoinColumn(name = "pago_parque_valor", referencedColumnName = "valor_id")
    @ManyToOne(optional = false)
    private PaValor pagoParqueValor;

    public AdminPagosParqueadero() {
    }

    public AdminPagosParqueadero(BigDecimal pagoParqueId) {
        this.pagoParqueId = pagoParqueId;
    }

    public AdminPagosParqueadero(BigDecimal pagoParqueId, BigInteger pagoParqueIdUsuario, BigInteger pagoParqueNumeroParqueadero, BigInteger pagoParqueIdConjunto, String pagoParqueEstado, Date pagoParqueFecha) {
        this.pagoParqueId = pagoParqueId;
        this.pagoParqueIdUsuario = pagoParqueIdUsuario;
        this.pagoParqueNumeroParqueadero = pagoParqueNumeroParqueadero;
        this.pagoParqueIdConjunto = pagoParqueIdConjunto;
        this.pagoParqueEstado = pagoParqueEstado;
        this.pagoParqueFecha = pagoParqueFecha;
    }

    public BigDecimal getPagoParqueId() {
        return pagoParqueId;
    }

    public void setPagoParqueId(BigDecimal pagoParqueId) {
        this.pagoParqueId = pagoParqueId;
    }

    public BigInteger getPagoParqueIdUsuario() {
        return pagoParqueIdUsuario;
    }

    public void setPagoParqueIdUsuario(BigInteger pagoParqueIdUsuario) {
        this.pagoParqueIdUsuario = pagoParqueIdUsuario;
    }

    public BigInteger getPagoParqueNumeroParqueadero() {
        return pagoParqueNumeroParqueadero;
    }

    public void setPagoParqueNumeroParqueadero(BigInteger pagoParqueNumeroParqueadero) {
        this.pagoParqueNumeroParqueadero = pagoParqueNumeroParqueadero;
    }

    public BigInteger getPagoParqueIdConjunto() {
        return pagoParqueIdConjunto;
    }

    public void setPagoParqueIdConjunto(BigInteger pagoParqueIdConjunto) {
        this.pagoParqueIdConjunto = pagoParqueIdConjunto;
    }

    public String getPagoParqueEstado() {
        return pagoParqueEstado;
    }

    public void setPagoParqueEstado(String pagoParqueEstado) {
        this.pagoParqueEstado = pagoParqueEstado;
    }

    public Date getPagoParqueFecha() {
        return pagoParqueFecha;
    }

    public void setPagoParqueFecha(Date pagoParqueFecha) {
        this.pagoParqueFecha = pagoParqueFecha;
    }

    public PaValor getPagoParqueValor() {
        return pagoParqueValor;
    }

    public void setPagoParqueValor(PaValor pagoParqueValor) {
        this.pagoParqueValor = pagoParqueValor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagoParqueId != null ? pagoParqueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminPagosParqueadero)) {
            return false;
        }
        AdminPagosParqueadero other = (AdminPagosParqueadero) object;
        if ((this.pagoParqueId == null && other.pagoParqueId != null) || (this.pagoParqueId != null && !this.pagoParqueId.equals(other.pagoParqueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.monkey.entities.AdminPagosParqueadero[ pagoParqueId=" + pagoParqueId + " ]";
    }
    
}
