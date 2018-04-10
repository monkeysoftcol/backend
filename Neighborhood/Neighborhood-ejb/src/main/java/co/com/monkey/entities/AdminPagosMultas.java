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
@Table(name = "admin_pagos_multas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminPagosMultas.findAll", query = "SELECT a FROM AdminPagosMultas a")
    , @NamedQuery(name = "AdminPagosMultas.findByPagoMultasId", query = "SELECT a FROM AdminPagosMultas a WHERE a.pagoMultasId = :pagoMultasId")
    , @NamedQuery(name = "AdminPagosMultas.findByPagoMultasIdUsuario", query = "SELECT a FROM AdminPagosMultas a WHERE a.pagoMultasIdUsuario = :pagoMultasIdUsuario")
    , @NamedQuery(name = "AdminPagosMultas.findByPagoMultasIdConjunto", query = "SELECT a FROM AdminPagosMultas a WHERE a.pagoMultasIdConjunto = :pagoMultasIdConjunto")
    , @NamedQuery(name = "AdminPagosMultas.findByPagoMultasEstado", query = "SELECT a FROM AdminPagosMultas a WHERE a.pagoMultasEstado = :pagoMultasEstado")
    , @NamedQuery(name = "AdminPagosMultas.findByPagoMultasFecha", query = "SELECT a FROM AdminPagosMultas a WHERE a.pagoMultasFecha = :pagoMultasFecha")
    , @NamedQuery(name = "AdminPagosMultas.findByPagoMultasIdConcepto", query = "SELECT a FROM AdminPagosMultas a WHERE a.pagoMultasIdConcepto = :pagoMultasIdConcepto")})
public class AdminPagosMultas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_multas_id")
    private BigDecimal pagoMultasId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_multas_id_usuario")
    private BigInteger pagoMultasIdUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_multas_id_conjunto")
    private BigInteger pagoMultasIdConjunto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "pago_multas_estado")
    private String pagoMultasEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_multas_fecha")
    @Temporal(TemporalType.DATE)
    private Date pagoMultasFecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pago_multas_id_concepto")
    private BigInteger pagoMultasIdConcepto;
    @JoinColumn(name = "pago_multas_valor", referencedColumnName = "valor_id")
    @ManyToOne(optional = false)
    private PaValor pagoMultasValor;

    public AdminPagosMultas() {
    }

    public AdminPagosMultas(BigDecimal pagoMultasId) {
        this.pagoMultasId = pagoMultasId;
    }

    public AdminPagosMultas(BigDecimal pagoMultasId, BigInteger pagoMultasIdUsuario, BigInteger pagoMultasIdConjunto, String pagoMultasEstado, Date pagoMultasFecha, BigInteger pagoMultasIdConcepto) {
        this.pagoMultasId = pagoMultasId;
        this.pagoMultasIdUsuario = pagoMultasIdUsuario;
        this.pagoMultasIdConjunto = pagoMultasIdConjunto;
        this.pagoMultasEstado = pagoMultasEstado;
        this.pagoMultasFecha = pagoMultasFecha;
        this.pagoMultasIdConcepto = pagoMultasIdConcepto;
    }

    public BigDecimal getPagoMultasId() {
        return pagoMultasId;
    }

    public void setPagoMultasId(BigDecimal pagoMultasId) {
        this.pagoMultasId = pagoMultasId;
    }

    public BigInteger getPagoMultasIdUsuario() {
        return pagoMultasIdUsuario;
    }

    public void setPagoMultasIdUsuario(BigInteger pagoMultasIdUsuario) {
        this.pagoMultasIdUsuario = pagoMultasIdUsuario;
    }

    public BigInteger getPagoMultasIdConjunto() {
        return pagoMultasIdConjunto;
    }

    public void setPagoMultasIdConjunto(BigInteger pagoMultasIdConjunto) {
        this.pagoMultasIdConjunto = pagoMultasIdConjunto;
    }

    public String getPagoMultasEstado() {
        return pagoMultasEstado;
    }

    public void setPagoMultasEstado(String pagoMultasEstado) {
        this.pagoMultasEstado = pagoMultasEstado;
    }

    public Date getPagoMultasFecha() {
        return pagoMultasFecha;
    }

    public void setPagoMultasFecha(Date pagoMultasFecha) {
        this.pagoMultasFecha = pagoMultasFecha;
    }

    public BigInteger getPagoMultasIdConcepto() {
        return pagoMultasIdConcepto;
    }

    public void setPagoMultasIdConcepto(BigInteger pagoMultasIdConcepto) {
        this.pagoMultasIdConcepto = pagoMultasIdConcepto;
    }

    public PaValor getPagoMultasValor() {
        return pagoMultasValor;
    }

    public void setPagoMultasValor(PaValor pagoMultasValor) {
        this.pagoMultasValor = pagoMultasValor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagoMultasId != null ? pagoMultasId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminPagosMultas)) {
            return false;
        }
        AdminPagosMultas other = (AdminPagosMultas) object;
        if ((this.pagoMultasId == null && other.pagoMultasId != null) || (this.pagoMultasId != null && !this.pagoMultasId.equals(other.pagoMultasId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.monkey.entities.AdminPagosMultas[ pagoMultasId=" + pagoMultasId + " ]";
    }
    
}
