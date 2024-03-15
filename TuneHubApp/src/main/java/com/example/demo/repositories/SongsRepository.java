package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Songs;
import com.example.demo.entities.Users;

public interface SongsRepository extends JpaRepository<Songs,Integer>
{
	public Songs findByName(String name);
}