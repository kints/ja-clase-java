package BaseDeDatos.model;

import java.sql.Date;
import java.util.UUID;

public class Alumno {

    private UUID id;
    private String matricula;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento;
    private String tipoSangre;
    private String curp;
    private String genero;
    private boolean activo;
    private Date fechaAlta;
    private Date fechaBaja;

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Alumno(String matricula, String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento,
            String tipoSangre, String curp, String genero) {
        this.id = UUID.randomUUID();
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.curp = curp;
        this.genero = genero;
        this.activo = true; // Todos los alumnos son activos por defecto
    }

    public UUID getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public String getCurp() {
        return curp;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Alumno [id=" + id + ", matricula=" + matricula + ", nombre=" + nombre + ", apellidoPaterno="
                + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", fechaNacimiento=" + fechaNacimiento
                + ", tipoSangre=" + tipoSangre + ", curp=" + curp + ", genero=" + genero + ", activo=" + activo + "]";
    }

    public void setId(UUID id) {
        this.id = id;
    }
}