package com.amit.dev.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amit.dev.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	Page<Student> findAllByStudentNumberContaining(String s, Pageable pageable);

	Page<Student> findAllByStudentNumberContainingOrFirstNameContainingOrLastNameContaining(String s, String s1,
			String s2, Pageable pageable);

}
