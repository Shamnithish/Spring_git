package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.User;

public interface Userdao extends CrudRepository<User, Integer>{

}
