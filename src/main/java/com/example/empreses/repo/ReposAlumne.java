package com.example.empreses.repo;

import com.example.empreses.entitats.Alumne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "alumnes", path = "alumnes")
public interface ReposAlumne extends JpaRepository<Alumne, Long> {
}
