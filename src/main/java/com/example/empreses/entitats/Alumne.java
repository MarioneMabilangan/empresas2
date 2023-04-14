package com.example.empreses.entitats;

import jakarta.persistence.*;

@Entity
public class Alumne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String cognoms;

    private String cicle;

    private String modalitat;

    private String estatPractiques;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "empresa_cif")
    private Empresa empresa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public String getModalitat() {
        return modalitat;
    }

    public void setModalitat(String modalitat) {
        this.modalitat = modalitat;
    }

    public String getEstatPractiques() {
        return estatPractiques;
    }

    public void setEstatPractiques(String estatPractiques) {
        this.estatPractiques = estatPractiques;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public String getNombre() {
        return empresa.getNombre();
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
