	package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService sser;
	
	@PostMapping("post")
	public List<StudentEntity> save(@RequestBody List<StudentEntity> ss)
	{
		return sser.saveinfo(ss);
	}
	
	@GetMapping("show")
	public List<StudentEntity> show()
	{
		return sser.showinfo();
	}
	
	@PutMapping("update")
	public StudentEntity update(@RequestBody StudentEntity ss)
	{
		return sser.changeinfo(ss);
	}
	
	@DeleteMapping("delete")
	public String delete(StudentEntity ss)
	{
		sser.deleteinfo(ss);
		return "Deleted successfully";
	}
	
	@DeleteMapping("del/{id}")
	public String deleteMyId(@PathVariable int id)
	{
		sser.deleteid(id);
		return "id: "+id+" is deleted successfully";
	}
	

     @GetMapping("get/{id}")  // New mapping for retrieving student by ID
     public Optional<StudentEntity> showid(@PathVariable int id)
     {
    	 return sser.getStudentById(id);
     }
     
     @PutMapping("update/{id}")
     public String modify(@PathVariable int id,@RequestBody StudentEntity ss)
     {
     	return sser.updateinfobyid(id, ss);
     }
}

