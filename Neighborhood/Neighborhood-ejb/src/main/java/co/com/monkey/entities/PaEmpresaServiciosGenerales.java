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
@Table(name = "pa_empresa_servicios_generales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaEmpresaServiciosGenerales.findAll", query = "SELECT p FROM PaEmpresaServiciosGenerales p")
    , @NamedQuery(name = "PaEmpresaServiciosGenerales.findByEmpreservignralId", query = "SELECT p FROM PaEmpresaServiciosGenerales p WHERE p.empreservignralId = :empreservignralId")
    , @NamedQuery(name = "PaEmpresaServiciosGenerales.findByEmpreservignralNombre", query = "SELECT p FROM PaEmpresaServiciosGenerales p WHERE p.empreservignralNombre = :empreservignralNombre")
    , @NamedQuery(name = "PaEmpresaServiciosGenerales.findByEmpreservignralEstado", query = "SELECT p FROM PaEmpresaServiciosGenerales p WHERE p.empreservignralEstado = :empreservignralEstado")
    , @NamedQuery(name = "PaEmpresaServiciosGenerales.findByEmpreservignralRepelegal", query = "SELECT p FROM PaEmpresaServiciosGenerales p WHERE p.empreservignralRepelegal = :empreservignralRepelegal")
    , @NamedQuery(name = "PaEmpresaServiciosGenerales.findByEmpreservignralTelefono", query = "SELECT p FROM PaEmpresaServiciosGenerales p WHERE p.empreservignralTelefono = :empreservignralTelefono")
    , @NamedQuery(name = "PaEmpresaServiciosGenerales.findByEmpreservignralDireccion", query = "SELECT p FROM PaEmpresaServiciosGenerales p WHERE p.empreservignralDireccion = :empreservignralDireccion")
    , @NamedQuery(name = "PaEmpresaServiciosGenerales.findByEmpreservignralEmail", query = "SELECT p FROM PaEmpresaServiciosGenerales p WHERE p.empreservignralEmail = :empreservignralEmail")
    , @NamedQuery(name = "PaEmpresaServiciosGenerales.findByEmpreservignralCiudad", query = "SELECT p FROM PaEmpresaServiciosGenerales p WHERE p.empreservignralCiudad = :empreservignralCiudad")
    , @NamedQuery(name = "PaEmpresaServiciosGenerales.findByEmpreservignralPais", query = "SELECT p FROM PaEmpresaServiciosGenerales p WHERE p.empreservignralPais = :empreservignralPais")})
public class PaEmpresaServiciosGenerales implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "empreservignral_id")
    private BigDecimal empreservignralId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "empreservignral_nombre")
    private String empreservignralNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "empreservignral_estado")
    private String empreservignralEstado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "empreservignral_repelegal")
    private String empreservignralRepelegal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "empreservignral_telefono")
    private String empreservignralTelefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "empreservignral_direccion")
    private String empreservignralDireccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "empreservignral_email")
    private String empreservignralEmail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "empreservignral_ciudad")
    private BigInteger empreservignralCiudad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "empreservignral_pais")
    private BigInteger empreservignralPais;

    public PaEmpresaServiciosGenerales() {
    }

    public PaEmpresaServiciosGenerales(BigDecimal empreservignralId) {
        this.empreservignralId = empreservignralId;
    }

    public PaEmpresaServiciosGenerales(BigDecimal empreservignralId, String empreservignralNombre, String empreservignralEstado, String empreservignralRepelegal, String empreservignralTelefono, String empreservignralDireccion, String empreservignralEmail, BigInteger empreservignralCiudad, BigInteger empreservignralPais) {
        this.empreservignralId = empreservignralId;
        this.empreservignralNombre = empreservignralNombre;
        this.empreservignralEstado = empreservignralEstado;
        this.empreservignralRepelegal = empreservignralRepelegal;
        this.empreservignralTelefono = empreservignralTelefono;
        this.empreservignralDireccion = empreservignralDireccion;
        this.empreservignralEmail = empreservignralEmail;
        this.empreservignralCiudad = empreservignralCiudad;
        this.empreservignralPais = empreservignralPais;
    }

    public BigDecimal getEmpreservignralId() {
        return empreservignralId;
    }

    public void setEmpreservignralId(BigDecimal empreservignralId) {
        this.empreservignralId = empreservignralId;
    }

    public String getEmpreservignralNombre() {
        return empreservignralNombre;
    }

    public void setEmpreservignralNombre(String empreservignralNombre) {
        this.empreservignralNombre = empreservignralNombre;
    }

    public String getEmpreservignralEstado() {
        return empreservignralEstado;
    }

    public void setEmpreservignralEstado(String empreservignralEstado) {
        this.empreservignralEstado = empreservignralEstado;
    }

    public String getEmpreservignralRepelegal() {
        return empreservignralRepelegal;
    }

    public void setEmpreservignralRepelegal(String empreservignralRepelegal) {
        this.empreservignralRepelegal = empreservignralRepelegal;
    }

    public String getEmpreservignralTelefono() {
        return empreservignralTelefono;
    }

    public void setEmpreservignralTelefono(String empreservignralTelefono) {
        this.empreservignralTelefono = empreservignralTelefono;
    }

    public String getEmpreservignralDireccion() {
        return empreservignralDireccion;
    }

    public void setEmpreservignralDireccion(String empreservignralDireccion) {
        this.empreservignralDireccion = empreservignralDireccion;
    }

    public String getEmpreservignralEmail() {
        return empreservignralEmail;
    }

    public void setEmpreservignralEmail(String empreservignralEmail) {
        this.empreservignralEmail = empreservignralEmail;
    }

    public BigInteger getEmpreservignralCiudad() {
        return empreservignralCiudad;
    }

    public void setEmpreservignralCiudad(BigInteger empreservignralCiudad) {
        this.empreservignralCiudad = empreservignralCiudad;
    }

    public BigInteger getEmpreservignralPais() {
        return empreservignralPais;
    }

    public void setEmpreservignralPais(BigInteger empreservignralPais) {
        this.empreservignralPais = empreservignralPais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empreservignralId != null ? empreservignralId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaEmpresaServiciosGenerales)) {
            return false;
        }
        PaEmpresaServiciosGenerales other = (PaEmpresaServiciosGenerales) object;
        if ((this.empreservignralId == null && other.empreservignralId != null) || (this.empreservignralId != null && !this.empreservignralId.equals(other.empreservignralId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.monkey.entities.PaEmpresaServiciosGenerales[ empreservignralId=" + empreservignralId + " ]";
    }
    
}
