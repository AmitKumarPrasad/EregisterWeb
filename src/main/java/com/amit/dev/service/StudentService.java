package com.amit.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.amit.dev.model.Student;
import com.amit.dev.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public void saveStudent(Student student) {
		repository.save(student);
	}

	public List<Student> getAllStudent() {
		return repository.findAll();
	}

	public void deleteStudent(Long id) {
		repository.deleteById(id);
	}

	public Student getStudentById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public Page<Student> getStudentsPaged(int pageno) {
		return repository.findAll(PageRequest.of(pageno, 2, Sort.by("firstNAme")));
	}

	public Page<Student> getStudentByStudentNumber(String stNo, int pageno) {
		// return repository.findAllByStudentNumberContains(stNo);
		return repository.findAllByStudentNumberContainingOrFirstNameContainingOrLastNameContaining(stNo, stNo, stNo,
				PageRequest.of(pageno, 2));

	}

}
