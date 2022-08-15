package Login.BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @Column(name = "idPersona",nullable = false)
    private Long idPersona;

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }
    public String Universidad;
    public String  UniversidadFecha;
    public String UniversidadLugar;
    public String  Curso1;
    public String Curso1Fecha;
    public String Curso1Lugar;
    public String Curso2;
    public String Curso2Fecha;
    public String  Curso2Lugar;
    public String  Colegio;
    public String  ColegioFecha;
    public String  ColegioLugar;
    public String descripcion;
    public String descripcion1;
    public String descripcion2;

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String universidad) {
        Universidad = universidad;
    }

    public String getUniversidadFecha() {
        return UniversidadFecha;
    }

    public void setUniversidadFecha(String universidadFecha) {
        UniversidadFecha = universidadFecha;
    }

    public String getUniversidadLugar() {
        return UniversidadLugar;
    }

    public void setUniversidadLugar(String universidadLugar) {
        UniversidadLugar = universidadLugar;
    }

    public String getCurso1() {
        return Curso1;
    }

    public void setCurso1(String curso1) {
        Curso1 = curso1;
    }

    public String getCurso1Fecha() {
        return Curso1Fecha;
    }

    public void setCurso1Fecha(String curso1Fecha) {
        Curso1Fecha = curso1Fecha;
    }

    public String getCurso1Lugar() {
        return Curso1Lugar;
    }

    public void setCurso1Lugar(String curso1Lugar) {
        Curso1Lugar = curso1Lugar;
    }

    public String getCurso2() {
        return Curso2;
    }

    public void setCurso2(String curso2) {
        Curso2 = curso2;
    }

    public String getCurso2Fecha() {
        return Curso2Fecha;
    }

    public void setCurso2Fecha(String curso2Fecha) {
        Curso2Fecha = curso2Fecha;
    }

    public String getCurso2Lugar() {
        return Curso2Lugar;
    }

    public void setCurso2Lugar(String curso2Lugar) {
        Curso2Lugar = curso2Lugar;
    }

    public String getColegio() {
        return Colegio;
    }

    public void setColegio(String colegio) {
        Colegio = colegio;
    }

    public String getColegioFecha() {
        return ColegioFecha;
    }

    public void setColegioFecha(String colegioFecha) {
        ColegioFecha = colegioFecha;
    }

    public String getColegioLugar() {
        return ColegioLugar;
    }

    public void setColegioLugar(String colegioLugar) {
        ColegioLugar = colegioLugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion1() {
        return descripcion1;
    }

    public void setDescripcion1(String descripcion1) {
        this.descripcion1 = descripcion1;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }
}


