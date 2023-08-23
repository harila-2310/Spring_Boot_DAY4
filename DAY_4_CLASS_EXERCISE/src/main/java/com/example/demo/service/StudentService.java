package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepo;
import com.example.demo.model.StudentEntity;

@Service
public class StudentService {

	@Autowired
	StudentRepo sr;
	
	public List<StudentEntity> saveinfo(List<StudentEntity> ss)
	{
		return (List<StudentEntity>) sr.saveAll(ss);
	}
	
	public List<StudentEntity> showinfo()
	{
		return sr.findAll();
	}
	public StudentEntity changeinfo(StudentEntity ss)
	{
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(StudentEntity ss)
	{           
		sr.delete(ss);
	}
	public void deleteid(int id)
	{           
		sr.deleteById(id);
	}
	public Optional<StudentEntity> getStudentById(int id) {
        return sr.findById(id);
    }
	
	public String updateinfobyid(int id,StudentEntity ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "updated";
		}
		else
		{
			return "Not Updated";
		}
	}
	
}
