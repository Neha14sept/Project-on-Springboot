/*package com.example.StudentCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<T, ID> {

}*/
package com.example.StudentCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentCrud.domain.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
