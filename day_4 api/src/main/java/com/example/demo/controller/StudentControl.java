package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentDetails;
import com.example.demo.service.StudentService;

@RestController
public class StudentControl {

	@Autowired
	StudentService sse;
	
  @PostMapping("addone")
  public StudentDetails addOne(@RequestBody StudentDetails ss)
  {
	  return sse.saveone(ss);
  }
  
  @PostMapping("addmany")
 public List<StudentDetails> addMany(@RequestBody List<StudentDetails> ss)
 {
	  return  sse.saveall(ss);
 }
  
  @GetMapping("show")
  public List<StudentDetails> display()
  {
	  return sse.showall();
  }
  
  @PutMapping("update")
  public StudentDetails modify(@RequestBody StudentDetails ss)
  {
	  return sse.changeone(ss);
  }
  
  @DeleteMapping("delete")
  public String remove(StudentDetails ss)
  {
	  sse.deleteone(ss);
	  return "Deleted Successfully";
  }
  
  @DeleteMapping("delete/{id}")
  public String  removeid(@PathVariable int id)
  {
	  sse.deleteid(id);
	  return "Deleted Successfully";
  }
  
  @DeleteMapping("deleteparam")
  public String removepid (@RequestParam int id)
  {
	  sse.deleteid(id);
	  return "Deleted Successfully";
  }
  
  @GetMapping("show/{id}")
   public Optional<StudentDetails>  showid(@PathVariable int id)
   {
	  return sse.showbyid(id);
   }
  @PutMapping("updatebyid/{id}")
  public String modifybyid(@PathVariable int id,@RequestBody StudentDetails ss)
  {
	  return sse.updatebyid(id, ss);
  }
  
}
