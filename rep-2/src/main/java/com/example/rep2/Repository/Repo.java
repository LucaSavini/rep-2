package com.example.rep2.Repository;

import com.example.rep2.Entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Questa è una descrizione"))
public interface Repo extends JpaRepository<ProgrammingLanguage, Long> {
}
