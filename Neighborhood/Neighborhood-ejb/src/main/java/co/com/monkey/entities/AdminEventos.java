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
@Table(name = "admin_eventos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminEventos.findAll", query = "SELECT a FROM AdminEventos a")
    , @NamedQuery(name = "AdminEventos.findByEventosId", query = "SELECT a FROM AdminEventos a WHERE a.eventosId = :eventosId")
    , @NamedQuery(name = "AdminEventos.findByEventosIdConjunto", query = "SELECT a FROM AdminEventos a WHERE a.eventosIdConjunto = :eventosIdConjunto")
    , @NamedQuery(name = "AdminEventos.findByEventosEstado", query = "SELECT a FROM AdminEventos a WHERE a.eventosEstado = :eventosEstado")
    , @NamedQuery(name = "AdminEventos.findByEventosFechaInicio", query = "SELECT a FROM AdminEventos a WHERE a.eventosFechaInicio = :eventosFechaInicio")
    , @NamedQuery(name = "AdminEventos.findByEventosFechaFin", query = "SELECT a FROM AdminEventos a WHERE a.eventosFechaFin = :eventosFechaFin")
    , @NamedQuery(name = "AdminEventos.findByEventosTipoEvento", query = "SELECT a FROM AdminEventos a WHERE a.eventosTipoEvento = :eventosTipoEvento")
    , @NamedQuery(name = "AdminEventos.findByEventosObservacion", query = "SELECT a FROM AdminEventos a WHERE a.eventosObservacion = :eventosObservacion")})
public class AdminEventos implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "eventos_id")
    private BigDecimal eventosId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "eventos_id_conjunto")
    private BigInteger eventosIdConjunto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "eventos_estado")
    private String eventosEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "eventos_fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date eventosFechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "eventos_fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date eventosFechaFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "eventos_tipo_evento")
    private BigInteger eventosTipoEvento;
    @Size(max = 255)
    @Column(name = "eventos_observacion")
    private String eventosObservacion;

    public AdminEventos() {
    }

    public AdminEventos(BigDecimal eventosId) {
        this.eventosId = eventosId;
    }

    public AdminEventos(BigDecimal eventosId, BigInteger eventosIdConjunto, String eventosEstado, Date eventosFechaInicio, Date eventosFechaFin, BigInteger eventosTipoEvento) {
        this.eventosId = eventosId;
        this.eventosIdConjunto = eventosIdConjunto;
        this.eventosEstado = eventosEstado;
        this.eventosFechaInicio = eventosFechaInicio;
        this.eventosFechaFin = eventosFechaFin;
        this.eventosTipoEvento = eventosTipoEvento;
    }

    public BigDecimal getEventosId() {
        return eventosId;
    }

    public void setEventosId(BigDecimal eventosId) {
        this.eventosId = eventosId;
    }

    public BigInteger getEventosIdConjunto() {
        return eventosIdConjunto;
    }

    public void setEventosIdConjunto(BigInteger eventosIdConjunto) {
        this.eventosIdConjunto = eventosIdConjunto;
    }

    public String getEventosEstado() {
        return eventosEstado;
    }

    public void setEventosEstado(String eventosEstado) {
        this.eventosEstado = eventosEstado;
    }

    public Date getEventosFechaInicio() {
        return eventosFechaInicio;
    }

    public void setEventosFechaInicio(Date eventosFechaInicio) {
        this.eventosFechaInicio = eventosFechaInicio;
    }

    public Date getEventosFechaFin() {
        return eventosFechaFin;
    }

    public void setEventosFechaFin(Date eventosFechaFin) {
        this.eventosFechaFin = eventosFechaFin;
    }

    public BigInteger getEventosTipoEvento() {
        return eventosTipoEvento;
    }

    public void setEventosTipoEvento(BigInteger eventosTipoEvento) {
        this.eventosTipoEvento = eventosTipoEvento;
    }

    public String getEventosObservacion() {
        return eventosObservacion;
    }

    public void setEventosObservacion(String eventosObservacion) {
        this.eventosObservacion = eventosObservacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventosId != null ? eventosId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminEventos)) {
            return false;
        }
        AdminEventos other = (AdminEventos) object;
        if ((this.eventosId == null && other.eventosId != null) || (this.eventosId != null && !this.eventosId.equals(other.eventosId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.monkey.entities.AdminEventos[ eventosId=" + eventosId + " ]";
    }
    
}
