package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentDetails;

public interface StudentRepo extends JpaRepository<StudentDetails, Integer> {

}
