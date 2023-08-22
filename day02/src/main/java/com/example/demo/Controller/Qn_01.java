package com.example.demo.Controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Student_Names;

@RestController
public class Qn_01 {
	@Value("${name1}")
	private String str1;
	@Value("${name2}")
	private String str2;
	@GetMapping("welcome")
	public List<Student_Names> name() {
		return Arrays.asList(new Student_Names(str1),new Student_Names(str2));
	}
}
