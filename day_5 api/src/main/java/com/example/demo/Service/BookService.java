package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.BookRepo;
import com.example.demo.model.BookEntity;

@Service
public class BookService {

	@Autowired
	BookRepo br;
	public List<BookEntity> showinfo()
	{
		return br.findAll();
	}
	public List<BookEntity> postinfo(List<BookEntity> be)
	{
		return br.saveAll(be);
	}
	
	public BookEntity putinfo(BookEntity be)
	{
		return br.saveAndFlush(be);
	}
	
	public void deleteinfo(BookEntity be)
	{
		br.delete(be);
	}
	
	public Optional<BookEntity> getbyid(int id)
	{
		return br.findById(id);
	}
	
	public void deletebyid(int id)
	{
		br.deleteById(id);
	}
	
}
