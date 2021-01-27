package com.rensilver.crudjavajpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rensilver.crudjavajpahibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
