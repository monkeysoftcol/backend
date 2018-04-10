/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "pa_conceptos_multas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaConceptosMultas.findAll", query = "SELECT p FROM PaConceptosMultas p")
    , @NamedQuery(name = "PaConceptosMultas.findByConceptoMultaId", query = "SELECT p FROM PaConceptosMultas p WHERE p.conceptoMultaId = :conceptoMultaId")
    , @NamedQuery(name = "PaConceptosMultas.findByConceptoMultaDetalle", query = "SELECT p FROM PaConceptosMultas p WHERE p.conceptoMultaDetalle = :conceptoMultaDetalle")
    , @NamedQuery(name = "PaConceptosMultas.findByConceptoMultaEstado", query = "SELECT p FROM PaConceptosMultas p WHERE p.conceptoMultaEstado = :conceptoMultaEstado")})
public class PaConceptosMultas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "concepto_multa_id")
    private BigDecimal conceptoMultaId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "concepto_multa_detalle")
    private String conceptoMultaDetalle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "concepto_multa_estado")
    private String conceptoMultaEstado;

    public PaConceptosMultas() {
    }

    public PaConceptosMultas(BigDecimal conceptoMultaId) {
        this.conceptoMultaId = conceptoMultaId;
    }

    public PaConceptosMultas(BigDecimal conceptoMultaId, String conceptoMultaDetalle, String conceptoMultaEstado) {
        this.conceptoMultaId = conceptoMultaId;
        this.conceptoMultaDetalle = conceptoMultaDetalle;
        this.conceptoMultaEstado = conceptoMultaEstado;
    }

    public BigDecimal getConceptoMultaId() {
        return conceptoMultaId;
    }

    public void setConceptoMultaId(BigDecimal conceptoMultaId) {
        this.conceptoMultaId = conceptoMultaId;
    }

    public String getConceptoMultaDetalle() {
        return conceptoMultaDetalle;
    }

    public void setConceptoMultaDetalle(String conceptoMultaDetalle) {
        this.conceptoMultaDetalle = conceptoMultaDetalle;
    }

    public String getConceptoMultaEstado() {
        return conceptoMultaEstado;
    }

    public void setConceptoMultaEstado(String conceptoMultaEstado) {
        this.conceptoMultaEstado = conceptoMultaEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conceptoMultaId != null ? conceptoMultaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaConceptosMultas)) {
            return false;
        }
        PaConceptosMultas other = (PaConceptosMultas) object;
        if ((this.conceptoMultaId == null && other.conceptoMultaId != null) || (this.conceptoMultaId != null && !this.conceptoMultaId.equals(other.conceptoMultaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.monkey.entities.PaConceptosMultas[ conceptoMultaId=" + conceptoMultaId + " ]";
    }
    
}
