package com.hetzner.db.controller;

import com.hetzner.db.entities.Person;
import com.hetzner.db.repositories.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

  private final PersonRepository repository;

  @PostMapping
  public Person save(@RequestBody Person p) {
    return repository.save(p);
  }

  @GetMapping
  public List<Person> list() {
    return repository.findAll();
  }
}
