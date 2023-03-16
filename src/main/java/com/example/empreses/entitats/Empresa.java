package com.example.empreses.entitats;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Empresa {
    @Id
    private String cif;

    private String nombre;

    private String direccion;

    @OneToMany(mappedBy = "empresa")
    private List<Alumne> alumnos;

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Alumne> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumne> alumnos) {
        this.alumnos = alumnos;
    }


}
