package com.hetzner.db.repositories;

import com.hetzner.db.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}