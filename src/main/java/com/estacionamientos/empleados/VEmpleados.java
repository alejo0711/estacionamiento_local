/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estacionamientos.empleados;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import util.Util;

/**
 *
 * @author Nermil
 */
@Entity
@Table(name = "v_empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VEmpleados.findAll",
            query = "SELECT v FROM VEmpleados v")
})
public class VEmpleados implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_EMPLEADO")
    private Long idEmpleado;

    @Column(name = "ID_ROL")
    private Integer idRol;

    @Column(name = "ID_ZONA")
    private Integer idZona;

    @Column(name = "ID_ESTACIONAM")
    private Integer idEstacionam;

    @Column(name = "FECALTA")
    private String fecAlta;

    @Column(name = "FECBAJA")
    private String fecBaja;

    @Column(name = "NB_EMPLEADO")
    private String nbEmpleado;

    @Column(name = "AP_PATERNO")
    private String apPaterno;

    @Column(name = "AP_MATERNO")
    private String apMaterno;

    @Column(name = "CTABANCARIA")
    private String ctaBancaria;

    @Column(name = "NOSEGUROSOCIAL")
    private String noSegurosocial;

    @Column(name = "SUELDOQUINCENAL")
    private Double sueldoQuincenal;

    @Column(name = "SALARIOBASE")
    private Double salarioBase;

    @Column(name = "ID_BANCO")
    private Integer idBanco;

    @Column(name = "BONOPRODUC")
    private Double bonoProduc;

    @Column(name = "FECLABORAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecLaboral;

    @Column(name = "CAJAAHORRO")
    private Double cajaAhorro;

    @Column(name = "AHORROINDEPENDIENTE")
    private Double ahorroIndependiente;

    @Column(name = "TIPO_EMPLEADO")
    private String tipoEmpleado;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "COLONIA")
    private String colonia;

    @Column(name = "DELEGACION")
    private String delegacion;

    @Column(name = "REFERENCIA")
    private String referencia;

    @Column(name = "TEL")
    private String tel;

    @Column(name = "FECHANACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;

    @Column(name = "NB_ROL")
    private String nbRol;

    @Column(name = "NB_ZONA")
    private String nbZona;

    @Column(name = "NB_ESTACIONAM")
    private String nbEstacionam;

    @Column(name = "NB_BANCO")
    private String nbBanco;

    public VEmpleados() {
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    public Integer getIdEstacionam() {
        return idEstacionam;
    }

    public void setIdEstacionam(Integer idEstacionam) {
        this.idEstacionam = idEstacionam;
    }

    public String getFecAlta() {
        return fecAlta;
    }

    public void setFecAlta(String fecAlta) {
        this.fecAlta = fecAlta;
    }

    public String getFecBaja() {
        return fecBaja;
    }

    public void setFecBaja(String fecBaja) {
        this.fecBaja = fecBaja;
    }

    public String getNbEmpleado() {
        return nbEmpleado;
    }

    public void setNbEmpleado(String nbEmpleado) {
        this.nbEmpleado = nbEmpleado;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getCtaBancaria() {
        return ctaBancaria;
    }

    public void setCtaBancaria(String ctaBancaria) {
        this.ctaBancaria = ctaBancaria;
    }

    public String getNoSegurosocial() {
        return noSegurosocial;
    }

    public void setNoSegurosocial(String noSegurosocial) {
        this.noSegurosocial = noSegurosocial;
    }

    public Double getSueldoQuincenal() {
        return sueldoQuincenal;
    }

    public void setSueldoQuincenal(Double sueldoQuincenal) {
        this.sueldoQuincenal = sueldoQuincenal;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Integer getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
    }

    public Double getBonoProduc() {
        return bonoProduc;
    }

    public void setBonoProduc(Double bonoProduc) {
        this.bonoProduc = bonoProduc;
    }

    public Date getFecLaboral() {
        return fecLaboral;
    }
    
    public String getFormatoFecLaboral(){
        String formato = "";
        if(this.fecLaboral != null){
            formato = Util.parseFecha(this.fecLaboral, "dd/MM/yyyy");
        }
        return formato;
    }
    
    public void setFecLaboral(Date fecLaboral) {
        this.fecLaboral = fecLaboral;
    }

    public Double getCajaAhorro() {
        return cajaAhorro;
    }

    public void setCajaAhorro(Double cajaAhorro) {
        this.cajaAhorro = cajaAhorro;
    }

    public Double getAhorroIndependiente() {
        return ahorroIndependiente;
    }

    public void setAhorroIndependiente(Double ahorroIndependiente) {
        this.ahorroIndependiente = ahorroIndependiente;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNbRol() {
        return nbRol;
    }

    public void setNbRol(String nbRol) {
        this.nbRol = nbRol;
    }

    public String getNbZona() {
        return nbZona;
    }

    public void setNbZona(String nbZona) {
        this.nbZona = nbZona;
    }

    public String getNbEstacionam() {
        return nbEstacionam;
    }

    public void setNbEstacionam(String nbEstacionam) {
        this.nbEstacionam = nbEstacionam;
    }

    public String getNbBanco() {
        return nbBanco;
    }

    public void setNbBanco(String nbBanco) {
        this.nbBanco = nbBanco;
    }

}
