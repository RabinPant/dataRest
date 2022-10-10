package com.springRest.repository;

import com.springRest.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "student-api",path="student-api")
public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student>findBySection(String section);

}
