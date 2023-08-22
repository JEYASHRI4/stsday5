package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.Bookser;

@RestController
public class Bookcon {
@Autowired
Bookser se;
@PostMapping("add")
public Book adddetails(@RequestBody Book b) {
	return se.saveinfo(b);
}
@GetMapping("disp")
public List<Book> show(){
	return se.show();
}
@PutMapping("change")
public Book Update(@RequestBody Book b) {
	return se.updateinfo(b);
}
@DeleteMapping("del")
public void Del(@RequestBody Book b) {
	se.del(b);
}
@DeleteMapping("del/{id}")
public void deid(@PathVariable int id) {
	se.deleteid(id);
}
}
