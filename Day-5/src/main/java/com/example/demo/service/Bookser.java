package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.Bookrep;

@Service
public class Bookser {
@Autowired
 Bookrep re;
public Book saveinfo(Book b) {
	return re.save(b);
}
public List<Book> show(){
	return re.findAll();
}
public Book updateinfo(Book b) {
	return re.saveAndFlush(b);
}
public void del(Book b) {
	re.delete(b);
}
public void deleteid(int id) {
	   re.deleteById(id);
}
}
