package com.amit.dev.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student_TBL")
@ToString
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long studentId;
	
	@Column(nullable = false)
	private String studentNumber;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String middleName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = true)
	private double cgpa;
	
	@Column(nullable = true)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate enrollmentDate;
	
	@Column(nullable = false)
	private String isInternational;

}
