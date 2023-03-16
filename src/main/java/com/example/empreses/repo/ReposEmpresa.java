package com.example.empreses.repo;

import com.example.empreses.entitats.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "empresas", path = "empresas")
public interface ReposEmpresa extends JpaRepository<Empresa, String> {

}


