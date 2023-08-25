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

import com.example.demo.Service.BookService;
import com.example.demo.model.BookEntity;

@RestController
public class BookController {

	@Autowired
	BookService bs;
	
	@GetMapping("show")
	public List<BookEntity> show()
	{
		return bs.showinfo();
	}
	
	@GetMapping("show/{id}")
	public Optional<BookEntity> showbyid(@PathVariable int id)
	{
		return bs.getbyid(id);
	}
	
	@PostMapping("post")
	public List<BookEntity> postt(@RequestBody List<BookEntity> be)
	{
		return bs.postinfo(be);
	}
	
	@PutMapping("update")
	public BookEntity update(@RequestBody BookEntity be)
	{
		return bs.putinfo(be);
	}
	
	@DeleteMapping("delete")
	public String delete(@RequestBody BookEntity be)
	{
		bs.deleteinfo(be);
		return "deleted Successfully";
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteid(@PathVariable int id)
	{
		bs.deletebyid(id);
		return "id: "+id+" is deleted successfully";
	}
	
}
