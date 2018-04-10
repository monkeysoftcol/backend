/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ccepeda
 */
@Entity
@Table(name = "pa_valor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaValor.findAll", query = "SELECT p FROM PaValor p")
    , @NamedQuery(name = "PaValor.findByValorId", query = "SELECT p FROM PaValor p WHERE p.valorId = :valorId")
    , @NamedQuery(name = "PaValor.findByValorCosto", query = "SELECT p FROM PaValor p WHERE p.valorCosto = :valorCosto")
    , @NamedQuery(name = "PaValor.findByValorConcepto", query = "SELECT p FROM PaValor p WHERE p.valorConcepto = :valorConcepto")
    , @NamedQuery(name = "PaValor.findByValorEstado", query = "SELECT p FROM PaValor p WHERE p.valorEstado = :valorEstado")})
public class PaValor implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_id")
    private BigDecimal valorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_costo")
    private BigInteger valorCosto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "valor_concepto")
    private String valorConcepto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "valor_estado")
    private String valorEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pagoParqueValor")
    private List<AdminPagosParqueadero> adminPagosParqueaderoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pagoMultasValor")
    private List<AdminPagosMultas> adminPagosMultasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pagoAdminValor")
    private List<AdminPagosAdministracion> adminPagosAdministracionList;

    public PaValor() {
    }

    public PaValor(BigDecimal valorId) {
        this.valorId = valorId;
    }

    public PaValor(BigDecimal valorId, BigInteger valorCosto, String valorConcepto, String valorEstado) {
        this.valorId = valorId;
        this.valorCosto = valorCosto;
        this.valorConcepto = valorConcepto;
        this.valorEstado = valorEstado;
    }

    public BigDecimal getValorId() {
        return valorId;
    }

    public void setValorId(BigDecimal valorId) {
        this.valorId = valorId;
    }

    public BigInteger getValorCosto() {
        return valorCosto;
    }

    public void setValorCosto(BigInteger valorCosto) {
        this.valorCosto = valorCosto;
    }

    public String getValorConcepto() {
        return valorConcepto;
    }

    public void setValorConcepto(String valorConcepto) {
        this.valorConcepto = valorConcepto;
    }

    public String getValorEstado() {
        return valorEstado;
    }

    public void setValorEstado(String valorEstado) {
        this.valorEstado = valorEstado;
    }

    @XmlTransient
    public List<AdminPagosParqueadero> getAdminPagosParqueaderoList() {
        return adminPagosParqueaderoList;
    }

    public void setAdminPagosParqueaderoList(List<AdminPagosParqueadero> adminPagosParqueaderoList) {
        this.adminPagosParqueaderoList = adminPagosParqueaderoList;
    }

    @XmlTransient
    public List<AdminPagosMultas> getAdminPagosMultasList() {
        return adminPagosMultasList;
    }

    public void setAdminPagosMultasList(List<AdminPagosMultas> adminPagosMultasList) {
        this.adminPagosMultasList = adminPagosMultasList;
    }

    @XmlTransient
    public List<AdminPagosAdministracion> getAdminPagosAdministracionList() {
        return adminPagosAdministracionList;
    }

    public void setAdminPagosAdministracionList(List<AdminPagosAdministracion> adminPagosAdministracionList) {
        this.adminPagosAdministracionList = adminPagosAdministracionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (valorId != null ? valorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaValor)) {
            return false;
        }
        PaValor other = (PaValor) object;
        if ((this.valorId == null && other.valorId != null) || (this.valorId != null && !this.valorId.equals(other.valorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.monkey.entities.PaValor[ valorId=" + valorId + " ]";
    }
    
}
