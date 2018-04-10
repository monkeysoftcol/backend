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
@Table(name = "pa_empresa_seguridad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaEmpresaSeguridad.findAll", query = "SELECT p FROM PaEmpresaSeguridad p")
    , @NamedQuery(name = "PaEmpresaSeguridad.findByEmpreseguridadId", query = "SELECT p FROM PaEmpresaSeguridad p WHERE p.empreseguridadId = :empreseguridadId")
    , @NamedQuery(name = "PaEmpresaSeguridad.findByEmpreseguridadNombre", query = "SELECT p FROM PaEmpresaSeguridad p WHERE p.empreseguridadNombre = :empreseguridadNombre")
    , @NamedQuery(name = "PaEmpresaSeguridad.findByEmpreseguridadEstado", query = "SELECT p FROM PaEmpresaSeguridad p WHERE p.empreseguridadEstado = :empreseguridadEstado")
    , @NamedQuery(name = "PaEmpresaSeguridad.findByEmpreseguridadRepelegal", query = "SELECT p FROM PaEmpresaSeguridad p WHERE p.empreseguridadRepelegal = :empreseguridadRepelegal")
    , @NamedQuery(name = "PaEmpresaSeguridad.findByEmpreseguridadTelefono", query = "SELECT p FROM PaEmpresaSeguridad p WHERE p.empreseguridadTelefono = :empreseguridadTelefono")
    , @NamedQuery(name = "PaEmpresaSeguridad.findByEmpreseguridadDireccion", query = "SELECT p FROM PaEmpresaSeguridad p WHERE p.empreseguridadDireccion = :empreseguridadDireccion")
    , @NamedQuery(name = "PaEmpresaSeguridad.findByEmpreseguridadEmail", query = "SELECT p FROM PaEmpresaSeguridad p WHERE p.empreseguridadEmail = :empreseguridadEmail")
    , @NamedQuery(name = "PaEmpresaSeguridad.findByEmpreseguridadCiudad", query = "SELECT p FROM PaEmpresaSeguridad p WHERE p.empreseguridadCiudad = :empreseguridadCiudad")
    , @NamedQuery(name = "PaEmpresaSeguridad.findByEmpreseguridadPais", query = "SELECT p FROM PaEmpresaSeguridad p WHERE p.empreseguridadPais = :empreseguridadPais")})
public class PaEmpresaSeguridad implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "empreseguridad_id")
    private BigDecimal empreseguridadId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "empreseguridad_nombre")
    private String empreseguridadNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "empreseguridad_estado")
    private String empreseguridadEstado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "empreseguridad_repelegal")
    private String empreseguridadRepelegal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "empreseguridad_telefono")
    private String empreseguridadTelefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "empreseguridad_direccion")
    private String empreseguridadDireccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "empreseguridad_email")
    private String empreseguridadEmail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "empreseguridad_ciudad")
    private BigInteger empreseguridadCiudad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "empreseguridad_pais")
    private BigInteger empreseguridadPais;

    public PaEmpresaSeguridad() {
    }

    public PaEmpresaSeguridad(BigDecimal empreseguridadId) {
        this.empreseguridadId = empreseguridadId;
    }

    public PaEmpresaSeguridad(BigDecimal empreseguridadId, String empreseguridadNombre, String empreseguridadEstado, String empreseguridadRepelegal, String empreseguridadTelefono, String empreseguridadDireccion, String empreseguridadEmail, BigInteger empreseguridadCiudad, BigInteger empreseguridadPais) {
        this.empreseguridadId = empreseguridadId;
        this.empreseguridadNombre = empreseguridadNombre;
        this.empreseguridadEstado = empreseguridadEstado;
        this.empreseguridadRepelegal = empreseguridadRepelegal;
        this.empreseguridadTelefono = empreseguridadTelefono;
        this.empreseguridadDireccion = empreseguridadDireccion;
        this.empreseguridadEmail = empreseguridadEmail;
        this.empreseguridadCiudad = empreseguridadCiudad;
        this.empreseguridadPais = empreseguridadPais;
    }

    public BigDecimal getEmpreseguridadId() {
        return empreseguridadId;
    }

    public void setEmpreseguridadId(BigDecimal empreseguridadId) {
        this.empreseguridadId = empreseguridadId;
    }

    public String getEmpreseguridadNombre() {
        return empreseguridadNombre;
    }

    public void setEmpreseguridadNombre(String empreseguridadNombre) {
        this.empreseguridadNombre = empreseguridadNombre;
    }

    public String getEmpreseguridadEstado() {
        return empreseguridadEstado;
    }

    public void setEmpreseguridadEstado(String empreseguridadEstado) {
        this.empreseguridadEstado = empreseguridadEstado;
    }

    public String getEmpreseguridadRepelegal() {
        return empreseguridadRepelegal;
    }

    public void setEmpreseguridadRepelegal(String empreseguridadRepelegal) {
        this.empreseguridadRepelegal = empreseguridadRepelegal;
    }

    public String getEmpreseguridadTelefono() {
        return empreseguridadTelefono;
    }

    public void setEmpreseguridadTelefono(String empreseguridadTelefono) {
        this.empreseguridadTelefono = empreseguridadTelefono;
    }

    public String getEmpreseguridadDireccion() {
        return empreseguridadDireccion;
    }

    public void setEmpreseguridadDireccion(String empreseguridadDireccion) {
        this.empreseguridadDireccion = empreseguridadDireccion;
    }

    public String getEmpreseguridadEmail() {
        return empreseguridadEmail;
    }

    public void setEmpreseguridadEmail(String empreseguridadEmail) {
        this.empreseguridadEmail = empreseguridadEmail;
    }

    public BigInteger getEmpreseguridadCiudad() {
        return empreseguridadCiudad;
    }

    public void setEmpreseguridadCiudad(BigInteger empreseguridadCiudad) {
        this.empreseguridadCiudad = empreseguridadCiudad;
    }

    public BigInteger getEmpreseguridadPais() {
        return empreseguridadPais;
    }

    public void setEmpreseguridadPais(BigInteger empreseguridadPais) {
        this.empreseguridadPais = empreseguridadPais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empreseguridadId != null ? empreseguridadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaEmpresaSeguridad)) {
            return false;
        }
        PaEmpresaSeguridad other = (PaEmpresaSeguridad) object;
        if ((this.empreseguridadId == null && other.empreseguridadId != null) || (this.empreseguridadId != null && !this.empreseguridadId.equals(other.empreseguridadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.monkey.entities.PaEmpresaSeguridad[ empreseguridadId=" + empreseguridadId + " ]";
    }
    
}
